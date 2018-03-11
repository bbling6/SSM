package org.lq.ssm.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Anthorty;

public interface AnthortyDao {
        /**
         * 权限系统dao接口
         */
	public List<Anthorty>findAllMenu();//查询全部
	public int save(Anthorty s);//保存
	public int update(Anthorty s);//更新
	public int delete(@Param("id")int id);//删除
	public Anthorty findById(@Param("id")int id);//根据Id查询
	//查询子级
	public List<Anthorty> findChildren();//查询父级(子级)菜单(根据父级Id判断)
	//查询父级
	public List<Anthorty> findParent();
	
}
