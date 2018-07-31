package basic;
import java.util.Scanner;

public class SecondMin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] input = new int[9];

		for (int i = 0; i < input.length; i++) {

			input[i] = sc.nextInt();
		}
		
		getSecondMin(input, getMin(input));

		sc.close();
	}

	public static int getMin(int[] input) {

		int min = 9999;

		for (int i = 0; i < input.length; i++) {

			if (input[i] < min) {
				min = input[i];
			}
		}
		
		return min;
		
	}
	
	public static void getSecondMin(int[] input, int min) {
		
		for(int i=0; i<input.length; i++) {
			
			if(input[i] == min) {
				continue;
			}
			
			for(int j=0; j<input.length; j++) {
				
				if(input[i] > min && input[i] < input[j]) {
					
				}
			}
		}
	}

}
