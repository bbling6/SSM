package org.lq.ssm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Transaction {
	/**
	 * 班级事务信息
	 */
	private Integer tid;//班级事务编号
	private String title;//主题
	private String content;//内容
	private String organizition;//组织人
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date time;//活动日期
	private String desc;//备注信息
	private Classes classes;//班级编号
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getOrganizition() {
		return organizition;
	}
	public void setOrganizition(String organizition) {
		this.organizition = organizition;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	
	
	
}
