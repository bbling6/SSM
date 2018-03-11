package org.lq.ssm.student.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.lq.ssm.entity.StudentCommunicate;
import org.lq.ssm.student.service.CommunicateBiz;
import org.lq.ssm.student.service.StudentBiz;
import org.lq.ssm.system.service.StaffBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("communicate.do")
public class CommunicateController {

	@Resource(name="communicateBizImpl")
	private CommunicateBiz communicateBiz;
	
	@Resource(name="studentBizImpl")
	private StudentBiz studentBiz;
	
	@Resource(name="staffBizImpl")
	private StaffBiz staffBiz;

	@RequestMapping(params="findAll")
	public String findAll(Model m,HttpSession session){
		session.setAttribute("communicate_list", communicateBiz.findAll());
		return "view/student/communicateinfo/communicateinfo_list";
	}
	
	@RequestMapping(params="byname")
	public String findByName(String name,Model m,HttpSession session){
		session.setAttribute("communicate_list", communicateBiz.findByName(name));
		return "view/student/communicateinfo/communicateinfo_list";
	}
	
	@RequestMapping(params="getStudent")
	public String getStudent(Model m){
		m.addAttribute("stu_list", studentBiz.findAll());
		m.addAttribute("staff_list", staffBiz.findAll());
		return "view/student/communicateinfo/communicateinfo_add";
	}
	
	@RequestMapping(params="save")
	public String save(StudentCommunicate c){
		if(communicateBiz.save(c)){
			return "redirect:communicate.do?findAll";
		}
		return "view/student/communicateinfo/communicateinfo_add";
	}
	
	@RequestMapping(params="delete")
	public String delete(Integer id){
		if(communicateBiz.delete(id)){
			return "redirect:communicate.do?findAll"; 
		}
		return "view/student/communicateinfo/communicateinfo_list";
	}
	
	@RequestMapping(params="byid")
	public String findById(Integer id,Model m){
		m.addAttribute("stu_list", studentBiz.findAll());
		m.addAttribute("staff_list", staffBiz.findAll());
		m.addAttribute("communicate_list", communicateBiz.findById(id));
		return "view/student/communicateinfo/communicateinfo_update";
	}
	
	@RequestMapping(params="update")
	public String update(StudentCommunicate c){
		if(communicateBiz.update(c)){
			return "redirect:communicate.do?findAll";
		}
		return "view/student/communicateinfo/communicateinfo_update";
	}
	
	
	
	
	
	
	
	public void setCommunicateBiz(CommunicateBiz communicateBiz) {
		this.communicateBiz = communicateBiz;
	}

	public void setStudentBiz(StudentBiz studentBiz) {
		this.studentBiz = studentBiz;
	}

	public void setStaffBiz(StaffBiz staffBiz) {
		this.staffBiz = staffBiz;
	}
	
	
	
}
