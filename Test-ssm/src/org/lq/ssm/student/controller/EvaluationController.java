package org.lq.ssm.student.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.lq.ssm.entity.StudentEvaluation;
import org.lq.ssm.student.service.EvaluationBiz;
import org.lq.ssm.student.service.StudentBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("evaluation.do")
public class EvaluationController {

	@Resource(name="evaluationBizImpl")
	private EvaluationBiz evaluationBiz;
	
	@Resource(name="studentBizImpl")
	private StudentBiz studentBiz;

	@RequestMapping(params="findAll")
	public String findAll(Model m,HttpSession session){
		session.setAttribute("evaluation_list", evaluationBiz.findAll());
		return "view/student/evaluationinfo/evaluationinfo_list";
	}
	
	@RequestMapping(params="bytitle")
	public String findByTitle(String title,Model m,HttpSession session){
		session.setAttribute("evaluation_list", evaluationBiz.findByTitle(title));
		return "view/student/evaluationinfo/evaluationinfo_list";
	}
	
	@RequestMapping(params="save")
	public String save(StudentEvaluation e){
		if(evaluationBiz.save(e)){
			return "redirect:evaluation.do?findAll";
		}
		return "view/student/evaluationinfo/evaluationinfo_add";
	}
	
	@RequestMapping(params="getStudent")
	public String getStudent(Model m){
		m.addAttribute("stu_list", studentBiz.findAll());
		return "view/student/evaluationinfo/evaluationinfo_add";
	}
	
	@RequestMapping(params="delete")
	public String delete(Integer id){
		if(evaluationBiz.delete(id)){
			return "redirect:evaluation.do?findAll";
		}
		return "view/student/evaluationinfo/evaluationinfo_list";
	}
	
	@RequestMapping(params="byid")
	public String findById(Integer id,Model m){
		m.addAttribute("stu_list", studentBiz.findAll());
		m.addAttribute("evaluation_list", evaluationBiz.findById(id));
		return "view/student/evaluationinfo/evaluationinfo_update";
	}
	
	@RequestMapping(params="update")
	public String update(StudentEvaluation e){
		if(evaluationBiz.update(e)){
			return "redirect:evaluation.do?findAll";
		}
		return "view/student/evaluationinfo/evaluationinfo_update";
	}
	
	
	public void setEvaluationBiz(EvaluationBiz evaluationBiz) {
		this.evaluationBiz = evaluationBiz;
	}

	public void setStudentBiz(StudentBiz studentBiz) {
		this.studentBiz = studentBiz;
	}
	
	
	
}
