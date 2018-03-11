package org.lq.ssm.classinfo.service;

import java.util.List;

import org.lq.ssm.entity.Subject;


public interface SubjectBiz {
	
	public List<Subject> findAll(); //查询所有
	
	public List<Subject> findByName(String name); //通过名称
	
	public int save(Subject c); //保存
	
	public int delete(int id);		 //删除
	
	public int update(Subject c);		//修改
	
	public Subject findById(int id);//id获取对象
}
