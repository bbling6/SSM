package org.lq.ssm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 短信
 * @author lanqiao
 *
 */
public class Message {

	private Integer id;
	private Staff staff;//发送人
	private String receiveMan;//接收人
	private String msgContent;//短信内容
	@DateTimeFormat
	private Date postTime;//发送时间
	private String receivePhone;//接收人手机号
	
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
	public String getReceiveMan() {
		return receiveMan;
	}
	public void setReceiveMan(String receiveMan) {
		this.receiveMan = receiveMan;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	public String getReceivePhone() {
		return receivePhone;
	}
	public void setReceivePhone(String receivePhone) {
		this.receivePhone = receivePhone;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", msgContent=" + msgContent
				+ ", postTime=" + postTime + ", receiveMan=" + receiveMan
				+ ", receivePhone=" + receivePhone + ", staff=" + staff + "]";
	}
	
	
	
	
	
	
	
}
