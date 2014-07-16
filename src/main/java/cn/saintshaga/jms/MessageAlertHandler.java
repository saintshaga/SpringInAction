package cn.saintshaga.jms;

import javax.jms.Message;

public class MessageAlertHandler{

	public void processMessage(String message) {
		System.out.println(message);
	}

}
