package Day2.Arrays;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {50,10,20,30,40}; 
		
		int sum = 0;
		for(int i = 0;i < numbers.length;i++) {
			sum += numbers[i];
		}
		System.out.println("The sum of Array elements is: " + sum);
		System.out.println(numbers[0]);
		
		
	}

}
