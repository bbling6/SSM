package org.lq.ssm.student.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.entity.StudentCommunicate;
import org.lq.ssm.student.dao.CommunicateDao;
import org.lq.ssm.student.service.CommunicateBiz;
import org.springframework.stereotype.Service;

@Service("communicateBizImpl")
public class CommunicateBizImpl implements CommunicateBiz {

	@Resource(name="communicateDao")
	private CommunicateDao communicateDao;
	
	@Override
	public boolean delete(int id) {
		return communicateDao.delete(id)>0;
	}

	@Override
	public List<StudentCommunicate> findAll() {
		return communicateDao.findAll();
	}

	@Override
	public StudentCommunicate findById(int id) {
		return communicateDao.findById(id);
	}

	@Override
	public boolean save(StudentCommunicate c) {
		return communicateDao.save(c)>0;
	}

	@Override
	public boolean update(StudentCommunicate c) {
		return communicateDao.update(c)>0;
	}

	public void setCommunicateDao(CommunicateDao communicateDao) {
		this.communicateDao = communicateDao;
	}

	@Override
	public List<StudentCommunicate> findByName(String name) {
		return communicateDao.findByName(name);
	}

	
}
