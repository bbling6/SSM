package org.lq.ssm.finance.biz.impl;

import java.util.List;


import org.lq.ssm.classinfo.dao.ClassesDao;
import org.lq.ssm.classinfo.dao.SubjectDao;
import org.lq.ssm.entity.Classes;
import org.lq.ssm.entity.Stu_Payment;
import org.lq.ssm.entity.Student;
import org.lq.ssm.entity.Subject;
import org.lq.ssm.finance.biz.StuPayBiz;
import org.lq.ssm.finance.dao.StuPayDao;
import org.lq.ssm.student.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("spaybiz")
public class StuPayBizImpl implements StuPayBiz {
	@Autowired
	private StuPayDao stuPayDao;
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private ClassesDao classesDao;
	@Override
	public boolean save(Stu_Payment stupay) {
		return stuPayDao.save(stupay)>0;
	}
	@Override
	public List<Stu_Payment> findpaybysid(Integer sid) {
		return stuPayDao.findpaybysid(sid);
	}
	@Override
	public Double getstupay(Integer sid) {
		Student student=studentDao.findById(sid);
		Classes classes=classesDao.findById(student.getClasses().getId());
		Subject subject=classes.getSubject();
		return subject.getMoney();
	}
	@Override
	public Double should(Integer sid) {
		double shouldpay=0;
		Double should=stuPayDao.should(sid);
		if(should==null){
			shouldpay=this.getstupay(sid);
		}else{
			shouldpay=should;
		}
		return shouldpay;
	}

}
