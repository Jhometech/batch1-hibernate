package in.javahome.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.HibUtil;

public class SelectName {
	public static void main(String[] args) {
		
		Session session = HibUtil.getSession();
		
		Query hql = session.createQuery("select name,phone from Student");
		
		List<Object[]> list = hql.list();
		for (Object[] data: list) {
			System.out.println("Name "+data[0]);
			System.out.println("Phone "+data[1]);
		}
	}
}
