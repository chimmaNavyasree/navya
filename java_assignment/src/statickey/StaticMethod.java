package statickey;
 class Test {
 	 
 	 static void method() {
 		int instanceVariable = 10;
 		System.out.println(instanceVariable);
 	 }
}
public class StaticMethod {
	public static void main(String[] args) {
		Test obj = new Test();
		obj.method();
		
		

	}

}
