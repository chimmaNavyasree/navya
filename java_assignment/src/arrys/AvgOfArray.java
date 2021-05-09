package arrys;

public class AvgOfArray {

	public static void main(String[] args) {
		
		int[] numbers = new int[]{1, 2, 3, 4};
		
	       //calculate sum of all array elements
	       int sum = 0;
	       for(int i=0; i < numbers.length ; i++)
	        sum = sum + numbers[i];
	       //calculate average value
	        double average = sum / numbers.length;
	        System.out.println("Average value of the array elements is :" + average);
	}

}
