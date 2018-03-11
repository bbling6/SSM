package org.lq.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class Anthorty {
    /**
     * 权限实体类
     */
	private Integer aid;//权限编号
	private String name;//权限名称
	private String desc;//权限描述
	private String url;//权限连接URL
	/**
	 * 一个权限可以赋值给多个角色(一对多)
	 */
//	private List<Role>roles=new ArrayList<Role>();
	/**
	 * 一个父级菜单包含多个子菜单(一对多的)
	 */
	private List<Anthorty> childrens;
	
	private Anthorty parent;//父级对象
	
	
//	public List<Role> getRoles() {
//		return roles;
//	}
//	public void setRoles(List<Role> roles) {
//		this.roles = roles;
//	}
	
	public Integer getAid() {
		return aid;
	}
	
	

	

	public Anthorty getParent() {
		return parent;
	}





	public void setParent(Anthorty parent) {
		this.parent = parent;
	}





	public List<Anthorty> getChildrens() {
		return childrens;
	}



	public void setChildrens(List<Anthorty> childrens) {
		this.childrens = childrens;
	}



	public void setAid(Integer aid) {
		this.aid = aid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
