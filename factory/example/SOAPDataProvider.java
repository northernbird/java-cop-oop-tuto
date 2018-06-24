package factory.example;

public class SOAPDataProvider implements DataProvider {

	@Override
	public String provide() {
		System.out.println("Access to a SOAP service");
		System.out.println("Get result. Juhu!");
		return "SOAP Data";
	}

}
