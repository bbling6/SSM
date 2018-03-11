package org.lq.ssm.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.StudentGrade;

public interface GradeDao {

	/**
	 * 查询全部
	 * @return
	 */
	public List<StudentGrade> findAll();
	/**
	 * 添加
	 * @param g
	 * @return
	 */
	public int save(StudentGrade g);
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public int delete(@Param("id") int id);
	/**
	 * 修改
	 * @param g
	 * @return
	 */
	public int update(StudentGrade g);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public StudentGrade findById(@Param("id") int id);
	/**
	 * 模糊查询
	 * @param name
	 * @return
	 */
	public List<StudentGrade> findByName(@Param("name") String name);
}
