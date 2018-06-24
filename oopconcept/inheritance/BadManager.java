package oopconcept.inheritance;

public class BadManager {

	private String firstName;
	private String lastName;
	private int salary;
	private int bunus;

	public BadManager(String firstName, String lastName, int salary, int bunus) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.bunus = bunus;
	}

	public int getBunus() {
		return bunus;
	}

	public void setBunus(int bunus) {
		this.bunus = bunus;
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
	
	public void outputEmployeeInfo() {
		System.out.println("My name is " + this.firstName + " " + this.lastName + ".");
		System.out.println("My Salary is " + this.salary + ".");
		System.out.println("I get "  + bunus + ".");
	}
	
	
}
