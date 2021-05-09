package statickey;

public class Instancemethod {
	static int instanceVariable = 10;
	void method() {
	System.out.println(instanceVariable);
 }
	public static void main(String[] args) {
		Instancemethod obj=new Instancemethod();
		obj.method();
	}
}
