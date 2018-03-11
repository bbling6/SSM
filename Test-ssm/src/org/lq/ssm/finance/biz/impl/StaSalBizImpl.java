package org.lq.ssm.finance.biz.impl;

import java.util.List;

import org.lq.ssm.entity.Staff_Salary;
import org.lq.ssm.finance.biz.StaSalBiz;
import org.lq.ssm.finance.dao.StaSalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("salbiz")
public class StaSalBizImpl implements StaSalBiz {
	@Autowired
	private StaSalDao staSalDao;
 	@Override
	public List<Staff_Salary> findAll() {
		return staSalDao.findAll();
	}

	@Override
	public boolean save(Staff_Salary ss) {
		return staSalDao.save(ss)>0;
	}

	@Override
	public boolean update(int stid) {
		return staSalDao.update(stid)>0;
	}

	public void setStaSalDao(StaSalDao staSalDao) {
		this.staSalDao = staSalDao;
	}

	@Override
	public List<Staff_Salary> getsalbysid(Integer sid) {
		return staSalDao.getsalbysid(sid);
	}
}
