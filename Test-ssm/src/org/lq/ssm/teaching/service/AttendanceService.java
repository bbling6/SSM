package org.lq.ssm.teaching.service;

import java.util.List;


import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Attendance;

public interface AttendanceService {
	public boolean save(Attendance attendance);
	public boolean update(Attendance attendance);
	public boolean delete(Integer id);
	public List<Attendance> findAll();
	public List<Attendance> findByName(String name);
	public Attendance findById(Integer id);
}
