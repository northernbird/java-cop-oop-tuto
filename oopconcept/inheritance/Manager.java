package oopconcept.inheritance;

public class Manager extends Employee {

	private int bunus;
	
	public Manager(String firstName, String lastName, int salary, int bunus) {
		super(firstName, lastName, salary);
		this.bunus = bunus;
	}

	public int getBunus() {
		return bunus;
	}

	public void setBunus(int bunus) {
		this.bunus = bunus;
	}

	
}
