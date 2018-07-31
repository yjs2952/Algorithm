import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] input = new int[n][n];

		int num = 1;
		
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				
				for(int k = 0; k <= i; k++) {
					
					if( (j + k) == i ) {
						
						input[j][k] = num ++;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n-i; j++) {
				
				
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
