package singleton.handson;

public class Employee {
	
	protected String firstName;
	protected String lastName;
	protected int salary;
	
	public Employee(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	protected void outputNameAndSalary() {
		System.out.println("My name is " + this.firstName + " " + this.lastName + ".");
		System.out.println("My Salary is " + this.salary + ".");
	}

	public void outputEmployeeInfo() {
		outputNameAndSalary();
		System.out.println("I get no bonus.");
	}
	

}
