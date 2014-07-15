package cn.saintshaga.hibernate.hello;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.saintshaga.hibernate.CENamingStrategy;

public class Main {

	private static SessionFactory getSessionFactoryFromSpring() {
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/saintshaga/hibernate/hibernate.xml");
		return (SessionFactory)context.getBean("sessionFactory");		
	}
	
	private static SessionFactory getSessionFactoryFromHiberante() {
		Configuration cfg = new Configuration();
//		cfg.setNamingStrategy(new CENamingStrategy());
		return cfg.configure().buildSessionFactory();
	}
	public static void main(String[] args) {
		SessionFactory sessionFactory = getSessionFactoryFromSpring();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		User user = new User();
		user.setEmail("test@worksap.co.jp");
		user.setUsername("test");
		
		Address address1 = new Address();
		address1.setCity("Shanghai");
		address1.setZipCode("12345");
		address1.setStreet("Yan an west road");
		address1.setUser(user);
		user.setAddress(address1);

		Address address2 = new Address();
		address2.setCity("Wuxi");
		address2.setZipCode("234524");
		address2.setStreet("Wu ai road");
		address2.setUser(user);		
		user.setAddress(address2);
		
		session.save(user);
		tx.commit();
		session.close();
		
//		Message message = new Message("Hello World!");
//		Long msgId = (Long) session.save(message);
//		
//		tx.commit();
//		session.close();
//		
//		
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
