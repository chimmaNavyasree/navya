package arrys;
class Testarray{
	int a[]=new int[5];//declaration and instantiation  
	void intarry() {
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]); //printing values at output
	}
}

public class IntValues {

	public static void main(String[] args) {
		Testarray obj = new Testarray();
		obj.intarry();
	}
}
