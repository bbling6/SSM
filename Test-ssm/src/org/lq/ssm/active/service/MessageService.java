package org.lq.ssm.active.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Message;
import org.lq.ssm.entity.Template;

public interface MessageService {
	
	public List<Message> findAll();

	public Message findById(Integer id);

	public boolean save(Message m);

	public boolean update(Message m);

	public boolean delete(Integer id);
	
	public List<Template> getTem();
	public List<Template> findByTel(@Param("tel")Integer tel);
}
