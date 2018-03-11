package org.lq.ssm.student.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Student;

public interface StudentBiz {

	public List<Student> findAll();
	
	public boolean save(Student s);
	
	public boolean delete(int id);
	
	public Student findById(int id);
	
	public boolean update(Student s);
	
	public List<Student> findByName(String name);
	
	public List<Student> getstubypay(String ispay);

	public List<Student> findByCon(String sname,Integer state);
}
