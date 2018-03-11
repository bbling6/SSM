package org.lq.ssm.active.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.lq.ssm.active.service.EmailService;
import org.lq.ssm.active.service.TemplateService;
import org.lq.ssm.entity.Email;
import org.lq.ssm.entity.Staff;
import org.lq.ssm.system.service.StaffBiz;
import org.lq.ssm.util.Sendmail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ema.do")
public class EmailController {
	
	@Resource(name="emailServiceImpl")
	private EmailService emailServiceImpl;
	@Resource(name="templateServiceImpl")
	private TemplateService templateServiceImpl;
	
	 @Resource(name="staffBizImpl")
	   private StaffBiz staffBiz;
	
	 public void setStaffBiz(StaffBiz staffBiz) {
			this.staffBiz = staffBiz;
		  }
	 
	public void setTemplateServiceImpl(TemplateService templateServiceImpl) {
		this.templateServiceImpl = templateServiceImpl;
	}
	@RequestMapping(params="findAll")
	public String findAll(Model m){
		m.addAttribute("email_list", emailServiceImpl.findAll());
		return "view/marketactive/emailinfo/emailinfo_list";
	}
	@RequestMapping(params="findById")
	public String findById(Model m,Integer id){
		m.addAttribute("ema_list", emailServiceImpl.findById(id));
		System.out.println(emailServiceImpl.findById(id).toString());
		return "view/marketactive/emailinfo/emailinfo_show";
	}
	@RequestMapping(params="delete")
	public String delete(Integer id,Model m){
		emailServiceImpl.delete(id);
		m.addAttribute("email_list", emailServiceImpl.findAll());
		return "view/marketactive/emailinfo/emailinfo_list";
	}
	
	@RequestMapping(params="getTem")
	public String getTem(Model m){
		m.addAttribute("tem_list", emailServiceImpl.getTem());
		
		List<Staff> list=staffBiz.findAll();
		m.addAttribute("staList",list);

		return "view/marketactive/emailinfo/emailinfo_send";
	}
	
	//发送
	@RequestMapping(params="send")
	public String send(Model m,Email e){
		
		if(emailServiceImpl.save(e)>0){
			m.addAttribute("emailMess","邮件发送成功！" );
			
		}else{
			m.addAttribute("emailMess","邮件发送失败！" );
		}
		
		try{
			System.out.println("把用户信息注册到数据库中");

			
            //用户注册成功之后就使用用户注册时的邮箱给用户发送一封Email
            //发送邮件是一件非常耗时的事情，因此这里开辟了另一个线程来专门发送邮件
			e.setPostTime(new Date());
			
            Sendmail send = new Sendmail(e);
            //启动线程，线程启动之后就会执行run方法来发送邮件
            send.start();

            System.out.println("恭喜您，注册成功，我们已经发了一封带了注册信息的电子邮件，请查收，如果没有收到，可能是网络原因，过一会儿就收到了！！");
            
        }catch (Exception ee){
            ee.printStackTrace();
           System.out.println("操作失败！！");
           m.addAttribute("emailMesserr","邮件发送失败！" );
            
        }
		return "view/marketactive/emailinfo/emailinfo_mess";
	}
	
	@RequestMapping(params="findTitle")
	public String findTitle(Model m,String title){
		m.addAttribute("email_list", emailServiceImpl.findByTitle(title));
		return "view/marketactive/emailinfo/emailinfo_list";
	}
	
	
	
	
	//查询模板
	@RequestMapping(params="findId")
	public String findId(Integer modelId,HttpServletResponse response){
		response.setContentType("text/html;charset=GBK");
			String str1=templateServiceImpl.findById(modelId).getTempContent();
			try {
				response.getWriter().print(str1);
			} catch (IOException e) {
			}	
			
		return null;
	}
//	@RequestMapping(params="getTitle")
//	public String getTitle(Integer mid,HttpServletResponse response){
//		response.setContentType("text/html;charset=GBK");
//		try {
//			response.getWriter().print(templateServiceImpl.findById(mid).getTempTittle());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
	
	
	
	
	public void setEmailServiceImpl(EmailService emailServiceImpl) {
		this.emailServiceImpl = emailServiceImpl;
	}
	
	
}
