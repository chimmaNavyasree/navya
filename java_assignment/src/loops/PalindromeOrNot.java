package loops;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int r,sum=0,temp;    
		  int N=454;//It is the number variable to be checked for palindrome  
		  temp=N;    
		  while(N>0){    
		   r=N%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   N=N/10;    
		  }    
		  if(temp==sum)  //cheking condition  
		   System.out.println(" N is palindrome number ");    
		  else    
		   System.out.println(" N is not palindrome");    
	}

}
