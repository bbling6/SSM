package org.lq.ssm.system.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.lq.ssm.entity.Staff;
import org.lq.ssm.entity.Upfile;
import org.lq.ssm.system.service.StaffBiz;
import org.lq.ssm.system.service.UpfileBiz;
import org.lq.ssm.system.utils.FileTypeTest;
import org.lq.ssm.system.utils.WebUtils;
import org.lq.ssm.util.Sendmail;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//处理文件的上传和下载，控制器
@Controller
@RequestMapping("upfile.do")
public class UpfileController {
	
		@Resource(name="UpfileBizImpl")
	   private 	UpfileBiz upfileBiz;
		
		public void setUpfileBiz(UpfileBiz upfileBiz) {
			this.upfileBiz = upfileBiz;
		} 
		
		//上传文件
		@RequestMapping(params="add")
		public String upfileAdd(HttpServletRequest request){
			
			System.out.println("进到add中");
			if (!ServletFileUpload.isMultipartContent(request)) {
	            request.setAttribute("fileMessage", "不支持的操作");
	    //        request.getRequestDispatcher("/message.jsp").forward(request, response);
	            System.out.println("不支持");
	            return "view/filework/upfile";
	        }

	        try {
	            /*
	             * WebUtils工具类内部会从request里面取数据，把上传文件保存下来，
	             * 并且还会把上传文件信息封装到一个Upfile对象里面返回给你。
	             */
	            String savepath = request.getSession().getServletContext().getRealPath("/WEB-INF/upload");
	            Upfile upfile = WebUtils.doUpload(request, savepath);

	            upfileBiz.add(upfile);


	            request.setAttribute("fileMessage", "上传成功！！！");
	        } catch (FileUploadBase.FileSizeLimitExceededException e) {
	            // 明显知道是什么异常(在我预期的范围之内)，就没必要记录异常
	            request.setAttribute("fileMessage", "文件不能超过500M！！！");
	        } catch (Exception e) {
	            e.printStackTrace();
	            request.setAttribute("fileMessage", "上传失败！！！");
	        }
	     //   request.getRequestDispatcher("/message.jsp").forward(request, response);
	        
	        return "view/filework/upfile";
	    }
		
		//显示下载列表
		@RequestMapping(params="getall")
		public String upfileGetall(Model m){
			
        	List<Upfile> list = upfileBiz.getAll();
        	m.addAttribute("list", list);
        	return "view/filework/listfile";
        	
		}
		
		
		//播放视频文件操作
		@RequestMapping(params="play")
		public String play(Model m){
		
             
	
			//可播放文件的允许类型
            List<String> p=new ArrayList<String>();
            p.add("rmvb");
            p.add("avi");
            p.add("mp4");
            p.add("flv");
            p.add("wmv");
            p.add("wav");
            p.add("mp3");
            
            //可播放列表
            List<Upfile> playList=new ArrayList<Upfile>();
            
            
            //得到所有文件
			List<Upfile> up = upfileBiz.getAll();
            
            //判断是否是视频文件
			if(up.size()>0){
            for (Upfile upfile : up) {
            	
            	String playPath=upfile.getSavepath() + "\\" + upfile.getUuidname();
            	File file= new File(playPath);
            	 
            	// System.out.println(playPath);
        		//System.out.println(FileTypeTest.getFileByFile(file));
        		
        		if(file.exists() && p.contains(FileTypeTest.getFileByFile(file))){
        			playList.add(upfile);
        		}
        		
        	
			}
            }

            m.addAttribute("playFile", playList);
            System.out.println("最后的文件时"+playList);
            
        //    String playPath=upfile.getSavepath() + "\\" + upfile.getUuidname();
            
			return "view/filework/playFileList";
		}
			
		
		
		//下载操作
		@RequestMapping(params="download")
		public String upfileDown(String id,HttpServletRequest request,HttpServletResponse response){
			
        	System.out.println("id="+id);
        	
            Upfile upfile = upfileBiz.find(id);

            File file = new File(upfile.getSavepath() + "\\" + upfile.getUuidname());

            /*
             * 删除文件，要删除硬盘上的文件，还要把数据库的记录给删除掉
             * 
             * file.delete();
             */
            if (!file.exists()) {
                request.setAttribute("fileMessage", "下载资源已被删除！！！");
        //        request.getRequestDispatcher("/message.jsp").forward(request, response);
                return "view/filework/fileMessage";
            }
            
            
            FileInputStream in=null;
            OutputStream out=null;
            try {
	
            response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(upfile.getFilename(), "UTF-8"));

             in= new FileInputStream(file);
            int len = 0;
            byte[] buffer = new byte[1024];
             out= response.getOutputStream();
            while ((len=in.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
            } catch (Exception e) {
            	request.setAttribute("fileMessage", "下载失败！！！");
            	return "view/filework/fileMessage";
            }finally{
            	try {
					in.close();
					out.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
            	
            }
            
            return "view/filework/listfile";
        	
		}
		
		
		
		
		
}


