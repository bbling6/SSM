package org.lq.ssm.active.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Results;
import org.lq.ssm.active.service.TemplateService;
import org.lq.ssm.entity.Template;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tem.do")
public class TemplateController {
	
	@Resource(name="templateServiceImpl")
	private TemplateService templateServiceImpl;
	
	@RequestMapping(params="save")
	public String save(Template t){
		if(templateServiceImpl.save(t)){
			return "redirect:tem.do?findAll";
		}
		return "view/marketactive/template/template_add";
	}

	@RequestMapping(params="findAll")
	public String findAll(Model m){
		List<Template> list=templateServiceImpl.findAll();
		m.addAttribute("tem_list", list);
		return "view/marketactive/template/template_list";
	}
	
	@RequestMapping(params="findSeq")
	public String findSeq(Model m){
		int count=templateServiceImpl.findSeq();
		m.addAttribute("temseq_list", count);
		return "view/marketactive/template/template_add";
	}
	@RequestMapping(params="delete")
	public String delete(int id,Model m){
		templateServiceImpl.delete(id);
		return "redirect:tem.do?findAll";
	}
	@RequestMapping(params="findById")
	public String findById(Integer id,HttpSession session){
		session.setAttribute("tem_list", templateServiceImpl.findById(id));
		return "view/marketactive/template/template_update";
	}
	@RequestMapping(params="update")
	public String update(Template t,HttpSession session){
		Template tem=(Template) session.getAttribute("tem_list");
		t.setId(tem.getId());
		if(templateServiceImpl.update(t)){
			return "redirect:tem.do?findAll";
		}
		return "view/marketactive/template/template_update";
	}
	@RequestMapping(params="findLike")
	public String findLike(Model m,String title){
			m.addAttribute("tem_list", templateServiceImpl.findLike(title));
		return "view/marketactive/template/template_list";
	}
	
	
	
	
	
	public void setTemplateServiceImpl(TemplateService templateServiceImpl) {
		this.templateServiceImpl = templateServiceImpl;
	}
	
}
