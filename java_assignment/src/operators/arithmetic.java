package operators;

class method{
	void operations() {
		int a=10;  
		int b=5;  
		System.out.println(a+b);//15  
		System.out.println(a-b);//5  
		System.out.println(a*b);//50  
		System.out.println(a/b);//2  
		System.out.println(a%b);//0 
	}
}

public class arithmetic {

	public static void main(String[] args) { 
		method obj = new method();
		obj.operations();
		}
}
