package in.javahome.criteria;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;

import in.javahome.hibernate.HibUtil;
import in.javahome.onetomay.Employee;
import in.javahome.onetomay.Vehicle;

public class BatchSizeDemo {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Criteria crit = session.createCriteria(Employee.class);
		List<Employee> list = crit.list();// hits db with select
		for (Employee emp : list) {
			System.out.println("Emp Name-> "+emp.getName());
			System.out.println("---------------");
			Set<Vehicle> vehicles = emp.getVehicles();
			for (Vehicle vehicle : vehicles) {
				System.out.println("Vehicle Name-> "+vehicle.getName());
			}
		
		}
	}
}
