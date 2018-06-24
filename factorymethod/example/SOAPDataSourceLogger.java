package factorymethod.example;

import factory.example.DataProvider;
import factory.example.SOAPDataProvider;

public class SOAPDataSourceLogger extends DataSourceLogger {

	public SOAPDataSourceLogger() {
		super("soap.log");
	}

	@Override
	protected DataProvider factoryMethod() {
		return new SOAPDataProvider();
	}

}
