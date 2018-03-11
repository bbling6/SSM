package org.lq.ssm.util;


import javax.mail.*;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Test {

	/**
	 * @param args
	 */
	
/*	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		// 创建Mail对象
		Email mail = new SimpleEmail();
		// 设置发送邮件的主机服务器
		mail.setHostName("smtp.qq.com");
		// 设置发送邮件的端口号
		mail.setSmtpPort(465);
		// 设置发送者的邮箱地址和密码(开通smtp时的验证码)
		mail.setAuthentication("1094538158@qq.com","xodiuddndobrihig");
		// 设置安全连接
		mail.setSSLOnConnect(true);
		//设置发送者的邮件
		mail.setFrom("1094538158@qq.com");
		// 设置主题
		mail.setSubject("test");
		// 设置邮件内容
		mail.setMsg("ceshi数据");
		// 设置接收者邮件
		mail.addTo("18333559593@163.com");
		// 发送邮件
		mail.send();
		
	}*/
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			System.out.println("把用户信息注册到数据库中");
            //用户注册成功之后就使用用户注册时的邮箱给用户发送一封Email
            //发送邮件是一件非常耗时的事情，因此这里开辟了另一个线程来专门发送邮件
          //  Sendmail send = new Sendmail();
            //启动线程，线程启动之后就会执行run方法来发送邮件
        //    send.start();
            
            //注册用户
            //new UserService().registerUser(user);
            System.out.println("恭喜您，注册成功，我们已经发了一封带了注册信息的电子邮件，请查收，如果没有收到，可能是网络原因，过一会儿就收到了！！");
            
        }catch (Exception e) {
            e.printStackTrace();
           System.out.println("注册失败！！");
            
        }
	}

}
