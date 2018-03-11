package org.lq.ssm.entity;

import java.util.Date;



import org.springframework.format.annotation.DateTimeFormat;
/**
 * �ʼ�
 * @author 
 *
 */
public class Email {

	private Integer id;//�ʼ����
	private Staff staff;//������
	private String title;//����
	private String emailContent;//����
	@DateTimeFormat
	private Date postTime;//����ʱ��
	private String receiveMan;//������
	private String receiveAddress;//���յ�ַ
	private String emailState;//����״̬
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
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
	
	public String getEmailContent() {
		return emailContent;
	}
	public void setEmailContent(String emailContent) {
		this.emailContent = emailContent;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	public String getReceiveMan() {
		return receiveMan;
	}
	public void setReceiveMan(String receiveMan) {
		this.receiveMan = receiveMan;
	}
	public String getReceiveAddress() {
		return receiveAddress;
	}
	public void setReceiveAddress(String receiveAddress) {
		this.receiveAddress = receiveAddress;
	}
	public String getEmailState() {
		return emailState;
	}
	public void setEmailState(String emailState) {
		this.emailState = emailState;
	}
	@Override
	public String toString() {
		return "Email [emailContent=" + emailContent + ", emailState="
				+ emailState + ", id=" + id + ", postTime=" + postTime
				+ ", receiveAddress=" + receiveAddress + ", receiveMan="
				+ receiveMan + ", staff=" + staff + ", title=" + title + "]";
	}
	
	
}
