package org.lq.ssm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Attendance {
	/**
	 * ¿¼ÇÚ
	 */
	private Integer aid;//¿¼ÇÚ±àºÅ
	private Student student;//Ñ§Ô±±àºÅ
	private String desc;//ÃèÊö
	private String state;//×´Ì¬
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date time;//ÈÕÆÚ
	private String content;//±¸×¢
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
