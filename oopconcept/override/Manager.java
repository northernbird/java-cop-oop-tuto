package oopconcept.override;

public class Manager extends AbstractEmployee {

	private int bonus;
	
	public Manager(String firstName, String lastName, int salary, int bonus) {
		super(firstName, lastName, salary);
		this.bonus = bonus;
	}

	@Override
	public void outputTotalSalary() {
		int totalSalary = (this.salary + this.bonus);
		System.out.println("My total salary is " + totalSalary);
		System.out.println("I have bonus because I am a cool manager!!");
	}

}
