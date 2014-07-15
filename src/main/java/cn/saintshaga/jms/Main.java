package cn.saintshaga.jms;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.JmsUtils;

public class Main {

	public static void main(String[] args) throws JMSException{
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/saintshaga/jms/jms.xml");
		
//		AlertService service = (AlertService)context.getBean("service");
//		service.send("This is from jms template");
		JmsTemplate jmsTemplate = (JmsTemplate)context.getBean("jmsTemplate");
		try {
			TextMessage message = (TextMessage)jmsTemplate.receive();
			System.out.println(message.getText());
		} catch (JMSException e) {
			throw JmsUtils.convertJmsAccessException(e);
		}
	}

}
