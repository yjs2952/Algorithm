package basic;
import java.util.Scanner;

public class BubleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] input = new int[num];

		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		for(int i=0; i<input.length-1; i++) {
			
			for(int j=0; j<input.length-i-1; j++) {
				
				if(input[j] > input[j+1]) {
					
					int temp = 0;
					
					temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]);
		}
		
		sc.close();
	}

}
