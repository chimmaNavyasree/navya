package loops;

public class LargerAmongThree {
	public static void main(String[] args) {
		int num1=80;
		int num2=40;
		int num3=30;
		if(num1<num2){  
			if(num2<num3) {
				System.out.println("num3 is larger");
			}
			else {
				System.out.println("num2 is larger");
			}
			}
		else {
			System.out.println("num1 is larger"); 
		}
	}

}
