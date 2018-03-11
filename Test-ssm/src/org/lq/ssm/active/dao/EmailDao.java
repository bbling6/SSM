package org.lq.ssm.active.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Email;
import org.lq.ssm.entity.Template;

public interface EmailDao {

	public List<Email> findAll();
	
	public Email findById(Integer id);
	
	public int save(Email e);
	
	public int update(Email e);
	
	public int delete(Integer id);
	
	public List<Template> getTem();
	
	public List<Email> findByTitle(@Param("title")String title);
}
