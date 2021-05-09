package abstaraction;
abstract class Bank{    
	abstract int getRateOfInterest();    
	}    
	class SBI extends Bank{    
	int getRateOfInterest(){
		return 7;}    
	}        
public class Ass3{    
public static void main(String args[]){    
Bank b=new SBI();  
b.getRateOfInterest();
}
}    