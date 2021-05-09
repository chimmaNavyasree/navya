package operators;

class operator{
	void method() {
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
	}
}

public class UnaryOperator {

	public static void main(String[] args) {
		operator obj = new operator();
		obj.method();

	}

}
