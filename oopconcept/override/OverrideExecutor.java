package oopconcept.override;

import oopconcept.override.Employee;
import oopconcept.override.Manager;

public class OverrideExecutor {

	public static void main(String[] args) {
		
		Employee jonathan = new Employee("vacherat", "jonathan", 500000);
		Employee rie = new Employee("rie", "miyazaki", 200000);
		//Child class is Manager but it is assigned to the Employee object
		Manager johann = new Manager("johann", "canu", 700000, 3000000);
		
		
		System.out.println("------------------");
		jonathan.outputTotalSalary();
		System.out.println("------------------");
		rie.outputTotalSalary();
		System.out.println("------------------");

		System.out.println("------------------");
		johann.outputTotalSalary();
		System.out.println("------------------");
		System.out.println("------------------");

	}

}
