package org.lq.ssm.classinfo.controller;

import javax.annotation.Resource;

import org.lq.ssm.classinfo.service.ClassRoomBiz;
import org.lq.ssm.entity.ClassRoom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("classRoom.do")
public class ClassRoomController {
	
	@Resource(name="classRoomAction")
	private ClassRoomBiz classRoomBiz;

	@RequestMapping(params="findAll")
	public String findAll(Model m){
		m.addAttribute("classRoom_list", classRoomBiz.findAll());
		
		return "view/classinfo/classroominfo/classroominfo_list";
	}
	
	@RequestMapping(params="save")
	public String save(ClassRoom c){
		if(classRoomBiz.save(c)>0){
			return "redirect:classRoom.do?findAll";
		}
		
		return "view/classinfo/classroominfo/classroominfo_add";
	}
	
	@RequestMapping(params="byName")
	public String findByName(String name,Model m){
		m.addAttribute("classRoom_list",classRoomBiz.findByName(name));
		
		return "view/classinfo/classroominfo/classroominfo_list";
	}
	
	@RequestMapping(params="byId")
	public String findById(int id,Model m){
		m.addAttribute("classRoom_list", classRoomBiz.findById(id));
		
		return "view/classinfo/classroominfo/classroominfo_update";
	}
	
	@RequestMapping(params="update")
	public String update(ClassRoom r){
		if (classRoomBiz.update(r)>0) {
			return "redirect:classRoom.do?findAll";
		} 
		return "view/classinfo/classroominfo/classroominfo_update";
	}
	
	@RequestMapping(params="delete")
	public String delete(int id){
		if (classRoomBiz.delete(id)>0) {
			return "redirect:classRoom.do?findAll";
		}
		
		return "view/classinfo/classroominfo/classroominfo_list";
	}
	
	
	public void setClassRoomBiz(ClassRoomBiz classRoomBiz) {
		this.classRoomBiz = classRoomBiz;
	} 
}
