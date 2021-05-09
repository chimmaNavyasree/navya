package constroctors;
class Food{
	public void Food() {
		System.out.println("eat");
	}
	private void Food(int i) {	
		System.out.println("happy");
	}
	protected void Food(int i,int j) {
		System.out.println("food");
	}
}
public class Ass3 {
	public static void main(String[] args) {
		Food obj =new Food();
		obj.Food();
		obj.Food(0, 0);
	//	obj.Food(i);

	}

}
