package org.lq.ssm.classinfo.service;

import java.util.List;

import org.lq.ssm.entity.Schedule;


public interface ScheduleBiz {
	
	public List<Schedule> findAll(); //查询所有的课程表
	
	public List<Schedule> findByName(String name); //通过名称查新课程表
	
	public int save(Schedule c); //保存
	
	public int delete(int id);		 //删除课程表
	
	public int update(Schedule c);		//修改课程表
	
	public int findById(int id);
}
