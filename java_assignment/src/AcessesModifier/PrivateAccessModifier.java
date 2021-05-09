package AcessesModifier;
class Vehicle{  
	  //defining a method  
		private int num=8;
	   private void run(){
		   System.out.println("Vehicle is running");
		   }  
	}  
class bike extends Vehicle{
	 void run(){System.out.println("Bike is running safely");}
}
public class PrivateAccessModifier{	    
		  public static void main(String args[]){  
			   bike obj = new bike();//creating object  
		       obj.run();//calling method  
	}
}
