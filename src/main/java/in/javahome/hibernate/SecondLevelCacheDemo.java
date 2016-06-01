package in.javahome.hibernate;

import org.hibernate.LockMode;
import org.hibernate.Session;

public class SecondLevelCacheDemo {
	public static void main(String[] args) {
		
		Session session = HibUtil.getSession();
		session.get(Student.class, 1, LockMode.PESSIMISTIC_WRITE);
		
	}
}
