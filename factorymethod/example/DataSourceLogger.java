package factorymethod.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import factory.example.DataProvider;

public abstract class DataSourceLogger {

	private String logFileName;

	public DataSourceLogger(String logFileName) {
		super();
		this.logFileName = logFileName;
	}

	public void saveToLog() {
		PrintWriter writer = null;
		/*
		 * Factory method is used here ! YEAH!!
		 */
		DataProvider provider = factoryMethod();
		try {
			writer = new PrintWriter(logFileName, "UTF-8");
			writer.println("Now specific log contents comes based on a provider");
			writer.println(provider.provide());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				writer.close();
			}
		}

	}
	
	protected abstract DataProvider factoryMethod();
	
}
