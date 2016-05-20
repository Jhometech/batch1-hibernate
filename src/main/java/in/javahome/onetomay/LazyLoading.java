package in.javahome.onetomay;

import java.util.Set;

import org.hibernate.Session;

import in.javahome.hibernate.HibUtil;

public class LazyLoading {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	
	Employee emp = session.get(Employee.class, 3333);
	System.out.println(emp.getName());
	Set<Vehicle> vehicles = emp.getVehicles();
	for (Vehicle vehicle : vehicles) {
		System.out.println(vehicle.getVehicleNo());
	}
	
}
}
