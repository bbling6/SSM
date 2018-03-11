package org.lq.ssm.util.service;

import java.util.List;

import org.lq.ssm.entity.Dictionory;

public interface DictionoryBiz {
     /**
      * 数据字典服务层    
      * @return
      */
	public List<Dictionory>findAll();//查询
	public int save(Dictionory s);//保存
	public int update(Dictionory s);//更新
	public int delete(int id);//删除
	public Dictionory findById(int id);//根据Id查询
	public List<Dictionory> findBytype(String type);
}
