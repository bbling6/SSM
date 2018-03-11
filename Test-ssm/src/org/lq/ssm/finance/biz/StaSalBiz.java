package org.lq.ssm.finance.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Staff_Salary;

public interface StaSalBiz {
	public List<Staff_Salary> findAll();
	public boolean save(Staff_Salary ss);
	public boolean update(@Param("stid")int stid);
	public List<Staff_Salary> getsalbysid(Integer sid);
}
