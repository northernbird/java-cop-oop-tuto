package adapter.example.delegate;

import adapter.example.Print;

public class DeligateAdapterDemo {

	public static void main(String[] args) {

		Print print = new PrintDelegateAdapter();
		print.print();
		
	}

}
