package org.lq.ssm.system.service;

import java.util.List;

import org.lq.ssm.entity.Upfile;

public interface UpfileBiz {
	
	int add(Upfile u);

    // 得到所有上传文件的信息，需要分页
    List<Upfile> getAll();

    Upfile find(String id);

    int delete(String id);

    int update(Upfile upfile);

}
