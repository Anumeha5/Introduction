package seleniumjava;

public class CoreJavaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string is an object// String literal
		String s = "Rahul Shetty Academy";
		String s1 ="Rahul Shetty Academy";
		
		//new
		String s2 = new String("Welcom");
		String s3 = new String("Welcome");
		
		//String s = "rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		
		
		

	}

}
