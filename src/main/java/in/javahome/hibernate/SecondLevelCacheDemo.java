package in.javahome.hibernate;

import org.hibernate.Session;

public class SecondLevelCacheDemo {
	public static void main(String[] args) {
		Session session1 = HibUtil.getSession();
		Session session2 = HibUtil.getSession();
		Student s1 = session1.get(Student.class, 4);
		Student s2 = session2.get(Student.class, 4);

		System.out.println(s1.getName());
		System.out.println(s2.getName());
	}
}
