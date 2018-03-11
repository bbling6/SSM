package org.lq.ssm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * ÊÔÌı
 * @author lanqiao
 */
public class Audition {
	private Integer audition_id;//ÊÔÌı±àºÅ
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date audition_time;//ÊÔÌıÊ±¼ä
	private String audition_address;//ÊÔÌıµØÖ·
	private String audition_course;//ÊÔÌı¿Î³Ì
	private String audition_desc;//ÊÔÌıÃèÊö
	private Student student;     //Ñ§ÉúÀà
	
	public Integer getAudition_id() {
		return audition_id;
	}
	public void setAudition_id(Integer auditionId) {
		audition_id = auditionId;
	}
	public Date getAudition_time() {
		return audition_time;
	}
	public void setAudition_time(Date auditionTime) {
		audition_time = auditionTime;
	}
	public String getAudition_address() {
		return audition_address;
	}
	public void setAudition_address(String auditionAddress) {
		audition_address = auditionAddress;
	}
	public String getAudition_course() {
		return audition_course;
	}
	public void setAudition_course(String auditionCourse) {
		audition_course = auditionCourse;
	}
	public String getAudition_desc() {
		return audition_desc;
	}
	public void setAudition_desc(String auditionDesc) {
		audition_desc = auditionDesc;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
	

}
