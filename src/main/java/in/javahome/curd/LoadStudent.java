package in.javahome.curd;

import org.hibernate.Session;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class LoadStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();

		Student std = session.load(Student.class, 3);
		System.out.println("Hi");
		System.out.println(std.getName());
		System.out.println(std.getPhone());
		System.out.println(std.getStdId());
	}
}
