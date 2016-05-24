package in.javahome.hql;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.HibUtil;

public class SelectCount {
	public static void main(String[] args) {

		Session session = HibUtil.getSession();

		Query hql = session.createQuery("select name,count(name) from Student");

		System.out.println("Student Count-->" + hql.uniqueResult());
	}
}
