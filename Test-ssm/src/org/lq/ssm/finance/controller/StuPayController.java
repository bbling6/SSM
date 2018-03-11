package org.lq.ssm.finance.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.lq.ssm.entity.Staff;
import org.lq.ssm.entity.Stu_Payment;
import org.lq.ssm.entity.Student;
import org.lq.ssm.finance.biz.StuPayBiz;
import org.lq.ssm.student.service.StudentBiz;
import org.lq.ssm.util.service.DictionoryBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("stupay.do")
public class StuPayController {
	@Resource(name="studentBizImpl")
	private StudentBiz studentBiz;
	@Resource(name="dictionoryBizImpl")
	private DictionoryBiz dictbiz;
	@Resource(name="spaybiz")
	private StuPayBiz stuPayBiz;
	
	
	@RequestMapping(params="findstu")
	public String findStu(Model model){
		model.addAttribute("stulist",studentBiz.getstubypay("2"));
		model.addAttribute("intention",dictbiz.findBytype("intention_type"));
		return "view/finance/stu_payment";
	}
	@RequestMapping(params="getstu")
	public String getStubyId(Integer sid,Model model){
		model.addAttribute("thisstu",studentBiz.findById(sid));
		model.addAttribute("pay_type",dictbiz.findBytype("payment_method"));
		model.addAttribute("shouldpay",stuPayBiz.should(sid));
		return "view/finance/stupay";
	}
	
	@RequestMapping(params="addstupay")
	public String addstupay(Stu_Payment stupay,Model model){
		if(stuPayBiz.save(stupay)){
			Student student=studentBiz.findById(stupay.getStudent().getId());
			model.addAttribute("thisstu",student);
			model.addAttribute("thisStupay",stuPayBiz.findpaybysid(student.getId()));
			return "view/finance/stuPayEnd";
		}
		return "stupay.do?getstu";
	}
	@RequestMapping(params="getstuinfo")
	public String getstuinfo(Integer sid,Model model){
		model.addAttribute("thisstu",studentBiz.findById(sid));
		model.addAttribute("thisStupay",stuPayBiz.findpaybysid(sid));
		return "view/finance/stuPayEnd";
	}
	@RequestMapping(params="getByCon")
	public String getstuByCon(String studentName,Integer studentSate,Model model){
		if(studentName!=null&&!"".equals(studentName)&&studentSate!=null&&!"".equals(studentSate)){
			model.addAttribute("stulist",studentBiz.findByCon(studentName, studentSate));
		}else if(studentName!=null&&!"".equals(studentName)){
			model.addAttribute("stulist",studentBiz.findByCon(studentName, null));
		}else if(studentSate!=null&&!"".equals(studentSate)){
			model.addAttribute("stulist",studentBiz.findByCon(null, studentSate));
		}else{
			model.addAttribute("stulist",studentBiz.findByCon(null, null));
		}
		model.addAttribute("intention",dictbiz.findBytype("intention_type"));
		return "view/finance/stu_payment";
	}
	public void setStudentBiz(StudentBiz studentBiz) {
		this.studentBiz = studentBiz;
	}
}
