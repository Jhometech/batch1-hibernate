package in.javahome.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class SelectAllWhereLike {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Criteria crit = session.createCriteria(Student.class);
		crit.add(Restrictions.like("name", "%r%"));
		List<Student> list = crit.list();// hits db with select
		for (Student std : list) {
			System.out.println("ID-> "+std.getStdId());
			System.out.println("Name-> "+std.getName());
			System.out.println("Phone-> "+std.getPhone());
			System.out.println("---------------");
		}
	}
}
