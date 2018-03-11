package org.lq.ssm.finance.biz;

import java.util.List;

import org.lq.ssm.entity.Stu_Payment;
import org.lq.ssm.entity.Student;

public interface StuPayBiz {
	public boolean save(Stu_Payment stupay);
	public List<Stu_Payment> findpaybysid(Integer sid);
	public Double getstupay(Integer sid);
	public Double should(Integer sid);
}
