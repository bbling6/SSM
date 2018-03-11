package org.lq.ssm.classinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Classes;
/**
 * 班级管理
 * @author lanqiao
 *
 */
public interface ClassesDao {
	
	
	public List<Classes> findAll(); //查询所有的班级
	
	public int save(Classes c); 	//添加班级
	
	public int delete(int id);		 //删除班级
	
	public int update(Classes c);		//修改班级
	
	public List<Classes> findByName(@Param("name")String name); //通过名称查新班级
	
	public Classes findById(@Param("cid") Integer cid);
}
