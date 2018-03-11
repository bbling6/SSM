package org.lq.ssm.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.system.dao.StaffDao;
import org.lq.ssm.system.dao.UpfileDao;
import org.lq.ssm.system.service.UpfileBiz;
import org.lq.ssm.entity.Upfile;
import org.springframework.stereotype.Service;
@Service("UpfileBizImpl")
public class UpfileBizImpl implements UpfileBiz{
	
	@Resource(name="upfileDao")
	private UpfileDao upfileDao;
	
	public void setUpfileDao(UpfileDao upfileDao) {
		this.upfileDao = upfileDao;
	}
	
	@Override
    public int add(Upfile u) {
		
		return upfileDao.add(u);
    }

    // 得到所有上传文件的信息，需要分页
    @Override
    public List<Upfile> getAll() {

        return upfileDao.getAll();

    }

    @Override
    public Upfile find(String id) {

        return upfileDao.find(id);

    }

    @Override
    public int delete(String id) {
    	
    	return upfileDao.delete(id);

    }

    @Override
    public int update(Upfile upfile) {
    	return upfileDao.update(upfile);

    }

}
