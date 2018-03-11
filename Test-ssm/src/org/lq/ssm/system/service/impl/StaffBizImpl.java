package org.lq.ssm.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.entity.Role;
import org.lq.ssm.entity.Staff;
import org.lq.ssm.system.dao.StaffDao;
import org.lq.ssm.system.service.StaffBiz;
import org.springframework.stereotype.Service;
@Service("staffBizImpl")
public class StaffBizImpl implements StaffBiz {
	/**
	 * Ա��ʵ�ֲ�
	 */
	@Resource(name="staffDao")
	private StaffDao staffDao;
    /**
     * ��ѯȫ��
     */
	@Override
	public List<Staff> findAll() {

		return staffDao.findAll();
	}
	/**
	 * 
	 * ���ID��ѯ
	 */
	@Override
	public Staff findById(int id) {
		
	  return staffDao.findById(id);
	}
	
	public void setStaffDao(StaffDao staffDao) {
		this.staffDao = staffDao;
	}
	/**
	 * ����
	 */
	@Override
	public int save(Staff s) {
		Role r=new Role();
		r.setRid(null);
		s.setRoles(r);
		s.setState("��ְ");
		return staffDao.save(s);
	}
	/**
	 * ���������ѯ
	 */
	@Override
	public List<Staff> likename(String name, String sex) {
		return staffDao.likename(name, sex);
	}
	@Override
	public int update(Staff s) {
		return staffDao.update(s);
	}
	@Override
	public int delete(int id) {
		return staffDao.delete(id);
	}
	@Override
	public int updateRole(Staff s) {
		return staffDao.updateRole(s);
	}
	@Override
	public Staff findByname(String name) {
		return staffDao.findByname(name);
	}
	@Override
	public List<Staff> findTeacher() {
		return staffDao.findTeacher();
	}
	
	
	@Override
	public List<Staff> check(String name, String password) {
		// TODO Auto-generated method stub
		return staffDao.check(name, password);
		
		
	}
	




}
