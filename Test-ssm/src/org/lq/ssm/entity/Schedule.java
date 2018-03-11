package org.lq.ssm.entity;
/**
 * 课程表
 * @author lanqiao
 *
 */
public class Schedule {
	private Integer id;		//编号
	private String name;	//课程表名称
	private String isuserd;	//是否有效
	private String yi;		//周一
	private String er;		//周二
	private String san;		//周三
	private String si;		//周四
	private String wu;		//周五
	private String liu;		//周六
	private String qi;		//周日
	
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
	public String getIsuserd() {
		return isuserd;
	}
	public void setIsuserd(String isuserd) {
		this.isuserd = isuserd;
	}
	public String getYi() {
		return yi;
	}
	public void setYi(String yi) {
		this.yi = yi;
	}
	public String getEr() {
		return er;
	}
	public void setEr(String er) {
		this.er = er;
	}
	public String getSan() {
		return san;
	}
	public void setSan(String san) {
		this.san = san;
	}
	public String getSi() {
		return si;
	}
	public void setSi(String si) {
		this.si = si;
	}
	public String getWu() {
		return wu;
	}
	public void setWu(String wu) {
		this.wu = wu;
	}
	public String getLiu() {
		return liu;
	}
	public void setLiu(String liu) {
		this.liu = liu;
	}
	public String getQi() {
		return qi;
	}
	public void setQi(String qi) {
		this.qi = qi;
	}
	
	
}
