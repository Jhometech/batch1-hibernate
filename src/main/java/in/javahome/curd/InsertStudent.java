package in.javahome.curd;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class InsertStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Student std = new Student();
//		std.setStdId(10);
		Transaction tx = session.beginTransaction();
		std.setName("Krishna");
		std.setPhone("888888666");
		session.save(std);
		tx.commit();// This triggers the sql queries
	}
}
