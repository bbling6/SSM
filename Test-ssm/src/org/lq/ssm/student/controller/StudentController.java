package org.lq.ssm.student.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.lq.ssm.classinfo.service.ClassesBiz;
import org.lq.ssm.entity.Audition;
import org.lq.ssm.entity.Student;
import org.lq.ssm.student.service.StudentBiz;
import org.lq.ssm.system.service.StaffBiz;
import org.lq.ssm.util.dao.Msg;
import org.lq.ssm.util.service.DictionoryBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.*;


/**
 * student 控制台
 * @author lanqiao
 *
 */
@Controller
@RequestMapping("student.do")
public class StudentController {
	
	@Resource(name="studentBizImpl")
	private StudentBiz studentBiz;
	
	@Resource(name="dictionoryBizImpl")
	private DictionoryBiz dictionoryBiz;
	
	@Resource(name="staffBizImpl")
	private StaffBiz staffBiz;
	
	@Resource(name="classAction")
	private ClassesBiz classesBiz;
	
	
	@RequestMapping(params="findAll")
	public String findAll(Model m,HttpSession session){
		List<Student> list=studentBiz.findAll();
		session.setAttribute("stu_list", list);
		return "view/student/student/student_list";
		
	}
	
	
	@RequestMapping(params="getDictionory")
	public String getDictionory(Model m){
		m.addAttribute("staff_list", staffBiz.findAll());
		m.addAttribute("class_list", classesBiz.findAll());
		m.addAttribute("dict_list", dictionoryBiz.findBytype("intention_type"));
		return "view/student/student/student_add";
	}
	
	@RequestMapping(params="save")
	public String save(Student s){
		if(studentBiz.save(s)){
			return "redirect:student.do?findAll";
		}
		return "view/student/student/student_add";
	}
	
	@RequestMapping(params="byname")
	public String findByName(String sname,Model m,HttpSession session){
		session.setAttribute("stu_list", studentBiz.findByName(sname));
		return "view/student/student/student_list";
	}
	
	@RequestMapping(params="byid")
	public String findById(Integer id,Model m){
		m.addAttribute("staff_list", staffBiz.findAll());
		m.addAttribute("class_list", classesBiz.findAll());
		m.addAttribute("dict_list", dictionoryBiz.findBytype("intention_type"));
		m.addAttribute("stu_list", studentBiz.findById(id));
		return "view/student/student/student_update";
	}
	
	@RequestMapping(params="update")
	public String update(Student s){
		if(studentBiz.update(s)){
			return "redirect:student.do?findAll";
		}
		return "view/student/student/student_update";
	}
	
	@RequestMapping(params="delete")
	public String delete(Integer id){
		if(studentBiz.delete(id)){
			return "redirect:student.do?findAll";
		}
		return "view/student/student/student_list";
	}


//---------------------------------------------
	public void setStudentBiz(StudentBiz studentBiz) {
		this.studentBiz = studentBiz;
	}

	public void setDictionoryBiz(DictionoryBiz dictionoryBiz) {
		this.dictionoryBiz = dictionoryBiz;
	}

	public void setStaffBiz(StaffBiz staffBiz) {
		this.staffBiz = staffBiz;
	}

	public void setClassesBiz(ClassesBiz classesBiz) {
		this.classesBiz = classesBiz;
	}
	
	
}
