package adapter.example.delegate;

import adapter.example.GoodBye;
import adapter.example.Print;

public class PrintDelegateAdapter implements Print {

	private GoodBye goodBye = new GoodBye();
	
	@Override
	public void print() {
		goodBye.hello();
		
	}

}
