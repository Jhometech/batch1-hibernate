package in.javahome.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class SelectNameFromStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Criteria crit = session.createCriteria(Student.class);
		crit.setProjection(Projections.property("name"));
		List<String> list = crit.list();// hits db with select
		for (String name : list) {
			System.out.println("Name-> "+name);
			System.out.println("---------------");
		}
	}
}
