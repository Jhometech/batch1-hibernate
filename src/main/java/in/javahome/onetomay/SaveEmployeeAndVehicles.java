package in.javahome.onetomay;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.HibUtil;

public class SaveEmployeeAndVehicles {

	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setName("Nanda");
		emp.setSalary(60000);
		
		Set<Vehicle> vehicles = emp.getVehicles();
		
		Vehicle v1 = new Vehicle();
		v1.setCost(900000);
		v1.setName("BMW");
		
		vehicles.add(v1);
		
		Vehicle v2 = new Vehicle();
		v2.setCost(1300000);
		v2.setName("Innova");
		
		vehicles.add(v2);
		v1.setEmp(emp);
		v2.setEmp(emp);
		
		session.save(emp);
		tx.commit();
		
		
		
		
	}
}
