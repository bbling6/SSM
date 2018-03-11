package org.lq.ssm.active.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Message;
import org.lq.ssm.entity.Template;

public interface MessageDao {

	public List<Message> findAll();
	
	public Message findById(Integer id);
	
	public int save(Message m);
	
	public int update(Message m);
	
	public int delete(Integer id);
	
	public List<Template> getTem();
	
	public List<Template> findByTel(@Param("tel")Integer tel);
	
}
