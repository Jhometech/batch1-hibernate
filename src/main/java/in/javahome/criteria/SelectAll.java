package in.javahome.criteria;

import org.hibernate.Criteria;
import org.hibernate.Session;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class SelectAll {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Criteria crit = session.createCriteria(Student.class);
		crit.setCacheable(true);
		crit.list();
		Criteria crit2 = session.createCriteria(Student.class);
		crit2.setCacheable(true);
		crit2.list();
	}
}
