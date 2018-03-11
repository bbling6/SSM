package org.lq.ssm.teaching.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.entity.Attendance;
import org.lq.ssm.teaching.dao.AttendanceDao;
import org.lq.ssm.teaching.service.AttendanceService;
import org.springframework.stereotype.Service;
@Service("attendanceServiceImpl")
public class AttendanceServiceImpl implements AttendanceService {
	@Resource(name="attendanceDao")
	private AttendanceDao attendanceDao;
	public void setAttendanceDao(AttendanceDao attendanceDao) {
		this.attendanceDao = attendanceDao;
	}

	@Override
	public boolean delete(Integer id) {
		return attendanceDao.delete(id)>0;
	}

	@Override
	public List<Attendance> findAll() {
		return attendanceDao.findAll();
	}

	@Override
	public List<Attendance> findByName(String name) {
		return attendanceDao.findByName(name);
	}

	@Override
	public boolean save(Attendance attendance) {
		return attendanceDao.save(attendance)>0;
	}

	@Override
	public boolean update(Attendance attendance) {
		return attendanceDao.update(attendance)>0;
	}

	@Override
	public Attendance findById(Integer id) {
		return attendanceDao.findById(id);
	}

}
