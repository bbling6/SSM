package org.lq.ssm.util.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.entity.Dictionory;
import org.lq.ssm.util.dao.DictionoryDao;
import org.lq.ssm.util.service.DictionoryBiz;
import org.springframework.stereotype.Service;

@Service("dictionoryBizImpl")
public class DictionoryBizImpl implements DictionoryBiz {
	
	
    @Resource(name="dictionoryDao")
	private DictionoryDao dictionoryDao;
    
	@Override
	public int delete(int id) {
		
		return dictionoryDao.delete(id);
	}

	@Override
	public List<Dictionory> findAll() {
		return dictionoryDao.findAll();
	}

	@Override
	public Dictionory findById(int id) {
		return dictionoryDao.findById(id);
	}

	@Override
	public int save(Dictionory s) {
		return dictionoryDao.save(s);
	}

	@Override
	public int update(Dictionory s) {
		return dictionoryDao.update(s);
	}

	public void setDictionoryDao(DictionoryDao dictionoryDao) {
		this.dictionoryDao = dictionoryDao;
	}

	@Override
	public List<Dictionory> findBytype(String type) {
		return dictionoryDao.findBytype(type);
	}

	
}
