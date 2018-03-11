package org.lq.ssm.system.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Role;

public interface RoleBiz {
    /**
     * 角色服务层接口
     */
	public List<Role>findAll();//查询
	public int save(Role s);//保存
	public int update(Role s);//更新
	public int delete(int id);//删除
	public Role findById(int id);//根据Id查询
	public List<Role> likename(String sname);
}
