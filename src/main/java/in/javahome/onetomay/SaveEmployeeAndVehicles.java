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
		emp.setEmpId(1111);
		emp.setName("Kishore");
		emp.setSalary(60000);
		
		Set<Vehicle> vehicles = emp.getVehicles();
		
		Vehicle v1 = new Vehicle();
		v1.setCost(900000);
		v1.setName("Swift");
		v1.setVehicleNo(5618);
		
		vehicles.add(v1);
		
		Vehicle v2 = new Vehicle();
		v2.setCost(1300000);
		v2.setName("Scorpio");
		v2.setVehicleNo(6666);
		
		vehicles.add(v2);
		
		session.save(v1);
		session.save(v2);
		session.save(emp);
		tx.commit();
		
		
		
		
	}
}
