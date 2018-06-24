package adapter.example.extend;

import adapter.example.Print;

public class ExtendAdapterDemo {

	public static void main(String[] args) {
		Print p = new PrintExtendAdapter();
		p.print();
	}

}
