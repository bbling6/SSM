package org.lq.ssm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 学员沟通实体类
 * @author lanqiao
 *
 */
public class StudentCommunicate {

	private Integer id;//学员沟通编号
	private Student student;//学院对象
	private Staff staff;//老师对象
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date comtime;//沟通时间
	private String content;//沟通内容
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Date getComtime() {
		return comtime;
	}
	public void setComtime(Date comtime) {
		this.comtime = comtime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
