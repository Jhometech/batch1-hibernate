package in.javahome.curd;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class UpdateStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Student std = session.get(Student.class, 4);
		Transaction tx = session.beginTransaction();
		
		tx.commit();
//		session.clear();
		std.setName("Hari P Kammana");
		std.setPhone("7777777777");
	}

}
