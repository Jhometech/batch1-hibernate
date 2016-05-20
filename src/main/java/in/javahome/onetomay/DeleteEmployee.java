package in.javahome.onetomay;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.HibUtil;

public class DeleteEmployee {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		Employee emp = session.get(Employee.class, 1111);
		session.delete(emp);
		tx.commit();
	}
}
