package singleton.handson;

import java.util.ArrayList;
import java.util.List;


public class EmployeePool {

	private String name;
	private List<Employee> employees;
	
	//TODO for hands-on
	private static EmployeePool instance = new EmployeePool("AXAEmployee", new ArrayList<Employee>());
	
	//TODO
	private EmployeePool(String name, List<Employee> employees) {
		this.name = name;
		this.employees = employees;
	}
	
	//TODO
	public static EmployeePool getInstance() {
		return instance;
	}

	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void outputPool() {
		
	}
	
}
