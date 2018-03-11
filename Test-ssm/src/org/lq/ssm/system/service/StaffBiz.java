package org.lq.ssm.system.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Staff;

public interface StaffBiz {
    /**
     * Ա�������ӿ�
     */
	public List<Staff> findAll();
	/**
	 * 
	 * ���ID��ѯ
	 */
	public Staff findById(int id);
	/**
	 *���� 
	 */
	public int save(Staff s);
	/***
	 * ���������ѯ
	 */
	public List<Staff>likename(String name,String sex);
	
	public List<Staff> check(String name,String password);
	/**
	 * ����
	 */
	public int update(Staff s);
	/**
	 * ɾ��
	 */
	public int delete(int id);
	/**
	 * ���½�ɫ
	 * @param s
	 * @return
	 */
	public int updateRole(Staff s);
	
	public Staff findByname(String name);
	
	public List<Staff> findTeacher();
}
