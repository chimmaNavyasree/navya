package loops;
import java.util.Scanner; 

public class MaleOrFemale {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("ENTER GENDER FEMALE OR MALE: ");
		char ch = sc.next().charAt(0);
	    switch(ch)
	    {
	        case 'F': 
	        	 System.out.println("FEMALE");
	            break;
	        case 'M': 
	        	 System.out.println("MALE");
	            break;
	    }
	}

}
