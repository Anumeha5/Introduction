package seleniumjava;

public class StaticBlockINJava {
	{
		System.out.println("this is instance block");
	}
      
	  static {
		  System.out.println("this is static block");
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("main start");
        StaticBlockINJava obj1= new StaticBlockINJava();
        System.out.println("main end");
	}

}
