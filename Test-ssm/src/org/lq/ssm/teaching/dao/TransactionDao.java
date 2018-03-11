package org.lq.ssm.teaching.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Transaction;

public interface TransactionDao {
/**
 * 班级事务接口
 */
	public int save(Transaction transation);
	public int update(Transaction transation);
	public int delete(@Param("tid") Integer tid);
	public Transaction findById(@Param("id") Integer id);
	public List<Transaction> findAll();
	public List<Transaction> findByTitle(@Param("title")String title);
}
