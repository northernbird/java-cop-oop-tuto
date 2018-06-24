package factorymethod.example;

import factory.example.DataProvider;
import factory.example.RESTfulDataProvider;

public class RESTfulDataSourceLogger extends DataSourceLogger {

	public RESTfulDataSourceLogger() {
		super("rest.log");
	}

	@Override
	protected DataProvider factoryMethod() {
		return new RESTfulDataProvider();
	}

}
