package cn.saintshaga.hibernate.hello.annotation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/saintshaga/hibernate/hibernate.xml");
		SessionFactory sessionFactory = (SessionFactory)context.getBean("sessionFactoryAnnotation");
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Message message = new Message("Hello World!");
		Long msgId = (Long) session.save(message);
		
		tx.commit();
		session.close();
		
		
//		Session session3 = sessionFactory.openSession();
//		Transaction tx3 = session3.beginTransaction();
//		
//		Message message2 = (Message)session3.get(Message.class, msgId);
//		message2.setText("Greetings Earthling");
//		
//		message2.setNextMessage(new Message("Take me to your leader please"));
//		
//		tx3.commit();
//		session3.close();
//		Session session2 = sessionFactory.openSession();
//		Transaction tx2 = session2.beginTransaction();
//		List<Message> messages = session2.createQuery("from Message m order by m.id asc").list();
//		
//		for (Message message3 : messages) {
//			System.out.println(message3);
//		}
//		
//		tx2.commit();
//		session2.close();
	}

}
