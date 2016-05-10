package in.javahome.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtil {
	// Getting Hibernate Session
	// Step-1 Read hibernate.cfg.xml file
	static Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

	public static Session getSession() {
		// Step-2 Get SessionFactory
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		// Step-3 Get Session
		Session session = sessionFactory.openSession();
		return session;
	}
}
