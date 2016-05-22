package in.javahome.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import in.javahome.hibernate.HibUtil;
import in.javahome.hibernate.Student;

public class SelectNameAndIDFromStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Criteria crit = session.createCriteria(Student.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.property("name"));
		pList.add(Projections.property("stdId"));
		crit.setProjection(pList);
		List<Object[]> list = crit.list();// hits db with select
		for (Object[] data : list) {
			System.out.println("Name-> "+data[0]);
			System.out.println("ID-> "+data[1]);
		}
	}
}
