package in.javahome.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import in.javahome.hibernate.HibUtil;
import in.javahome.onetomay.Employee;

public class GroupByDemo {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Criteria crit = session.createCriteria(Employee.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.count("name"));
		pList.add(Projections.groupProperty("name"));
		crit.setProjection(pList);
		List<Object[]> list = crit.list();
		for (Object[] d : list) {
			System.out.println("Name "+d[1] +" Count-->"+d[0]);
		}
	}
}
