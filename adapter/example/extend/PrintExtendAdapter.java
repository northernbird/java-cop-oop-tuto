package adapter.example.extend;

import adapter.example.Hello;
import adapter.example.Print;

//TODO for handson
public class PrintExtendAdapter extends Hello implements Print {

	@Override
	public void print() {
		super.hello();
	}

}
