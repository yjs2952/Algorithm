package basic;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] input = new int[num];
		
		for(int i=0; i<input.length; i++) {
			input[i] = sc.nextInt(); 
		}
		
		for(int i=0; i<input.length; i++) {
			
			int idx = i;
			int temp = 0;
			
			for(int j=i+1; j<input.length; j++) {
				
				if(input[idx] > input[j]) {
					
					idx = j;
				}
			}
			
			if(idx != i) {
				temp = input[i];
				input[i] = input[idx];
				input[idx] = temp;
				
				/*for(int j=0; j<input.length; j++) {
					System.out.print(input[j] + " ");
				}
				System.out.println();*/
			}
			
			System.out.print(input[i] + " ");
		}
		
		sc.close();

	}

}
