package basic;
import java.util.Scanner;

public class Max {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[9];
		
		for(int i=0; i < input.length; i++) {
			
			input[i] = sc.nextInt();
		}
		
		getMax(input);
		
		sc.close();
	}
	
	public static void getMax(int[] input) {
		
		int max = 0;
		int pos = 0;
		
		for(int i=0; i<input.length; i++) {
			
			if(input[i] > max) {
				max = input[i];
				pos = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(pos);
	}

}
