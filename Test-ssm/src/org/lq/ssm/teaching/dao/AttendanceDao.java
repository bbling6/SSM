package org.lq.ssm.teaching.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Attendance;

public interface AttendanceDao {
	/**
	 * ¿¼ÇÚ½Ó¿Ú
	 * @param attendance
	 * @return
	 */
	public int save(Attendance attendance);
	public int update(Attendance attendance);
	public int delete(@Param("aid")Integer id);
	public List<Attendance> findAll();
	public Attendance findById(@Param("id")Integer id);
	public List<Attendance> findByName(@Param("name")String name);
}
