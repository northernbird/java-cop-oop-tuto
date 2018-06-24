package oopconcept.inheritance;

public class InheritanceExecutor {

	public static void main(String[] args) {

		Employee jonathan = new Employee("vacherat", "jonathan", 500000);
		Employee rie = new Employee("rie", "miyazaki", 200000);
		//Child class is Manager but it is assigned to the Employee object
		Manager johann = new Manager("johann", "canu", 700000, 3000000);
		// Good manager is still also employee :)
		Employee goodManager = johann;
		
		
		// Bad manager isn't be an employy anymore :(
		BadManager badManager = new BadManager("bad", "manager", 800000, 9000000);
//		Employee employee = badManager;
		
		
		// Method in a super class (Employee) can be executed for sub class (Manager) as well.
		System.out.println("------------------");
		jonathan.outputName();
		System.out.println("------------------");
		rie.outputName();
		System.out.println("------------------");

		System.out.println("------------------");
		johann.outputName();
		System.out.println("------------------");
		System.out.println("------------------");
		

	}

}
