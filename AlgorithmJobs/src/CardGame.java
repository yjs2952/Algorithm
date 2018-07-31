import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] input = new int[2][10];
		
		for(int i=0; i<input.length; i++) {

			for(int j=0; j<input[i].length; j++) {
				
				input[i][j] = sc.nextInt();
			}
		}
		
		cardGame(input);
		
		sc.close();
	}
	
	public static void cardGame(int[][] input) {
		
		int a = 0;
		int b = 0;
		int d = 0;
		
			
		for(int j=0; j<input[0].length; j++) {
			
			if(input[0][j] > input[1][j]) {
				a++;
			}else if(input[0][j] < input[1][j]){
				b++;
			}else if(input[0][j] == input[1][j]) {
				d++;
			}
		}
		
		if(a == b) {
			System.out.println("D");
		}else if(a > b) {
			System.out.println("A");
		}else if(a < b) {
			System.out.println("B");
		}
	}
}
