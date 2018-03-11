package org.lq.ssm.student.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.entity.StudentEvaluation;
import org.lq.ssm.student.dao.EvaluationDao;
import org.lq.ssm.student.service.EvaluationBiz;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
@Service("evaluationBizImpl")
public class EvaluationBizImpl implements EvaluationBiz {
	@Resource(name="evaluationDao")
	private EvaluationDao evaluationDao;
	
	@Override
	public boolean delete(int id) {
		return evaluationDao.delete(id)>0;
	}

	@Override
	public List<StudentEvaluation> findAll() {
		return evaluationDao.findAll();
	}

	@Override
	public StudentEvaluation findById(int id) {
		return evaluationDao.findById(id);
	}

	@Override
	public boolean save(StudentEvaluation e) {
		return evaluationDao.save(e)>0;
	}

	@Override
	public boolean update(StudentEvaluation e) {
		return evaluationDao.update(e)>0;
	}

	public void setEvaluationDao(EvaluationDao evaluationDao) {
		this.evaluationDao = evaluationDao;
	}

	@Override
	public List<StudentEvaluation> findByTitle(String title) {
		return evaluationDao.findByTitle(title);
	}


	
}
