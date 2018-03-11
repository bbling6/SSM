package org.lq.ssm.classinfo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.lq.ssm.classinfo.service.SubjectBiz;
import org.lq.ssm.entity.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("subject.do")
public class SubjectController {
	
	@Resource(name="subjectAction")
	private SubjectBiz subjectBiz;
	
	@RequestMapping(params="find")
	public String findAll(Model m){
		m.addAttribute("subjectList", subjectBiz.findAll());
		
		return "view/classinfo/disciplineinfo/disciplineinfo_list";
	}
	
	@RequestMapping(params="save")
	public String save(Subject s){
		if(subjectBiz.save(s)>0){
			return "redirect:subject.do?find";
		}
		return "view/classinfo/disciplineinfo/disciplineinfo_add";
	}
	//Ä£ºý²éÑ¯
	@RequestMapping(params="byName")
	public String findByName(String name,Model m){
		m.addAttribute("subjectList", subjectBiz.findByName(name));
		
		return "view/classinfo/disciplineinfo/disciplineinfo_list";
	}
	//byid
	@RequestMapping(params="byId")
	public String findById(Integer id,Model m){
		m.addAttribute("subjectList", subjectBiz.findById(id));
		return "view/classinfo/disciplineinfo/disciplineinfo_update";
	}
	
	//É¾³ý
	@RequestMapping(params="delete")
	public String delete(int id){
		if(subjectBiz.delete(id)>0){
			return "redirect:subject.do?find";
		}
		return "view/classinfo/disciplineinfo/disciplineinfo_list";
	}
	//ÐÞ¸Ä
	@RequestMapping(params="update")
	public String update(Subject s){
		if (subjectBiz.update(s)>0) {
			return "redirect:subject.do?find";
		}
		return "view/classinfo/disciplineinfo/disciplineinfo_update";
	}
	
	
	
	
	public void setSubjectBiz(SubjectBiz subjectBiz) {
		this.subjectBiz = subjectBiz;
	}
	
}
