package in.javahome.curd;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class MergeExample {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Student std1 = session.get(Student.class, 2);
		Transaction tx = session.beginTransaction();
		Student std2 = new Student();
		std2.setStdId(2);
		std2.setName("Raghu");
		std2.setPhone(null);
		session.update(std2);
		tx.commit();
	}

}
