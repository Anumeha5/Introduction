package seleniumjava;

import java.util.ArrayList;

public class CorejavaBrushUp2 {

	ArrayList<String> a = new ArrayList<String>();
	public static void main(String[] args, int i) {
		// TODO Auto-generated method stub
       int[]arr2 = {1,2,3,4,5,6,7,8,9,122};
       //2,4,6,8,10,122
       
       for(int i1=0;i1<arr2.length;i1++)
       {
    	   if (arr2[i] % 2 == 0) {
    		   System.out.println(arr2[i]);
        	   break;   
    	   } else
           {   
        	   System.out.println(arr2[i] +"is not multiple of 2");
           }
    	   
    	   
       }
       
       
	}
	
	public void test() {
		int a =1;
		int b = 2;
		for(int i=0; i < 10; i++) {
			if(a < b) {
				System.out.println("Test");
			}
		}
	}
}
	
	
	
	
       
       
       
	
	


