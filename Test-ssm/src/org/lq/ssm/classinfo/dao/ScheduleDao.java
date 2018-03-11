package org.lq.ssm.classinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Schedule;

/**
 * 课程表管理
 * @author lanqiao
 *
 */
public interface ScheduleDao {
	
	public List<Schedule> findAll(); //查询所有的课程表
	
	public List<Schedule> findByName(@Param("name")String name); //通过名称查课程表
	
	public int save(Schedule c); //保存
	
	public int delete(int id);		 //删除课程表
	
	public int update(Schedule c);		//修改课程表
	
	public int findById(@Param("id")int id);
}
