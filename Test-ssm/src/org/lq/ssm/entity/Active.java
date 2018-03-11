package org.lq.ssm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 营销活动
 * @author lanqiao
 *
 */
public class Active {

	private Integer id;//活动编号
	private Staff staff;//活动策划人
	private String activeName;//活动名称
	private Dictionory activeState;//活动状态
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date starDate;//活动开始时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endDate;//活动结束时间
	private Dictionory activeType;//活动类型
	private Double costEmtimente;//预期成本
	private Double realCost;//实际成本
	private Dictionory reflect;//预期反映
	private String expectStudent;//预期学员
	private String activeDescription;//描述
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public String getActiveName() {
		return activeName;
	}
	public void setActiveName(String activeName) {
		this.activeName = activeName;
	}
	public Dictionory getActiveState() {
		return activeState;
	}
	public void setActiveState(Dictionory activeState) {
		this.activeState = activeState;
	}
	public Date getStarDate() {
		return starDate;
	}
	public void setStarDate(Date starDate) {
		this.starDate = starDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Dictionory getActiveType() {
		return activeType;
	}
	public void setActiveType(Dictionory activeType) {
		this.activeType = activeType;
	}
	public Double getCostEmtimente() {
		return costEmtimente;
	}
	public void setCostEmtimente(Double costEmtimente) {
		this.costEmtimente = costEmtimente;
	}
	public Double getRealCost() {
		return realCost;
	}
	public void setRealCost(Double realCost) {
		this.realCost = realCost;
	}
	public Dictionory getReflect() {
		return reflect;
	}
	public void setReflect(Dictionory reflect) {
		this.reflect = reflect;
	}
	public String getExpectStudent() {
		return expectStudent;
	}
	public void setExpectStudent(String expectStudent) {
		this.expectStudent = expectStudent;
	}
	public String getActiveDescription() {
		return activeDescription;
	}
	public void setActiveDescription(String activeDescription) {
		this.activeDescription = activeDescription;
	}
	@Override
	public String toString() {
		return "Active [activeDescription=" + activeDescription
				+ ", activeName=" + activeName + ", activeState=" + activeState
				+ ", activeType=" + activeType + ", costEmtimente="
				+ costEmtimente + ", endDate=" + endDate + ", expectStudent="
				+ expectStudent + ", id=" + id + ", realCost=" + realCost
				+ ", reflect=" + reflect + ", staff=" + staff + ", starDate="
				+ starDate + "]";
	}
	
	
	
	
	




}
