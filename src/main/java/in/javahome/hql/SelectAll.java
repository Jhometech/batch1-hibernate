package in.javahome.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class SelectAll {
	public static void main(String[] args) {
		
		Session session = HibUtil.getSession();
		
		Query hql = session.createQuery("from Student");
		
		List<Student> list = hql.list();
		for (Student std: list) {
			System.out.println("Name "+std.getName());
			System.out.println("Phone "+std.getPhone());
		}
	}
}
