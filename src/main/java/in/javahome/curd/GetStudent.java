package in.javahome.curd;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.HibUtil;

public class GetStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Query sql = session.getNamedQuery("selectSQL");
		sql.list();
//		Student std = session.get(Student.class, 1);
		/*session.refresh(std);
		
		System.out.println(std.getName());
		System.out.println(std.getPhone());
		System.out.println(std.getStdId());*/
	}
}
