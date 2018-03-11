package org.lq.ssm.classinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.classinfo.dao.ClassRoomDao;
import org.lq.ssm.classinfo.service.ClassRoomBiz;
import org.lq.ssm.entity.ClassRoom;
import org.springframework.stereotype.Service;


@Service("classRoomAction")
public class ClassRoomBizImpl implements ClassRoomBiz {
	
	@Resource(name="classRoomDao")
	private ClassRoomDao classRoomDao;

	@Override
	public List<ClassRoom> findAll() {
		return classRoomDao.findAll();
	}

	@Override
	public List<ClassRoom> findByName(String name) {
		return classRoomDao.findByName(name);
	}


	@Override
	public int delete(int id) {
		return classRoomDao.delete(id);
	}

	@Override
	public int save(ClassRoom c) {
		return classRoomDao.save(c);
	}

	@Override
	public int update(ClassRoom c) {
		return classRoomDao.update(c);
	}

	@Override
	public ClassRoom findById(int id) {
		return classRoomDao.findById(id);
	}
	
	
	public void setClassRoomDao(ClassRoomDao classRoomDao) {
		this.classRoomDao = classRoomDao;
	}

	

}
