package factory.example;

public class DataProviderFactory {

	public static DataProvider getProviderByType(String type) {
		
		if(type.equals("database")) {
			
			return new DataBaseDataProvider();
			
		} else if (type.equals("soap")) {
			
			return new SOAPDataProvider();
			
		} else if (type.equals("RESTful")) {
			
			return new RESTfulDataProvider();
			
		} else {
			
			throw new IllegalArgumentException("Unsupported provider type");
			
		}
		
	}
	
}
