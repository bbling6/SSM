package org.lq.ssm.classinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.classinfo.dao.SubjectDao;
import org.lq.ssm.classinfo.service.SubjectBiz;
import org.lq.ssm.entity.Subject;
import org.springframework.stereotype.Service;

@Service("subjectAction")
public class SubjectBizImpl implements SubjectBiz {
	
	@Resource(name="subjectDao")
	private SubjectDao subjectDao;
	
	@Override
	public int delete(int id) {
		return subjectDao.delete(id);
	}

	@Override
	public List<Subject> findAll() {
		return subjectDao.findAll();
	}

	
	@Override
	public int save(Subject c) {
		return subjectDao.save(c);
	}

	@Override
	public int update(Subject c) {
		return subjectDao.updete(c);
	}

	@Override
	public Subject findById(int id) {
		return subjectDao.findById(id);
	}


	@Override
	public List<Subject> findByName(String name) {
		return subjectDao.findByName(name);
	}

	

	public void setSubjectDao(SubjectDao subjectDao) {
		this.subjectDao = subjectDao;
	}
	
	

	
	
}
