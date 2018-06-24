package oopconcept.override;

public class Employee extends AbstractEmployee {

	public Employee(String firstName, String lastName, int salary) {
		super(firstName, lastName, salary);
	}

	@Override
	public void outputTotalSalary() {
		System.out.println("My total salary is " + salary);
		System.out.println("I don't have Bonus...");
	}

}
