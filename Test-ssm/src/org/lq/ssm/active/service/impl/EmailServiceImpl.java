package org.lq.ssm.active.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.active.dao.EmailDao;
import org.lq.ssm.active.dao.TemplateDao;
import org.lq.ssm.active.service.EmailService;
import org.lq.ssm.entity.Email;
import org.lq.ssm.entity.Template;
import org.springframework.stereotype.Service;
@Service("emailServiceImpl")
public class EmailServiceImpl implements EmailService{
	
	@Resource(name="emailDao")
	private EmailDao emailDao;
	@Resource(name="templateDao")
	private TemplateDao templateDao;
	
	
	public void setTemplateDao(TemplateDao templateDao) {
		this.templateDao = templateDao;
	}

	@Override
	public boolean delete(Integer id) {
		return emailDao.delete(id)>0;
	}

	@Override
	public List<Email> findAll() {
		return emailDao.findAll();
	}

	@Override
	public Email findById(Integer id) {
		return emailDao.findById(id);
	}

	@Override
	public int save(Email e) {
		return emailDao.save(e);
	}

	@Override
	public boolean update(Email e) {
		return false;
	}

	public void setEmailDao(EmailDao emailDao) {
		this.emailDao = emailDao;
	}

	@Override
	public List<Template> getTem() {
		return templateDao.findEma();
	}

	@Override
	public List<Email> findByTitle(String title) {
		return emailDao.findByTitle(title);
	}

	

}
