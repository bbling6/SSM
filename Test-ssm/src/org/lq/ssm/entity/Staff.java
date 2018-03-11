package org.lq.ssm.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Staff implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
    * Ա����Ϣʵ���� 
    */
	private Integer sid;//��ʾ��
	private  String name;//���
	private String sex;//�Ա�
	private int age;//����
	private String place;//����
	private String idcard;//���֤��
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;//��������
	private String office;//�칫�绰
	private String phone;//�ƶ��绰
	private String email;//����
	private String address;//��ͥ��ַ
	private String qq;//QQ��ϵ
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private  Date hiredate;//��ְ����
	private String edulevel;//����ˮƽ
	private String desc;//��ע��Ϣ
	private String state;//״̬
	private String password;//��¼����
	private String number;//��¼�˺�
	/**
	 * һ��Ա�����Ե��ζ����ɫ(һ�Զ�)��ϵ
	 */
	private Role roles;
	
	
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public String getEdulevel() {
		return edulevel;
	}
	public void setEdulevel(String edulevel) {
		this.edulevel = edulevel;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Role getRoles() {
		return roles;
	}
	public void setRoles(Role roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", sid=" + sid + "]";
	}
    
	
	
}
