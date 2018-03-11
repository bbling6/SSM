package org.lq.ssm.entity;
/**
 * 学科信息
 * @author lanqiao
 *
 */
public class Subject {
	
	private Integer id;		//学科编号
	private String name;	//学科名称
	private Double money;	//费用
	private Integer hour;	//学时
	private String desc;	//描述
	private String isused;	//是否有效
	
	
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
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Integer getHour() {
		return hour;
	}
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getIsused() {
		return isused;
	}
	public void setIsused(String isused) {
		this.isused = isused;
	}
	
	
	
}
