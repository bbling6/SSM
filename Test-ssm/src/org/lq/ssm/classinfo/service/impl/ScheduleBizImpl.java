package org.lq.ssm.classinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.classinfo.dao.ScheduleDao;
import org.lq.ssm.classinfo.service.ScheduleBiz;
import org.lq.ssm.entity.Schedule;
import org.springframework.stereotype.Service;

@Service("scheduleAction")
public class ScheduleBizImpl implements ScheduleBiz{
	
	@Resource(name="scheduleDao")
	private ScheduleDao scheduleDao;
	
	@Override
	public int delete(int id) {
		return scheduleDao.delete(id);
	}

	@Override
	public List<Schedule> findAll() {
		return scheduleDao.findAll();
	}

	@Override
	public List<Schedule> findByName(String name) {
		return scheduleDao.findByName(name);
	}

	@Override
	public int save(Schedule c) {
		return scheduleDao.save(c);
	}

	@Override
	public int update(Schedule c) {
		return scheduleDao.update(c);
	}

	
	public void setScheduleDao(ScheduleDao scheduleDao) {
		this.scheduleDao = scheduleDao;
	}

	@Override
	public int findById(int id) {
		return scheduleDao.findById(id);
	}
	
	
}
