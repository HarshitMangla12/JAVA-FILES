package sashi;

public class Happy {

	public static void main(String[] args) {
		 int x = 2;  
	        int y = 5;  
	        int z = 12;  
	          
	        //calculating exp1, exp2, and exp3   
	        int exp1 = x +(z/x+(z%y)*(z-x)^2);  
	        int exp2 = z/x+y*x-(y+x)%z;  
	        int exp3 = 4/2+8*4-(5+2)%3;  
	          
	        //printing the result  
	        System.out.println(exp1);  
	        System.out.println(exp2);  
	        System.out.println(exp3);  
	}

}
