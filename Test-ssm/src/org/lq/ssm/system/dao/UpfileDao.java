package org.lq.ssm.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Upfile;




public interface UpfileDao {

	int add(Upfile u);

    // 得到所有上传文件的信息，需要分页
    List<Upfile> getAll();

    Upfile find(@Param("id")String id);

    int delete(String id);

    int update(Upfile upfile);
	    

}

