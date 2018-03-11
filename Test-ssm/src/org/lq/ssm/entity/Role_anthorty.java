package org.lq.ssm.entity;

public class Role_anthorty {
  /**
   * 角色权限连接表
   */
	private Integer id;//角色权限编号
	private Integer rid;//角色编号
	private Integer aid;//权限编号
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	
	
	
}
