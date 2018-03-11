package org.lq.ssm.finance.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Staff_Salary;

public interface StaSalDao {
	public List<Staff_Salary> findAll();
	public int save(Staff_Salary ss);
	public int update(@Param("stid")int stid);
	public List<Staff_Salary> getsalbysid(@Param("sid") Integer sid);
}
