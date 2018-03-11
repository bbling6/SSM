package org.lq.ssm.classinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.ClassRoom;
/**
 * 教室管理
 * @author lanqiao
 *
 */
public interface ClassRoomDao {
	 
	public List<ClassRoom> findAll(); //查询所有教室
	
	public int delete(int id); //删除
	
	public int update(ClassRoom c);	//修改
	
	public int save(ClassRoom c);	//保存
	
	public List<ClassRoom> findByName(@Param("name")String name); //通过名称查询
	
	public ClassRoom findById(@Param("id")int id);
	
	
}
