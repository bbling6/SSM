package org.lq.ssm.active.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Email;
import org.lq.ssm.entity.Template;

public interface EmailService {
	public List<Email> findAll();

	public Email findById(Integer id);

	public int save(Email e);

	public boolean update(Email e);

	public boolean delete(Integer id);
	
	public List<Template> getTem();
	
	public List<Email> findByTitle(@Param("title")String title);
	
}
