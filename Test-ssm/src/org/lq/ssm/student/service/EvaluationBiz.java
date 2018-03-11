package org.lq.ssm.student.service;

import java.util.List;

import org.lq.ssm.entity.StudentEvaluation;

public interface EvaluationBiz {

	public List<StudentEvaluation> findAll();

	public boolean save(StudentEvaluation e);

	public boolean delete(int id);

	public boolean update(StudentEvaluation e);

	public StudentEvaluation findById(int id);

	public List<StudentEvaluation> findByTitle(String title);
}
