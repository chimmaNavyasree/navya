package arrys;

public class IndexOfArray {

	public static void main(String[] args) {
		String [] color= {"red","green","blue","orange"};
		int index=0;
		if (color == null) {
			System.out.println("null");}
		for(int i=0;i<color.length;i++) {		
			if(color[i]=="red") {
				index=i;
			}
		}
		System.out.println("INDEX value ="+index);
	}
}