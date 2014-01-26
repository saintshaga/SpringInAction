package cn.saintshaga.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSeesionFactory() {
		return sessionFactory;
	}
	
	public static void shutdown() {
		getSeesionFactory().close();
	}
}
