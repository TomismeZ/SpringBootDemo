package com.zdk.demo.web;

import javax.mail.internet.MimeMessage;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;  
import org.springframework.mail.javamail.MimeMessageHelper; 
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.zdk.demo.bean.JsonResult;  
  

@RestController  
@RequestMapping("mail") 
public class MailController {
	 @Autowired  
	 JavaMailSender mailSender; 
	 
	 @RequestMapping("sendemail")  
	    public ResponseEntity<JsonResult> sendEmail()  
	    {  
		 JsonResult r = new JsonResult();
	        try  
	        {  
	            final MimeMessage mimeMessage = this.mailSender.createMimeMessage();  
	            final MimeMessageHelper message = new MimeMessageHelper(mimeMessage);  
	            message.setFrom("dunkun0907@126.com");  
	            message.setTo("dunkun0907@126.com");  
	            message.setSubject("测试邮件主题");  
	            message.setText("测试邮件内容");  
	            this.mailSender.send(mimeMessage);  
	            
//	            r.setResult(user);
				r.setStatus("ok");
//	            ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(),  
//	                    ResultStatusCode.OK.getErrmsg(), null);  
//	            return resultMsg;  
	        }  
	        catch(Exception e)  
	        {  
	        	r.setResult(e.getClass().getName() + ":" + e.getMessage());
				r.setStatus("error");
//	            ResultMsg resultMsg = new ResultMsg(ResultStatusCode.SYSTEM_ERR.getErrcode(),  
//	                    ResultStatusCode.SYSTEM_ERR.getErrmsg(), null);  
//	            return resultMsg;  
	        }  
	        
	        return ResponseEntity.ok(r);
	    }  
}
