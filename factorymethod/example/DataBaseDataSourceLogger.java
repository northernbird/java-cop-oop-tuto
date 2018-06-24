package factorymethod.example;

import factory.example.DataBaseDataProvider;
import factory.example.DataProvider;

public class DataBaseDataSourceLogger extends DataSourceLogger {

	public DataBaseDataSourceLogger() {
		super("database.log");
	}

	@Override
	protected DataProvider factoryMethod() {
		return new DataBaseDataProvider();
	}

}
