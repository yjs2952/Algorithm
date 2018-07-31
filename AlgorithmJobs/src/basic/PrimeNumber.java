package basic;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(input == 1) {
			
			System.out.println("YES");
			
		}else {
			
			for(int i = 2; i <= input; i++) {
				
				if(input % i == 0) {
					
					if(input != i) {
						System.out.println("NO");
						
						sc.close();
						return;
					}else {
						System.out.println("YES");
					}
				}
			}
		}
		
		sc.close();
	}

}
 