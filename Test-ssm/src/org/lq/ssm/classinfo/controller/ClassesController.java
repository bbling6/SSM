package org.lq.ssm.classinfo.controller;

import javax.annotation.Resource;

import org.lq.ssm.classinfo.service.ClassRoomBiz;
import org.lq.ssm.classinfo.service.ClassesBiz;
import org.lq.ssm.classinfo.service.ScheduleBiz;
import org.lq.ssm.classinfo.service.SubjectBiz;
import org.lq.ssm.entity.ClassRoom;
import org.lq.ssm.entity.Classes;
import org.lq.ssm.system.service.StaffBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("classes.do")
public class ClassesController {
	
	@Resource(name="classAction")
	private ClassesBiz classesBiz;
	
	@Resource(name="classRoomAction")
	private ClassRoomBiz classRoomBiz;
	
	@Resource(name="scheduleAction")
	private ScheduleBiz scheduleBiz;
	
	@Resource(name="subjectAction")
	private SubjectBiz subjectBiz;
	//引用lmz
	@Resource(name="staffBizImpl")
	private StaffBiz staffBiz;
	
	@RequestMapping(params="find")
	public String findAll(Model m){
		m.addAttribute("classesList", classesBiz.findAll());
		
		return "view/classinfo/classinfo/classinfo_list";
	}
	
	//添加前先获取关联下拉
	@RequestMapping(params="getContext")
	public String getContext(Model m){
		m.addAttribute("subjectList", subjectBiz.findAll());
		m.addAttribute("classRoomList", classRoomBiz.findAll());
		m.addAttribute("scheduleList", scheduleBiz.findAll());
		m.addAttribute("staffList", staffBiz.findAll());

		return "view/classinfo/classinfo/classinfo_add";
	}
	
	@RequestMapping(params="save")
	public String save(Classes c){
		if(classesBiz.save(c)>0){
			return "redirect:classes.do?find";
		}
		
		return "view/classinfo/classinfo/classinfo_add";
	}
	//模糊查询
	@RequestMapping(params="byName")
	public String findByName(String name,Model m){
		m.addAttribute("classesList", classesBiz.findByName(name));
		
		
		return "view/classinfo/classinfo/classinfo_list";
	}
	@RequestMapping(params="byId")
	public String findById(int id,Model m){
		m.addAttribute("classesList", classesBiz.findById(id));
		m.addAttribute("subjectList", subjectBiz.findAll());
		m.addAttribute("classRoomList", classRoomBiz.findAll());
		m.addAttribute("scheduleList", scheduleBiz.findAll());
		m.addAttribute("staffList", staffBiz.findAll());
		
		return "view/classinfo/classinfo/classinfo_update";
	}
	
	@RequestMapping(params="update")
	public String update(Classes r){
		if (classesBiz.update(r)>0) {
			return "redirect:classes.do?find";
		} 
		return "view/classinfo/classinfo/classinfo_update";
	}
	
	@RequestMapping(params="delete")
	public String delete(int id){
		if (classesBiz.delete(id)>0) {
			return "redirect:classes.do?find";
		}
		
		return "view/classinfo/classinfo/classinfo_list";
	}
	
	
	
	
	
	
	// ****************set区*****************************
	public void setClassesBiz(ClassesBiz classesBiz) {
		this.classesBiz = classesBiz;
	}

	public void setClassRoomBiz(ClassRoomBiz classRoomBiz) {
		this.classRoomBiz = classRoomBiz;
	}

	public void setScheduleBiz(ScheduleBiz scheduleBiz) {
		this.scheduleBiz = scheduleBiz;
	}

	public void setSubjectBiz(SubjectBiz subjectBiz) {
		this.subjectBiz = subjectBiz;
	}

	public void setStaffBiz(StaffBiz staffBiz) {
		this.staffBiz = staffBiz;
	}
	
	

	
}
