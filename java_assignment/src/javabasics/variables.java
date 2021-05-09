package javabasics;

class varible{
	int num=10;// global variable 
	
	public void diff(){
		System.out.println(num); 
		int num=15;//local variable
		System.out.println(num); 	
	}	
}
public class variables {
	public static void main(String[] args) {
		varible obj =new varible();
		obj.diff();
	}
}
