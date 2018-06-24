package oopconcept.inheritance;

public class Employee {
	
	protected String firstName;
	protected String lastName;
	protected int salary;
	
	public Employee(String firstName, String lastName, int salary) {
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
	
	public final void outputName() {
		System.out.println("My name is " + this.firstName + " " + this.lastName + ".");
	}

}
