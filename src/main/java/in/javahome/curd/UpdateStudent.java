package in.javahome.curd;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class UpdateStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Student std = session.get(Student.class, 2);
		Transaction tx = session.beginTransaction();
		std.setName("Raghu");
		std.setPhone("7777777777");
		session.update(std);
		tx.commit();
	}

}
