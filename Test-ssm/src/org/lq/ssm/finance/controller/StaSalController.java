package org.lq.ssm.finance.controller;


import javax.annotation.Resource;

import org.lq.ssm.entity.Staff;
import org.lq.ssm.entity.Staff_Salary;
import org.lq.ssm.finance.biz.StaSalBiz;
import org.lq.ssm.system.service.StaffBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("stasal.do")
public class StaSalController {
	@Resource(name="salbiz")
	private StaSalBiz salbiz;
	@Resource(name="staffBizImpl")
	private StaffBiz staffBiz;
	
	@RequestMapping(params="saves")
	public String save(Staff_Salary salary,Model model){
		if(salbiz.save(salary)){
			model.addAttribute("sallist",salbiz.findAll());
			return "view/finance/staff_salary";
		}
		return "view/finance/add_satsal";
	}
	@RequestMapping(params="findall")
	public String findAll(Model model){
		model.addAttribute("sallist",salbiz.findAll());
		return "view/finance/staff_salary";
	}
	@RequestMapping(params="receive")
	public String receive(Integer salid,Model model){
		if(salbiz.update(salid)){
			model.addAttribute("sallist",salbiz.findAll());
		}
		return "view/finance/staff_salary";
	}
	@RequestMapping(params="savebefore")
	public String findStaff(Model model){
		model.addAttribute("staffAll",staffBiz.findAll());
		return "view/finance/add_satsal";
	}
	@RequestMapping(params="findstasal")
	public String findstasal(String staffName,Model model){
		if(staffName!=""&staffName!=null){
			Staff staff=staffBiz.findByname(staffName);
			model.addAttribute("sallist",salbiz.getsalbysid(staff.getSid()));
		}else{
			model.addAttribute("sallist",salbiz.findAll());
		}
		return "view/finance/staff_salary";
	}
	
	public void setSalbiz(StaSalBiz salbiz) {
		this.salbiz = salbiz;
	}
	public void setStaffBiz(StaffBiz staffBiz) {
		this.staffBiz = staffBiz;
	}
}
