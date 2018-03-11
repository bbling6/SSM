package org.lq.ssm.util.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Dictionory;
import org.lq.ssm.entity.Staff;

public interface DictionoryDao {
	/**
	 * 数据字典接口
	 */
	public List<Dictionory> findAll();//查询
	public int save(Dictionory s);//保存
	public int update(Dictionory s);//更新
	public int delete(@Param("id")int id);//删除
	public Dictionory findById(@Param("id")int id);//根据Id查询
	public List<Dictionory> findBytype(@Param("type")String type);
}
