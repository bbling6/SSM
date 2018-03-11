package org.lq.ssm.classinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.classinfo.dao.ClassesDao;
import org.lq.ssm.classinfo.service.ClassesBiz;
import org.lq.ssm.entity.Classes;
import org.springframework.stereotype.Service;

@Service("classAction")
public class ClassesBizImpl implements ClassesBiz{
	
	@Resource(name="classesDao")
	private ClassesDao classesDao;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Classes> findAll() {
		return classesDao.findAll();
	}
	/**
	 * 通过名称模糊查询
	 */

	@Override
	public List<Classes> findByName(String name) {
		return classesDao.findByName(name);
	}

	
	/**
	 * 保存
	 */
	@Override
	public int save(Classes c) {
		return classesDao.save(c);
	}
	/**
	 * 删除
	 */
	@Override
	public int delete(int id) {
		return classesDao.delete(id);
	}
	/**
	 * 修改
	 */
	@Override
	public int update(Classes c) {
		return classesDao.update(c);
	}

	
	public void setClassesDao(ClassesDao classesDao) {
		this.classesDao = classesDao;
	}
	@Override
	public Classes findById(int cid) {
		return classesDao.findById(cid);
	}



}
