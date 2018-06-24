package singleton.handson;


public class EmployeePoolExecutor {

	public static void main(String[] args) {

		EmployeePool pool = EmployeePool.getInstance();
		
		System.out.println(pool.getEmployees().size());
		
		addManagerToPool();
		addEmployeeToPool();
		
		System.out.println(pool.getEmployees().size());
		//or
		EmployeePool pool2 = EmployeePool.getInstance();
		System.out.println(pool2.getEmployees().size());
		//or
		System.out.println(pool == pool2);

	}
	
	private static void addManagerToPool() {
		
		Employee jonathan = new Employee("vacherat", "jonathan", 500000);
		Employee rie = new Employee("rie", "miyazaki", 200000);
		Employee nick = new Employee("qi", "quiyang", 150000);
		
		EmployeePool pool = EmployeePool.getInstance();
		
		pool.addEmployee(jonathan);
		pool.addEmployee(rie);
		pool.addEmployee(nick);
		
	}
	
	private static void addEmployeeToPool() {
		
		Employee johann = new Manager("johann", "canu", 700000, 100);
		Employee qi = new Manager("qi", "quiyang", 700000, 100);
		
		EmployeePool pool = EmployeePool.getInstance();
		
		pool.addEmployee(johann);
		pool.addEmployee(qi);
		
	}

}
