package org.lq.ssm.active.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Template;

public interface TemplateDao {

	public List<Template> findAll();
	
	public int save(Template t);
	
	public int update(Template t);
	
	public int delete(int id);
	
	public Template findById(int id);
	
	public int findSeq();
	
	public List<Template> findMsg();
	
	public List<Template> findEma();
	
	public List<Template> findLike(@Param("title")String title);
	
	
}
