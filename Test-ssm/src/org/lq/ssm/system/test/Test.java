package org.lq.ssm.system.test;

import java.util.Date;
import java.util.List;

import org.lq.ssm.entity.Anthorty;
import org.lq.ssm.entity.Role;
import org.lq.ssm.entity.Upfile;
import org.lq.ssm.system.dao.AnthortyDao;
import org.lq.ssm.system.dao.RoleDao;
import org.lq.ssm.system.dao.StaffDao;
import org.lq.ssm.system.dao.UpfileDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		UpfileDao upfileDao = (UpfileDao) context.getBean("upfileDao");

		Upfile u=new Upfile();
		u.setDescription("第一个");
		u.setFilename("ad");
		u.setSavepath("路径");
		u.setUptime(new Date());
		u.setUsername("admin");
		u.setUuidname("1");
		System.out.println(upfileDao.add(u));
		
//		System.out.println(staffDao.updateRole(s));
//		System.out.println(staffDao.findAll().size());
//		Staff s=new Staff();
//		s.setName("����");
//		s.setPlace("���Ͽ���");
//		s.setAddress("���Ͽ���");
//		s.setAge(26);
//		s.setBirthday(new Date());
//		s.setDesc("��˵ʲô");
//		s.setEdulevel("����");
//		s.setEmail("123456");
//		s.setIdcard("123456987789456123");
//		s.setHiredate(new Date());
//		s.setNumber("wadmin");
//		s.setOffice("1100");
//		s.setPassword("123");
//		s.setPhone("123456");
//		s.setQq("123456");
//		Role r=new Role();
//		r.setRid(1);
//		s.setRoles(r);
//		s.setState("��ְ");
//		s.setSex("Ů");
//		s.setSid(8);
//		System.out.println(staffDao.save(s));
//		List<Staff>list=staffDao.likename(null,"��");
//		for (Staff staff : list) {
//			System.out.println(staff.getSex()+"\t"+staff.getName());
//		}
//	 System.out.println();
//		System.out.println(staffDao.findById(1).getName());
//		System.out.println(staffDao.delete(17));
		
//		RoleDao role=(RoleDao) context.getBean("roleDao");
//		Role r=new Role();
//		r.setName("java����ʦ");
//		r.setDesc("д����");
//		r.setState("����Ա");
//		System.out.println(role.save(r));
//       System.out.println(staffDao.findById(1).getPlace());
//		AnthortyDao ad=(AnthortyDao) context.getBean("anthortyDao");
//         List<Anthorty> list=ad.findAllMenu();
//         for (Anthorty an : list) {
//			System.out.println(an.getName());
//			for (Anthorty at : an.getChildrens()) {
//				System.out.println("\t"+at.getName());
//			   	
//			}
//		}
//         System.out.println(new Gson().toJson(ad.findAllMenu()));
//		List<Anthorty> list=ad.findParent();
//		for (Anthorty anthorty : list) {
//			System.out.println(anthorty.getName());
//			
//		}
		
		
	}
          
	}

