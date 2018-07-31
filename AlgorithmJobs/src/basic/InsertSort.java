package basic;
import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] input = new int[num];

		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<input.length; i++) {
			
			for(int j=i ; j>=1; j--) {
				
				if(input[j-1] > input[j]) {
					
					int temp = 0;
					
					temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}
		}
		
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]);
		}
	}
}
