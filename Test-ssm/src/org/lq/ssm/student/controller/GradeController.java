package org.lq.ssm.student.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.lq.ssm.entity.StudentGrade;
import org.lq.ssm.student.service.GradeBiz;
import org.lq.ssm.student.service.StudentBiz;
import org.lq.ssm.system.service.StaffBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("grade.do")
public class GradeController {

	@Resource(name="gradeBizImpl")
	private GradeBiz gradeBiz;
	
	@Resource(name="studentBizImpl")
	private StudentBiz studentBiz;
	
	@Resource(name="staffBizImpl")
	private StaffBiz staffBiz;

	@RequestMapping(params="findAll")
	public String findAll(Model m,HttpSession session){
		session.setAttribute("grade_list", gradeBiz.findAll());
		return "view/student/studentwritegrade/studentwritegrade_list";
	}
	
	@RequestMapping(params="getStudent")
	public String getStudent(Model m){
		m.addAttribute("student_list", studentBiz.findAll());
		m.addAttribute("staff_list", staffBiz.findAll());
		return "view/student/studentwritegrade/studentwritegrade_add";
	}
	
	@RequestMapping(params="save")
	public String save(StudentGrade g){
		if(gradeBiz.save(g)){
			return "redirect:grade.do?findAll";
		}
		return "view/student/studentwritegrade/studentwritegrade_add";
	}
	
	@RequestMapping(params="byname")
	public String findByName(String name, Model m,HttpSession session){
		session.setAttribute("grade_list", gradeBiz.findByName(name));
		return "view/student/studentwritegrade/studentwritegrade_list";
	}
	
	@RequestMapping(params="delete")
	public String delete(Integer id){
		if(gradeBiz.delete(id)){
			return "redirect:grade.do?findAll";
		}
		return "view/student/studentwritegrade/studentwritegrade_list";
	}
	
	@RequestMapping(params="byid")
	public String getById(Integer id,Model m){
		m.addAttribute("student_list", studentBiz.findAll());
		m.addAttribute("staff_list", staffBiz.findAll());
		m.addAttribute("grade_list", gradeBiz.findById(id));
		return "view/student/studentwritegrade/studentwritegrade_update";
	}
	
	@RequestMapping(params="update")
	public String update(StudentGrade g){
		if(gradeBiz.update(g)){
			return "redirect:grade.do?findAll";
		}
		return "view/student/studentwritegrade/studentwritegrade_update";
	}
	
	
	
	
	
	public void setGradeBiz(GradeBiz gradeBiz) {
		this.gradeBiz = gradeBiz;
	}

	public void setStudentBiz(StudentBiz studentBiz) {
		this.studentBiz = studentBiz;
	}

	public void setStaffBiz(StaffBiz staffBiz) {
		this.staffBiz = staffBiz;
	}
	
	
}
