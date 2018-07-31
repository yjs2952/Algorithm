package basic;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] input = new int[num];
		
		for(int i=0; i<num; i++) {
			input[i] = sc.nextInt();
		}
		
		reverse(input, input.length - 1);
		
		sc.close();
	}
	
	public static void reverse(int[] num, int i) {
		
		if(i < 0) {
			return;
		}else {
			System.out.print(num[i] + " ");
			reverse(num, i-1);
		}
	}

}
