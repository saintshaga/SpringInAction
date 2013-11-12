package cn.saintshaga.SpringInAction.chapt01.hello;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class HelloApp {
	public static void main(String[] args) throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/saintshaga/SpringInAction/chapt01/hello/hello.xml");
		GreetingService greetingService = (GreetingService)context.getBean("greetingService");
		greetingService.sayGreeting();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("mail.xml");
//		Email email = (Email)context.getBean("email");
//		email.setSmtpPort(465);
//		email.setAuthenticator((DefaultAuthenticator)factory2.getBean("defaultAuthenticator"));
//    	email.setFrom("huang_f@worksap.co.jp");
//		email.setSubject("testMailFromJava");
//    	email.setMsg("This is a test mail ...");
//    	email.addTo("saintshaga@gmail.com");
//    	email.send();
//    	System.out.println("send successfully");
	}

}
