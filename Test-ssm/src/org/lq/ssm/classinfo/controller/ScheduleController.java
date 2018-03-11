package org.lq.ssm.classinfo.controller;

import javax.annotation.Resource;

import org.lq.ssm.classinfo.service.ScheduleBiz;
import org.lq.ssm.entity.Schedule;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("schedule.do")
public class ScheduleController {
	
	@Resource(name="scheduleAction")
	private ScheduleBiz scheduleBiz;
	
	
	@RequestMapping(params="findAll")
	public String findAll(Model m){
		m.addAttribute("schedule_list", scheduleBiz.findAll());
		
		return "view/classinfo/syllabusinfo/syllabusinfo_list";
	}
	
	@RequestMapping(params="byName")
	public String findByName(String name,Model m){
		m.addAttribute("schedule_list",scheduleBiz.findByName(name));
		
		return "view/classinfo/syllabusinfo/syllabusinfo_list";
	}
	
	@RequestMapping(params="byId")
	public String findById(int id,Model m){
		m.addAttribute("schedule_list", scheduleBiz.findById(id));
		
		return "view/classinfo/syllabusinfo/syllabusinfo_update";
	}
	
	@RequestMapping(params="save")
	public String save(Schedule s){
		if (scheduleBiz.save(s)>0) {
			return "redirect:schedule.do?findAll";
		}
		
		return "view/classinfo/syllabusinfo/disciplineinfo_add";
	}
	
	@RequestMapping(params="delete")
	public String delete(int id){
		if (scheduleBiz.delete(id)>0) {
			return "redirect:schedule.do?findAll";
		}
		return "view/classinfo/syllabusinfo/syllabusinfo_list";
		
	}
	
	
	
	
	public void setScheduleBiz(ScheduleBiz scheduleBiz) {
		this.scheduleBiz = scheduleBiz;
	}
	
}
