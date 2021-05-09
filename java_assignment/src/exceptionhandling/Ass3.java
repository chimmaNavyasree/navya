package exceptionhandling;
class back{
	int i=10;
	void b(){
		int j=10/0;
	}
}
public class Ass3 {

	public static void main(String[] args) {
		back obj=new back();
		obj.b();
		
	}

}
