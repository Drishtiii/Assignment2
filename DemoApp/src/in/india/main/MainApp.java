package in.india.main;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Eclipse IDE...");
		
		int[] a = {10,20,30,40};
		
		for(int elem:a)
		{
			System.out.println(elem+" ");
		}
		
		String name="Sachin";
		int count = name.toUpperCase().length();
		System.out.println(count);
	}

}
