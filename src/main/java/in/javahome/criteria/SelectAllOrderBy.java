package in.javahome.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class SelectAllOrderBy {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Criteria crit = session.createCriteria(Student.class);
		crit.add(Restrictions.like("name", "%r%"));
		crit.addOrder(Order.asc("name"));
		List<Student> list = crit.list();// hits db with select
		for (Student std : list) {
			System.out.println("ID-> "+std.getStdId());
			System.out.println("Name-> "+std.getName());
			System.out.println("Phone-> "+std.getPhone());
			System.out.println("---------------");
		}
	}
}
