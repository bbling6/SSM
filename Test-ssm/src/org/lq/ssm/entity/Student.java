package org.lq.ssm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
    /**
     * ѧ��ʵ����
     */
	private Integer id;//��ʶ
	private Staff staff;//Ա������
	private Classes classes;//�༶���//------------��----------------------
	private String name;//ѧ�����
	private String sex;//�Ա�
	private int age;//����
	private String phone;//�ֻ��
	private String qq;//QQ��
	private String email;//����
	private String parentname;//�ҳ�����
	private String parentphone;//�ҳ��绰
	private String idcard;//���֤��
	private String address;//��ͥסַ
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;//��������
	private String school;//����ԺУ
	private String province;//ʡ��
	private String city;//���ڳ���
	private String ispay="��";//�Ƿ񽻷�
	private String marke="0";//��ʶ
	private String number;//�˺�
	private String password;//����
	private String desc;//����
	private Dictionory dictionory;
	
	
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
	
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getParentname() {
		return parentname;
	}
	public void setParentname(String parentname) {
		this.parentname = parentname;
	}
	public String getParentphone() {
		return parentphone;
	}
	public void setParentphone(String parentphone) {
		this.parentphone = parentphone;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getIspay() {
		return ispay;
	}
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Dictionory getDictionory() {
		return dictionory;
	}
	public void setDictionory(Dictionory dictionory) {
		this.dictionory = dictionory;
	}

	
	
	
}
