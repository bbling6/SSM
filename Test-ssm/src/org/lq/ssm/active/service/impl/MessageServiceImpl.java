package org.lq.ssm.active.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.active.dao.MessageDao;
import org.lq.ssm.active.dao.TemplateDao;
import org.lq.ssm.active.service.MessageService;
import org.lq.ssm.entity.Message;
import org.lq.ssm.entity.Template;
import org.springframework.stereotype.Service;
@Service("messageServiceImpl")
public class MessageServiceImpl implements MessageService {
	@Resource(name="messageDao")
	private MessageDao messageDao;
	@Resource(name="templateDao")
	private TemplateDao templateDao;
	
	public void setTemplateDao(TemplateDao templateDao) {
		this.templateDao = templateDao;
	}

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	@Override
	public boolean delete(Integer id) {
		return messageDao.delete(id)>0;
	}

	@Override
	public List<Message> findAll() {
		return messageDao.findAll();
	}

	

	@Override
	public boolean save(Message m) {
		return messageDao.save(m)>0;
	}

	/**
	 * 这个方法没有用!!
	 */
	@Override
	public boolean update(Message m) {
		return false;
	}

	@Override
	public List<Template> getTem() {
		return templateDao.findMsg();
	}

	@Override
	public Message findById(Integer id) {
		return messageDao.findById(id);
	}

	@Override
	public List<Template> findByTel(Integer tel) {
		return messageDao.findByTel(tel);
	}

	

}
