package in.javahome.curd;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class FlushExample {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
	
		for (int i = 0; i < 100000; i++) {
			Student std = new Student();			
			std.setStdId(i);
			std.setName("Ranga"+i);
			std.setPhone("66666"+i);
			session.save(std);
			if(i%10000 == 0){
				session.flush();
				session.clear();
			}
		}
		tx.commit();// This triggers the sql queries
	}
}
