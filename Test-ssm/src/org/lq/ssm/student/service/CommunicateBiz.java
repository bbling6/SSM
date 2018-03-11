package org.lq.ssm.student.service;

import java.util.List;

import org.lq.ssm.entity.StudentCommunicate;

public interface CommunicateBiz {

	public List<StudentCommunicate> findAll();

	public boolean save(StudentCommunicate c);

	public boolean delete(int id);

	public boolean update(StudentCommunicate c);

	public StudentCommunicate findById(int id);

	public List<StudentCommunicate> findByName(String name);
}
