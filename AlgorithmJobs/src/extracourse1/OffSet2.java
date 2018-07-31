package extracourse1;

import java.util.Scanner;

public class OffSet2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input[][] = new int[7][7];

		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input.length; j++) {

				if(i == 0 || i == 6 || j == 0 || j == 6) {
					
					input[i][j] = 10; 
				}else {
				
					input[i][j] = sc.nextInt();
				}
			}
		}
		
		offSet(input);

		sc.close();
	}

	public static void offSet(int[][] input) {

		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input.length; j++) {

				if (i > 0 && j > 0 && i < 6 && j < 6) {

					if (input[i][j] < input[i][j - 1] && input[i][j] < input[i][j + 1] && input[i][j] < input[i - 1][j]
							&& input[i][j] < input[i + 1][j]) {

						System.out.print("* ");
					} else {
						
						System.out.print(input[i][j] + " ");
					}
				}
			}
			
			System.out.println();
		}
	}
}
