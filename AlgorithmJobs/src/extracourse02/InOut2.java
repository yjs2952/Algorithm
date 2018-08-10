package extracourse02;

import java.util.Scanner;

public class InOut2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[10][10];
		
		for(int i=0; i<10; i++) {
			
			for(int j=0; j<10; j++) {
				
				arr[i][j] = sc.nextInt();
			}
		}

		inOut2(arr, n);

		sc.close();
	}

	public static void inOut2(int[][] arr, int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < 10; j++) {

				if (arr[i][j] == 0) {

					arr[i][j] = 1;
				} else {

					arr[i][j] = 0;
				}
				
				if(i != j) {
					
					if (arr[j][i] == 0) {

						arr[j][i] = 1;
					} else {

						arr[j][i] = 0;
					}
				}
			}
		}
		
		for(int i=0; i<10; i++) {
			
			for(int j=0; j<10; j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
