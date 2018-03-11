package org.lq.ssm.finance.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Stu_Payment;

public interface StuPayDao {
	public int save(Stu_Payment stupay);
	public List<Stu_Payment> findpaybysid(@Param("sid")Integer sid);
	public Double should(@Param("sid")Integer sid);
}
