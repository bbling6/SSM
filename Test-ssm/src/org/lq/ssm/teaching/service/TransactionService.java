package org.lq.ssm.teaching.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Transaction;

public interface TransactionService {
	public boolean save(Transaction transation);
	public boolean update(Transaction transation);
	public boolean delete(Integer tid);
	public Transaction findById(Integer id);
	public List<Transaction> findAll();
	public List<Transaction> findByTitle(String title);
}
