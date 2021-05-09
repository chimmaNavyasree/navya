package abstaraction;
abstract class Bike
	{  
	  abstract void run();  
	} 
public class Ass1 extends Bike {
	void run()
	{
		System.out.println("running safely");}  
	public static void main(String[] args) {
		Bike obj = new Ass1();  
		 obj.run();  
	}

} 
	 
 