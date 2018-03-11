package org.lq.ssm.student.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.entity.StudentGrade;
import org.lq.ssm.student.dao.GradeDao;
import org.lq.ssm.student.service.GradeBiz;
import org.springframework.stereotype.Service;
@Service("gradeBizImpl")
public class GradeBizImpl implements GradeBiz {

	@Resource(name="gradeDao")
	private GradeDao gradeDao;
	
	@Override
	public boolean delete(int id) {
		return gradeDao.delete(id)>0;
	}

	@Override
	public List<StudentGrade> findAll() {
		return gradeDao.findAll();
	}

	@Override
	public StudentGrade findById(int id) {
		return gradeDao.findById(id);
	}

	@Override
	public boolean save(StudentGrade g) {
		return gradeDao.save(g)>0;
	}

	@Override
	public boolean update(StudentGrade g) {
		return gradeDao.update(g)>0;
	}

	public void setGradeDao(GradeDao gradeDao) {
		this.gradeDao = gradeDao;
	}

	@Override
	public List<StudentGrade> findByName(String name) {
		return gradeDao.findByName(name);
	}

	
	
}
