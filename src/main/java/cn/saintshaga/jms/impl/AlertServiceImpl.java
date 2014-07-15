package cn.saintshaga.jms.impl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import cn.saintshaga.jms.AlertService;

public class AlertServiceImpl implements AlertService{
	@Autowired
	JmsTemplate jmsTemplate;

	public void send(final String message) {
		jmsTemplate.send(new MessageCreator() {
			
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});
	}

}
