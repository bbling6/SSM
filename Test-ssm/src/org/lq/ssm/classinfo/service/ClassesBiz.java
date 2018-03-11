package org.lq.ssm.classinfo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Classes;

public interface ClassesBiz {
	
	public List<Classes> findAll(); //查询所有的班级
	
	
	public List<Classes> findByName(String name); //通过名称查新班级
	
	public int save(Classes c); //保存
	
	public int delete(int id);		 //删除班级
	
	public int update(Classes c);		//修改班级
	
	public Classes findById(int cid);
	
	
}
