package factory.example;

public class DataBaseDataProvider implements DataProvider {

	@Override
	public String provide() {
		System.out.println("Access Database");
		System.out.println("Grats! Get data!!");
		return "Database data";
	}

}
