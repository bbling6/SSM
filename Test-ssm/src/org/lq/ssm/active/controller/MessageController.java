package org.lq.ssm.active.controller;

import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.lq.ssm.active.service.MessageService;
import org.lq.ssm.active.service.TemplateService;
import org.lq.ssm.entity.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("msg.do")
public class MessageController {
	@Resource(name="messageServiceImpl")
	private MessageService messageServiceImpl;
	@Resource(name="templateServiceImpl")
	private TemplateService templateServiceImpl;

	public void setTemplateServiceImpl(TemplateService templateServiceImpl) {
		this.templateServiceImpl = templateServiceImpl;
	}

	public void setMessageServiceImpl(MessageService messageServiceImpl) {
		this.messageServiceImpl = messageServiceImpl;
	}
	
	@RequestMapping(params="findAll")
	public String findAll(Model m){
		m.addAttribute("msg_list", messageServiceImpl.findAll());
		return "view/marketactive/messafeinfo/messafeinfo_list";
	}
	@RequestMapping(params="findById")
	public String findById(Model m,Integer id){
		m.addAttribute("msg_list", messageServiceImpl.findById(id));
		System.out.println(messageServiceImpl.findById(id));
		return "view/marketactive/messafeinfo/messafeinfo_show";
	}
	
	@RequestMapping(params="delete")
	public String delete(Integer id,Model m){
		messageServiceImpl.delete(id);
		return "msg.do?findAll";
	}
	
	@RequestMapping(params="getTem")
	public String getTem(Model m){
		m.addAttribute("tem_list", messageServiceImpl.getTem());
		return "view/marketactive/messafeinfo/messafeinfo_send";
	}
	@RequestMapping(params="findId")
	public String findId(Integer modelId,HttpServletResponse response){
		response.setContentType("text/html;charset=GBK");
		try {
			response.getWriter().print(templateServiceImpl.findById(modelId).getTempContent());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	@RequestMapping(params="findByTel")
	public String findByTel(Model m,Integer tel){
		m.addAttribute("msg_list", messageServiceImpl.findByTel(tel));
		return "view/marketactive/messafeinfo/messafeinfo_list";
	}
	@RequestMapping(params="save")
	public String save(Model m,Message me){
		me.setPostTime(new Date());
		if(messageServiceImpl.save(me)){
			return "redirect:msg.do?findAll";
		}
		return "view/marketactive/messafeinfo/messafeinfo_send";
	}
	
}
