package in.javahome.criteria;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import in.javahome.hibernate.HibUtil;
import in.javahome.onetomay.Employee;

public class CriteriaOnAssociatedEntity {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Criteria crit = session.createCriteria(Employee.class);
		Criteria vehileCrit = crit.createCriteria("vehicles");
		vehileCrit.add(Restrictions.gt("vehicleNo", 1));
		vehileCrit.list();
		
	}
}
