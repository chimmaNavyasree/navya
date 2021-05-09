package statickey;
class main{
 public static void add(int x ,int y) {
    int a = x;
    int b = y;
    int c = a + b;
    System.out.println("addition  :" + c);
 }

   void method(int x,int y) { // instance method
	   int a = x;
	    int b = y;
	    int c = a + b;
	    System.out.println("addition  :" + c);	
}
}
public class CallmethodINMainMethod {
	public static void main(String[] args) {
		main obj = new main();
		obj.add(9, 6);
		obj.method(1, 5);
	}

}
