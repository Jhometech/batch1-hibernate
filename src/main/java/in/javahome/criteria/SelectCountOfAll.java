package in.javahome.criteria;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class SelectCountOfAll {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Criteria crit = session.createCriteria(Student.class);
		crit.setProjection(Projections.count("stdId"));
		System.out.println("Count "+crit.uniqueResult());
	}
}
