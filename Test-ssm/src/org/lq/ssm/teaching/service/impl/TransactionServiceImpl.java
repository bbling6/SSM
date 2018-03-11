package org.lq.ssm.teaching.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.entity.Transaction;
import org.lq.ssm.teaching.dao.TransactionDao;
import org.lq.ssm.teaching.service.TransactionService;

import org.springframework.stereotype.Service;
@Service("transactionServiceImpl")
public class TransactionServiceImpl implements TransactionService {
	@Resource(name="transactionDao")
	private TransactionDao transactionDao;
	public void setTransactionDao(TransactionDao transactionDao) {
		this.transactionDao = transactionDao;
	}

	@Override
	public boolean delete(Integer tid) {
		return transactionDao.delete(tid)>0;
	}

	@Override
	public List<Transaction> findAll() {
		return transactionDao.findAll();
	}

	@Override
	public List<Transaction> findByTitle(String title) {
		return transactionDao.findByTitle(title);
	}

	@Override
	public boolean save(Transaction transation) {
		return transactionDao.save(transation)>0;
	}


	@Override
	public boolean update(Transaction transation) {
		return transactionDao.update(transation)>0;
	}

	@Override
	public Transaction findById(Integer id) {
		return transactionDao.findById(id);
	}

}
