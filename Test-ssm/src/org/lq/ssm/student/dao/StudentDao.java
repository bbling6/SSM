package org.lq.ssm.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Student;

public interface StudentDao {

	/**
	 * ��ѯȫ��
	 * @return
	 */
	public List<Student> findAll();
	/**
	 * ���
	 * @param s
	 * @return
	 */
	public int save(Student s);
	/**
	 * ɾ��
	 * @param id
	 * @return
	 */
	public int delete(@Param("id") int id);
	/**
	 * ͨ��id��ѯ
	 * @param id
	 * @return
	 */
	public Student findById(@Param("id") int id);
	/**
	 * �޸�
	 * @param s
	 * @return
	 */
	public int update(Student s);
	/**
	 * ģ���ѯ
	 * @param name
	 * @return
	 */
	public List<Student> findByName(@Param("name") String name);
	public List<Student> getstubypay(@Param("ispay")String ispay);

	public List<Student> findByCon(@Param("sname")String sname,@Param("state")Integer state);
}
