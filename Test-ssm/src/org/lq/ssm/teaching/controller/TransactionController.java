package org.lq.ssm.teaching.controller;



import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.lq.ssm.classinfo.service.ClassesBiz;
import org.lq.ssm.entity.Transaction;
import org.lq.ssm.teaching.service.TransactionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("trans.do")
public class TransactionController {
	@Resource(name="transactionServiceImpl")
	private TransactionService trans;
	@Resource(name="classAction")
	private ClassesBiz classBiz;
	
	public void setTrans(TransactionService trans) {
		this.trans = trans;
	}
	public void setClassBiz(ClassesBiz classBiz) {
		this.classBiz = classBiz;
	}



	@RequestMapping(params="findAll")
	public String findAll(Model m){
		m.addAttribute("transactionList",trans.findAll());
		return "view/teaching/transaction/transaction_list";
		
	}
	@RequestMapping(params="save")
	public String save(Transaction t){
		if(trans.save(t)){
			return "redirect:trans.do?findAll";
		}
		return "view/teaching/transaction/transaction_add";
		
	}
	@RequestMapping(params="getClasses")
	public String getClasses(Model m){
		m.addAttribute("classList", classBiz.findAll());
		
		return "view/teaching/transaction/transaction_add";
		
	}
	@RequestMapping(params="findById")
	public String findById(Integer id,Model m){
		m.addAttribute("classes", classBiz.findAll());
		m.addAttribute("transaction",trans.findById(id));
		return "view/teaching/transaction/transaction_update";
		
	}
	@RequestMapping(params="update")
	public String update(Transaction t){
		if(trans.update(t)){
			return "redirect:trans.do?findAll";
		}
		return "view/teaching/transaction/transaction_update";	
	}
	@RequestMapping(params="delete")
	public String delete(Integer id){
		trans.delete(id);
		return "redirect:trans.do?findAll";
		
	}
	@RequestMapping(params="findByTilte")
	public String findByTilte(String title,Model m){
		m.addAttribute("transactionList",trans.findByTitle(title));
		return "view/teaching/transaction/transaction_list";
		
	}
}
