package in.javahome.hql;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.HibUtil;

public class DeleteExample {
	public static void main(String[] args) {
		
		Session session = HibUtil.getSession();
		
		Query hql = session.createQuery("delete from Student where stdId=?");
		hql.setInteger(0, 2);
		hql.executeUpdate();
	}
}
