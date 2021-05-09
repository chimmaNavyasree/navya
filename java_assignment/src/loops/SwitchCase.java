package loops;

public class SwitchCase {

	public static void main(String[] args) {
		int num=15;
	    System.out.println("Enter any number to check even or odd: ");
	    switch(num % 2)
	    {
	        case 0: 
	        	 System.out.println("Number is Even");
	            break;

	        /* Else if n%2 == 1 */
	        case 1: 
	        	 System.out.println("num is Odd");
	            break;
	    }
	}   
}
