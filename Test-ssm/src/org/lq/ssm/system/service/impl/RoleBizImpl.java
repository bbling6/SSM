package org.lq.ssm.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.entity.Role;
import org.lq.ssm.system.dao.RoleDao;
import org.lq.ssm.system.service.RoleBiz;
import org.springframework.stereotype.Service;
@Service("roleBizImpl")
public class RoleBizImpl implements RoleBiz {
    /**
     * 角色实现层
     */
	@Resource(name="roleDao")
	private RoleDao roleDao;

	@Override
	public int delete(int id) {
		return roleDao.delete(id);
	}

	@Override
	public List<Role> findAll() {
		return roleDao.findAll();
	}

	@Override
	public Role findById(int id) {
		return roleDao.findById(id);
	}

	@Override
	public int save(Role s) {
		s.setState("写代码的源");
		return roleDao.save(s);
	}

	@Override
	public int update(Role s) {
		return roleDao.update(s);
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	@Override
	public List<Role> likename(String sname) {
		return roleDao.likename(sname);
	}

	
	
}
