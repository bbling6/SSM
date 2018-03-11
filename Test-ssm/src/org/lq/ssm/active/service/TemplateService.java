package org.lq.ssm.active.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Template;

public interface TemplateService {

	public List<Template> findAll();
	
	public boolean save(Template t);
	
	public boolean update(Template t);
	
	public boolean delete(int id);
	
	public Template findById(Integer id);
	
	public int findSeq();
	
	public List<Template> findEma();
	
	public List<Template> findLike(@Param("title")String title);
}
