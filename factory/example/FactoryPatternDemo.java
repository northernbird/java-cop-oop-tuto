package factory.example;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		DataProvider provider = DataProviderFactory.getProviderByType("database");
		System.out.println(provider.provide());
		
		System.out.println("---");
		
		provider = DataProviderFactory.getProviderByType("soap");
		System.out.println(provider.provide());
		
		System.out.println("---");
		
		provider = DataProviderFactory.getProviderByType("RESTful");
		System.out.println(provider.provide());
		
		/*
		 * What happen if invalid provider type is given
		 */
		provider = DataProviderFactory.getProviderByType("rmi");
		System.out.println(provider.provide());

	}

}
