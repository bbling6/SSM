package org.lq.ssm.student.service;

import java.util.List;

import org.lq.ssm.entity.StudentGrade;

public interface GradeBiz {

	public List<StudentGrade> findAll();

	public boolean save(StudentGrade g);

	public boolean delete(int id);

	public boolean update(StudentGrade g);

	public StudentGrade findById(int id);
	
	public List<StudentGrade> findByName(String name);

}
