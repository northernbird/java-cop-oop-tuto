package factory.example;

public class BadFactoryPatternDemo {

	public static void main(String[] args) {

		badFactoryPatternDemo("database");
		
		System.out.println("---");

		badFactoryPatternDemo("soap");
		
		System.out.println("---");

		badFactoryPatternDemo("RESTful");
		
		/*
		 * What happen if invalid provider type is given ??
		 * Bad example might happen to ignore such a invalid case??
		 */
		badFactoryPatternDemo("rmi");

	}
	
	public static String badFactoryPatternDemo(String type) {
		
		/*
		 * Bad pattern make source code longer and difficult to find where we should change.
		 * Not possible to work by several developers in parallel
		 * Specific logic to access data source should be decoupled!
		 */
		if (type == "database") {
			
			System.out.println("Access database");
			System.out.println("Get Data from database");
			return "Database bad data";
			
		} else if (type == "soap") {
			
			System.out.println("SOAP access");
			System.out.println("Hello SOAP World");
			return "SOAP bad data";
			
		} else if (type == "RESTful") {
			
			System.out.println("Contact RESTful via internet");
			System.out.println("Hello RESTful region");
			return "RESTful bad data";
			
		}
		

		return null;
		
	}

}
