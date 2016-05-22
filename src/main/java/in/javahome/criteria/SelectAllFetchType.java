package in.javahome.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;

import in.javahome.hibernate.HibUtil;
import in.javahome.onetomay.Employee;

public class SelectAllFetchType {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Criteria crit = session.createCriteria(Employee.class);
		crit.setFetchMode("vehicles", FetchMode.EAGER);
		List<Employee> list = crit.list();// hits db with select
		for (Employee emp : list) {
			System.out.println("ID-> "+emp.getEmpId());
			System.out.println("Name-> "+emp.getName());
			System.out.println("Salary-> "+emp.getSalary());
			System.out.println("---------------");
		}
	}
}
