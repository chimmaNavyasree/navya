package statickey;

public class CallStaticMethod {
	public static void add(int x ,int y) {
        int a = x;
        int b = y;
        int c = a + b;
        System.out.println("addition  :" + c);
	}
	void method(int x,int y) { // instance method
	    add(x,y); //calling static method	    
	}
	public static void main(String[] args) {
		CallStaticMethod obj = new CallStaticMethod();
		obj.method(9, 8);
		 

	}

}
