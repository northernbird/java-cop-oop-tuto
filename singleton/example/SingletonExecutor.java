package singleton.example;

public class SingletonExecutor {

	public static void main(String[] args) {

		
		Singleton c1 = Singleton.getInstance();
		Singleton c2 = Singleton.getInstance();

		System.out.println("c1 hashCode: " + c1.hashCode());
		System.out.println("c2 hashCode: " + c2.hashCode());
		
		System.out.println(c1.equals(c2));
	}

}

