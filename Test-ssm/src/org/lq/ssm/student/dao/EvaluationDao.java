package org.lq.ssm.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.StudentEvaluation;

public interface EvaluationDao {

	/**
	 * 查询全部
	 * @return
	 */
	public List<StudentEvaluation> findAll();
	/**
	 * 添加
	 * @param e
	 * @return
	 */
	public int save(StudentEvaluation e);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public int delete(@Param("id") int id);
	/**
	 * 修改
	 * @param e
	 * @return
	 */
	public int update(StudentEvaluation e);
	/**
	 * 通过id查询
	 * @param id
	 * @return
	 */
	public StudentEvaluation findById(@Param("id") int id);
	/**
	 * 模糊查询
	 * @param title
	 * @return
	 */
	public List<StudentEvaluation> findByTitle(@Param("title") String title);
}
