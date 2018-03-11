package org.lq.ssm.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.entity.Anthorty;
import org.lq.ssm.system.dao.AnthortyDao;
import org.lq.ssm.system.service.AnthortyBiz;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
@Service("anthortyBizImpl")
public class AnthortyBizImpl implements AnthortyBiz {
        /**
         * 权限实现层
         */
	@Resource(name="anthortyDao")
	private AnthortyDao anthortyDao;
       
		@Override
		public int delete(int id) {
		  return anthortyDao.delete(id);
		}


		@Override
		public Anthorty findById(int id) {
			return anthortyDao.findById(id);
		}

		@Override
		public int save(Anthorty s) {
			return anthortyDao.save(s);
		}

		@Override
		public int update(Anthorty s) {
			return anthortyDao.update(s);
		}

		@Override
		public List<Anthorty> findParent() {
			return anthortyDao.findParent();
		}

		@Override
		public List<Anthorty> findAllMenu() {//查询全部
			return anthortyDao.findAllMenu();
		}
		
		@Override
		public String getParentJson() {
			return new Gson().toJson(anthortyDao.findAllMenu());
		}

		@Override
		public List<Anthorty> findChildren() {
			return anthortyDao.findChildren();
		}

		public void setAnthortyDao(AnthortyDao anthortyDao) {
			this.anthortyDao = anthortyDao;
		}
		
	
	
	
}
