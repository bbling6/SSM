package org.lq.ssm.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Staff;

public interface StaffDao {
	/**
	 * Ա��dao��ӿ�
	 */
	public List<Staff>findAll();//��ѯ
	public int save(Staff s);//����
	public int update(Staff s);//����
	public int delete(@Param("sid")int id);//ɾ��
	public Staff findById(@Param("id")int id);//���Id��ѯ
	public List<Staff>likename(@Param("name")String name,@Param("sex")String sex);
	public List<Staff> check(@Param("name")String name,@Param("password")String password);
	public int updateRole(Staff s);//���½�ɫ
	public Staff findByname(@Param("name") String name);
	public List<Staff> findTeacher();
	
}
