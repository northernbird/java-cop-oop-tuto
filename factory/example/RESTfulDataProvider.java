package factory.example;

public class RESTfulDataProvider implements DataProvider {

	@Override
	public String provide() {
		System.out.println("Take data via RESTfulDataProvider");
		System.out.println("Great! Get data!!");
		return "RESTful Data";
	}

}
