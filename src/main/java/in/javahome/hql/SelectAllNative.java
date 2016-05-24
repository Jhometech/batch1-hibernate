package in.javahome.hql;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class SelectAllNative {
	public static void main(String[] args) {

		Session session = HibUtil.getSession();

		String nativeQuery = "SELECT * FROM STUDENT_DETAILS";
		SQLQuery sqlQuery = session.createSQLQuery(nativeQuery);
		sqlQuery.addEntity(Student.class);
		List<Student> list = sqlQuery.list();
		for (Student std : list) {
			System.out.println(std.getName());
			System.out.println(std.getPhone());
			System.out.println("---------------------");
		}

	}
}
