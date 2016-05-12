package in.javahome.curd;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class InsertStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Student std = new Student();
		std.setStdId(10);
		Transaction tx = session.beginTransaction();
		std.setName("Ranga");
		std.setPhone("6666666666");
		session.save(std);
		session.evict(std);
		tx.commit();// This triggers the sql queries
	}
}
