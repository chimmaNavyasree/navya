package javabasics;

class demo{
	
	public static void findEvenOdd(int num) //method signature
	{  
	//method body  
	if(num%2==0)   
	System.out.println(num+" is even");   
	else   
	System.out.println(num+" is odd");  
	}  
}

public class methodsignature {
 
	public static void main(String[] args) {
		demo obj =new demo();
		obj.findEvenOdd(11);
	}
}