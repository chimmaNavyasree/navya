package AcessesModifier;

class A{
	int num =8;
	void method(){
		System.out.println(num);
		System.out.println("hello");
	}
}

public class DefaultAcessesModifier {

	public static void main(String[] args) {
		 A obj=new A();
		 obj.method();
	}

}
