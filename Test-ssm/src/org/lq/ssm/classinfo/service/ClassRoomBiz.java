package org.lq.ssm.classinfo.service;

import java.util.List;

import org.lq.ssm.entity.ClassRoom;

public interface ClassRoomBiz {
	
	public List<ClassRoom> findAll();	//查询所有教室
	
	public List<ClassRoom> findByName(String name);	//通过名称查询教室
	
	public int delete(int id); //删除
	
	public int update(ClassRoom c);	//修改
	
	public int save(ClassRoom c);	//保存
	
	public ClassRoom findById(int id);
}
