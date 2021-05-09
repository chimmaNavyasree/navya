package statickey;
public class CallInstanceMethod {
	    public void add(int x ,int y) {
	        int a = x;
	        int b = y;
	        int c = a + b;
	        System.out.println("addition" + c);
	    }
	public static void main(String[] args) {
		CallInstanceMethod d = new CallInstanceMethod();
        d.add(10,20);     // to call the non-static method

	}

}
