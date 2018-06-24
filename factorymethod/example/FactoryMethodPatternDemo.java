package factorymethod.example;

public class FactoryMethodPatternDemo {

	public static void main(String[] args) {
		
		/*
		 * Log database data to "database.log"
		 */
		DataSourceLogger logger = new DataBaseDataSourceLogger();
		logger.saveToLog();
		
		/*
		 * Log database data to "soap.log"
		 */
		logger = new SOAPDataSourceLogger();
		logger.saveToLog();
		
		/*
		 * Log database data to "rest.log"
		 */
		logger = new RESTfulDataSourceLogger();
		logger.saveToLog();
		
		System.out.println("Finished");
	}

}
