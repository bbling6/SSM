package org.lq.ssm.system.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.FileUploadBase.FileSizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.lq.ssm.entity.Upfile;

public class WebUtils {
	
	public static Upfile doUpload(HttpServletRequest request, String uppath) throws FileSizeLimitExceededException {

        Upfile bean = new Upfile();

        try {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            // 设置缓存目录
            factory.setRepository(new File(request.getSession().getServletContext().getRealPath("/WEB-INF/temp")));

            ServletFileUpload upload = new ServletFileUpload(factory);
            upload.setHeaderEncoding("UTF-8");
            // 限制单个文件大小不能超过500M
            upload.setFileSizeMax(1000*1000*500);
            List<FileItem> list = upload.parseRequest(request);
            for (FileItem item : list) {
                if (item.isFormField()) {
                    String name = item.getFieldName(); // username="aaa"  description="......"
                    String value = item.getString("UTF-8");
                    BeanUtils.setProperty(bean, name, value);
                } else {
                    // 得到上传文件名
                    String filename = item.getName().substring(item.getName().lastIndexOf("\\")+1);
                    // 得到文件的保存名称
                    String uuidname = generateFilename(filename);
                    // 得到文件的保存路径
                    String savepath = generateSavePath(uppath, uuidname);

                    InputStream in = item.getInputStream();
                    int len = 0;
                    byte[] buffer = new byte[1024];
                    FileOutputStream out = new FileOutputStream(savepath + "\\" + uuidname);
                    while ((len=in.read(buffer)) > 0) {
                        out.write(buffer, 0, len);
                    }
                    in.close();
                    out.close();

                    item.delete();

                    bean.setFilename(filename);
                    bean.setId(UUID.randomUUID().toString());
                    bean.setSavepath(savepath);
                    bean.setUptime(new Date());
                    bean.setUuidname(uuidname);
                }
            }
            return bean;
        } catch (FileUploadBase.FileSizeLimitExceededException e) { // 必须得这样写，抛编译时异常
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static String generateFilename(String filename) {
        // 得到文件扩展名
        String ext = filename.substring(filename.lastIndexOf(".")+1);
        return UUID.randomUUID().toString() + "." + ext;
    }

    private static String generateSavePath(String path, String fileName) {
        int hashCode = fileName.hashCode(); // 得到字符串在内存中的地址，如121221
        int dir1 = hashCode & 15; // int dir1 = hashCode & 0xf;
        int dir2 = (hashCode >> 4) & 0xf;

        String savePath = path + File.separator + dir1 + File.separator + dir2;
        File file = new File(savePath);
        if (!file.exists()) {
            file.mkdirs(); // 创建多级目录用mkdirs()方法
        }
        return savePath;
    }

}
