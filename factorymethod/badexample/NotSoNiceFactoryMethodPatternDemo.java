package factorymethod.badexample;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import factory.example.DataBaseDataProvider;
import factory.example.DataProvider;
import factory.example.RESTfulDataProvider;
import factory.example.SOAPDataProvider;


public class NotSoNiceFactoryMethodPatternDemo {

	public static void main(String[] args) {
		
		/*
		 * It's still ok but please consider :
		 * What happens if we set the long combination of log filename and content ?
		 * e.g. saveToLog("database.log", new RESTfulDataProvider().povide());
		 * These mistakes might spread all over the application, it will be hard to fix.
		 * With factory method pattern, we can fix only each sub class of DataBaseDataSourceLogger.
		 */
		DataProvider provider = new DataBaseDataProvider();
		String logContent = provider.provide();
		saveToLog("database.log", logContent);
		
		provider = new SOAPDataProvider();
		logContent = provider.provide();
		saveToLog("soap.log", logContent);
		
		provider = new RESTfulDataProvider();
		logContent = provider.provide();
		saveToLog("rest.log", logContent);
		
	}
	
	public static void saveToLog(String logFileName, String logContent) {
		
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(logFileName, "UTF-8");
			writer.println("Can we refactor ?? ");
			writer.println(logContent);
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

}
