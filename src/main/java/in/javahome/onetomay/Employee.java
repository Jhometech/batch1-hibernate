package in.javahome.onetomay;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_TAB")
public class Employee implements Serializable{
	@Column(name="EMP_ID")
	@Id@GeneratedValue
	private Integer empId;
	private String name;
	private double salary;
	@OneToMany(mappedBy="emp",cascade=CascadeType.ALL,fetch=FetchType.EAGER
			, orphanRemoval=true)
	private Set<Vehicle> vehicles = new HashSet<>();
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Set<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	
	
}
