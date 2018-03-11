package org.lq.ssm.teaching.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.lq.ssm.entity.Attendance;

import org.lq.ssm.student.service.StudentBiz;
import org.lq.ssm.teaching.service.AttendanceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("attend.do")
public class AttendanceController {
	@Resource(name="attendanceServiceImpl")
	private AttendanceService attendances;

	@Resource(name="studentBizImpl")
	private StudentBiz studentBiz;
	
	public void setStudentBiz(StudentBiz studentBiz) {
		this.studentBiz = studentBiz;
	}
	public void setAttendances(AttendanceService attendances) {
		this.attendances = attendances;
	}
	@RequestMapping(params="save")
	public String save(Attendance attendance){
		if(attendances.save(attendance)){
			return "redirect:attend.do?findAll";
		}
		return "view/teaching/attendance/attendance_add";
		
	}
	@RequestMapping(params="findAll")
	public String findAll(Model m){
		m.addAttribute("attendanceList", attendances.findAll());
		return "view/teaching/attendance/attendance_list";	
	}
	@RequestMapping(params="findByName")
	public String findByName(String name,Model m){
		m.addAttribute("attendanceList", attendances.findByName(name));
		return "view/teaching/attendance/attendance_list";	
	}
	@RequestMapping(params="getStudent")
	public String getStudent(Model m){
		m.addAttribute("stuList", studentBiz.findAll());
		
		return "view/teaching/attendance/attendance_add";
		
	}
	@RequestMapping(params="findById")
	public String findById(Integer id,Model m){
		m.addAttribute("students",studentBiz.findAll());
		m.addAttribute("attendance", attendances.findById(id));
		return "view/teaching/attendance/attendance_update";
		
	}
	@RequestMapping(params="update")
	public String update(Attendance a,Model m){
		
		if(attendances.update(a)){
			return "redirect:attend.do?findAll";
		}
		return "view/teaching/attendance/attendance_update";
		
	}
	@RequestMapping(params="delete")
	public String delete(Integer id){
		attendances.delete(id);
		
		return "redirect:attend.do?findAll";	
	}
}
