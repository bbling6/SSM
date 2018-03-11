package org.lq.ssm.student.test;

import java.util.Date;
import java.util.List;

import org.lq.ssm.entity.Student;
import org.lq.ssm.student.dao.GradeDao;
import org.lq.ssm.student.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springMvc.xml");
		//	GradeDao grade=(GradeDao) context.getBean("gradeDao");
		//	System.out.println(grade.findById(1));

		StudentDao ss=(StudentDao) context.getBean("studentDao");
		//	List<Student> list=s.findAll();
		//	for (Student student : list) {
		//		System.out.println(student.getDictionory().getContext());
		//	}
		Student s=new Student();
		  s.setAddress("asd");
		  s.setCity("asdasd");
		  s.setDesc("fdfgdfg");
		  s.setBirthday(new Date());
		  s.setEmail("asdasdas");
		  s.setClasses(null);
		  s.setQq("asdasd");
		  s.setIdcard("sad");
//              ss.save1(s);
            
	}
}
