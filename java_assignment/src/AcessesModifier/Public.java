package AcessesModifier;

class aunt{  
		public int i=4;
		public void msg(){
			System.out.println(i);
			System.out.println("Hello");} 
	}  
public class Public{
	 public static void main(String args[]){ 
		 aunt obj = new aunt();
		 obj.msg();
}
}
