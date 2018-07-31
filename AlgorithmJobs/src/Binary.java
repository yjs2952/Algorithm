import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		getBinary(input);
		
		sc.close();
	}
	
	public static void getBinary(int input) {
		
		if(input == 1) {
			
			System.out.print(input);
		}else {
			
			getBinary(input/2);
			System.out.print(input%2);
		}
	}

}
