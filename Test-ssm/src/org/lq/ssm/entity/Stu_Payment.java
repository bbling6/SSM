package org.lq.ssm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 学生缴费
 * @author lanqiao
 *
 */
public class Stu_Payment {
	private Integer pid;//缴费标号
	private Staff staff;//员工编号
	private Student student;//学员编号
	private String situatic;//缴费情况
	private Dictionory method;//缴费方式
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date time;//缴费时间
	private Double disamount;//优惠金额
	private Double should;//应交金额
	private Double real;//实缴金额
	private Double debt;//欠款
	private String desc;//备注
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getSituatic() {
		return situatic;
	}
	public void setSituatic(String situatic) {
		this.situatic = situatic;
	}
	
	public Dictionory getMethod() {
		return method;
	}
	public void setMethod(Dictionory method) {
		this.method = method;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Double getDisamount() {
		return disamount;
	}
	public void setDisamount(Double disamount) {
		this.disamount = disamount;
	}
	public Double getShould() {
		return should;
	}
	public void setShould(Double should) {
		this.should = should;
	}
	public Double getReal() {
		return real;
	}
	public void setReal(Double real) {
		this.real = real;
	}
	public Double getDebt() {
		return debt;
	}
	public void setDebt(Double debt) {
		this.debt = debt;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
