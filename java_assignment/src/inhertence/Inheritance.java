package inhertence;
class A{  
	void hello(){
		System.out.println("hello...");}  
	void wellcome(){
		System.out.println("wellcome...");}
	void common(){
		System.out.println("A...");}  
}
class B extends A{  
	void bark(){
		System.out.println("barking...");} 
	void weep(){
		System.out.println("weeping...");}
	void common() {
		System.out.println("B...");
		} 
}  
class C extends B{  
	void thank(){
		System.out.println("thank...");}  
	void you(){
		System.out.println("you...");}  
	void common(){
		System.out.println("C...");
		} 
}  
public class Inheritance {
	public static void main(String[] args) {
		A obj1 = new A();
		obj1.hello();
		obj1.wellcome();
		obj1.common();
		B obj2 = new B();
		obj2.bark();
		obj2.weep();
		obj2.common();
		C obj3 = new C();
		obj3.thank();
		obj3.you();
		obj3.common();
	}

}
