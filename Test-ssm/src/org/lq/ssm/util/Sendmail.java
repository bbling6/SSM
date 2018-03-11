package org.lq.ssm.util;


import java.security.Security;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Provider;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.lq.ssm.entity.Email;




/**
* @ClassName: Sendmail
* @Description: Sendmail类继承Thread，因此Sendmail就是一个线程类，这个线程类用于给指定的用户发送Email
* @author: 孤傲苍狼
* @date: 2015-1-12 下午10:43:48
*
*/ 
public class Sendmail extends Thread {
        //用于给用户发送邮件的邮箱
    private String from = "1094538158@qq.com";
        //发送邮箱的用户名
    private String username = "1094538158@qq.com";
        //邮箱的密码
    private String password = "xodiuddndobrihig";
        //发送邮件的服务器地址
    private String host = "smtp.qq.com";
    
    //发去哪？
    private String to =null ;
    
    //内容信息
    private String info = null;
    
    //标题
    private String tit = null;
    
    //接受人
    private String rec = null;
    
    
    public Sendmail(Email e) {
    	this.to=e.getReceiveAddress();
    	this.info=e.getEmailContent();
    	this.tit=e.getTitle();
    	this.rec=e.getReceiveMan();
		
	}
    
    /* 重写run方法的实现，在run方法中发送邮件给指定的用户
     * @see java.lang.Thread#run()
     */
    @Override
    public void run() {
        try{
            Properties prop = new Properties();
            prop.setProperty("mail.smtp.host", host);
            prop.setProperty("mail.transport.protocol", "smtp");
            prop.setProperty("mail.smtp.auth", "true");
            prop.setProperty("mail.smtp.ssl.enable", "true");
           // Security.addProvider(new Provider()); 
          //  prop.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            prop.setProperty("mail.smtp.port", "465");
            prop.setProperty("mail.smtp.socketFactory.port", "465");
            
            Session session = Session.getInstance(prop);
            session.setDebug(true);
            Transport ts = session.getTransport();
            //ts.connect();
            ts.connect(host, username, password);
            Message message = createEmail(session);
            ts.sendMessage(message, message.getAllRecipients());
            ts.close();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
    * @Method: createEmail
    * @Description: 创建要发送的邮件
    * @Anthor:孤傲苍狼
    *
    * @param session
    * @param user
    * @return
    * @throws Exception
    */ 
    public Message createEmail(Session session) throws Exception{
        
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject(tit);
        
       
        message.setContent("亲爱的"+rec+info, "text/html;charset=UTF-8");
        message.saveChanges();
        return message;
    }
}