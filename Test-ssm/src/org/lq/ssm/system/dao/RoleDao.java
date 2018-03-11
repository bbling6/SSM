package org.lq.ssm.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Role;

public interface RoleDao {
          /**
           * 角色dao接口
           */
	public List<Role>findAll();//查询
	public int save(Role s);//保存
	public int update(Role s);//更新
	public int delete(@Param("rid")int id);//删除
	public Role findById(@Param("rid")int id);//根据Id查询
	public List<Role> likename(@Param("sname")String name);
}
