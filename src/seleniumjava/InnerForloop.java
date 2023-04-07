package seleniumjava;

public class InnerForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outerforloop
        for(int i=10;i<=14;i++){
        	System.out.print(i+"= ");
        	//inner for loop
        	for(int j = 1;j<=5;j++) {
        		System.out.print(j+" ");
        		
        	}
        	System.out.println();
        }
	}

}
