package org.lq.ssm.classinfo.test;

import java.util.List;

import org.lq.ssm.classinfo.service.ClassesBiz;
import org.lq.ssm.entity.Classes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springMvc.xml");
		ClassesBiz cBiz=(ClassesBiz) context.getBean("classAction");
		 List<Classes> list=cBiz.findAll();
		 
		 for (Classes c : list) {
			System.out.println(c.getName());
		}
	}

}
