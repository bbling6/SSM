package org.lq.ssm.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Role implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * ��ɫ��ʵ����
     */
	private Integer rid;//��ɫ���
	private String name;//��ɫ����
	private String desc;//��ɫ����
	private String state;//��ɫ״̬
	/**
	 * һ����ɫ�����ж��Ա������(һ�Զ�)
	 * @return
	 */
//	private List<Staff> staffs=new ArrayList<Staff>();
	/**
	 * һ����ɫ�����ж��Ȩ��
	 * @return
	 */
	private List<Anthorty> anthortys=new ArrayList<Anthorty>();
	
	
//	public List<Staff> getStaffs() {
//		return staffs;
//	}
//	public void setStaffs(List<Staff> staffs) {
//		this.staffs = staffs;
//	}
	
	public Integer getRid() {
		return rid;
	}
	public void setAnthortys(List<Anthorty> anthortys) {
		this.anthortys = anthortys;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
