package org.lq.ssm.entity;

import java.util.Date;
/**
 * 员工薪水
 * @author lanqiao
 *
 */
public class Staff_Salary {
	private Integer ssid;//员工薪水编号
	private Staff staid;//领取人
	private Staff stasid;//财务人员
	private Double totsal;//本月薪水
	private Double desal;//扣除
	private Double resal;//实际发放工资
	private String isused="否";//是否发放
	private Date saldate;//发放日期
	private String remark;//备注
	
	public Integer getSsid() {
		return ssid;
	}
	public void setSsid(Integer ssid) {
		this.ssid = ssid;
	}
	public Staff getStaid() {
		return staid;
	}
	public void setStaid(Staff staid) {
		this.staid = staid;
	}
	public Staff getStasid() {
		return stasid;
	}
	public void setStasid(Staff stasid) {
		this.stasid = stasid;
	}
	public Double getTotsal() {
		return totsal;
	}
	public void setTotsal(Double totsal) {
		this.totsal = totsal;
	}
	public Double getDesal() {
		return desal;
	}
	public void setDesal(Double desal) {
		this.desal = desal;
	}
	public Double getResal() {
		return resal;
	}
	public void setResal(Double resal) {
		this.resal = resal;
	}
	public String getIsused() {
		return isused;
	}
	public void setIsused(String isused) {
		this.isused = isused;
	}
	public Date getSaldate() {
		return saldate;
	}
	public void setSaldate(Date saldate) {
		this.saldate = saldate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
