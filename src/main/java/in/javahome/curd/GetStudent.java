package in.javahome.curd;

import org.hibernate.Session;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class GetStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();

		Student std = session.get(Student.class, 1);
		session.refresh(std);
		
		System.out.println(std.getName());
		System.out.println(std.getPhone());
		System.out.println(std.getStdId());
	}
}
