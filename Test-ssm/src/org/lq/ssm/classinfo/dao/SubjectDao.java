package org.lq.ssm.classinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Subject;

/**
 * 科目管理
 * @author lanqiao
 *
 */
public interface SubjectDao {
	
	public List<Subject> findAll();
	
	public int save(Subject s);	//保存
	
	public int delete(Integer id);	//删除
	
	public int updete(Subject s);	//修改
	
	public List<Subject> findByName(@Param("name")String name);//通过名称查询科目信息
	
	public Subject findById(@Param("id")int id);//通过id获取一个对象
	
	
}
