package arrys;

public class FindValue {

	public static void main(String[] args) {
		 int[] myArray = {55, 45, 69, 44};
	      int num = 65;

	      for(int i = 0; i<myArray.length; i++){
	         if(num == myArray[i]){
	            System.out.println("Array contains the given element");
	         }
	      }
	}
}
