package org.lq.ssm.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.StudentCommunicate;


public interface CommunicateDao {

	/**
	 * 查询全部
	 * @return
	 */
	public List<StudentCommunicate> findAll();
	/**
	 * 添加
	 * @param c
	 * @return
	 */
	public int save(StudentCommunicate c);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public int delete(@Param("id") int id);
	/**
	 * 修改
	 * @param c
	 * @return
	 */
	public int update(StudentCommunicate c);
	/**
	 * 通过id查询
	 * @param id
	 * @return
	 */
	public StudentCommunicate findById(@Param("id") int id);
	/**
	 * 模糊查询
	 * @param name
	 * @return
	 */
	public List<StudentCommunicate> findByName(@Param("name") String name);
}
