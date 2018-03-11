package org.lq.ssm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 班级实体类
 * @author lanqiao
 *
 */
public class Classes {
	
	private Integer id;		//班级编号
	private String name;	//班级名称
	private Integer num;	//班级人数
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date start;		//开班日期
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date end;		//结束日期
	private String isused;	//是否有效
	private String state;	//班级状态
	private String desc;	//描述
	
	/**
	 * 多对一关系
	 * 教室信息
	 */
	private ClassRoom classRoom;	
	/**
	 * 多对一关系
	 * 学科信息
	 */
	private Subject subject;
	/**
	 * 多对一关系
	 * 课程表
	 */
	private Schedule schedule;
	/**
	 * 多对一关系
	 * @return
	 */
	private Staff staff;
	
	
	
	
	public ClassRoom getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getIsused() {
		return isused;
	}
	public void setIsused(String isused) {
		this.isused = isused;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	
}
