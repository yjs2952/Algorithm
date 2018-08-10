package extracourse02;

import java.util.Scanner;

public class AttackRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 맵 크기
		int x = sc.nextInt(); // x좌표
		int y = sc.nextInt(); // y좌표
		int ar = sc.nextInt(); // 사정거리

		String[][] arr = new String[n][n];

		arr[x - 1][y - 1] = "x";

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i != x - 1 && j != y - 1) {

					arr[i][j] = "0";
				}else {
					
					if (i == x - 2 && j == y - 1) {		// 위

						for (int k = 0; k < ar; k++) {

							if (i - k >= 0) {	// 위

								arr[i - k][j] = String.valueOf(k + 1);
							}

							if (j + k < n) {	// 우

								arr[i][j + k] = String.valueOf(k + 1);
							}

							if (j - k >= 0) {	// 좌

								arr[i][j - k] = String.valueOf(k + 1);
							}
						}
					}

					if (i == x - 1 && j == y - 2) {		// 좌

						for (int k = 0; k < ar; k++) {

							if (i - k >= 0) {	// 위

								arr[i - k][j] = String.valueOf(k + 1);
							}
							
							if (i + k < n) {	// 아래

								arr[i + k][j] = String.valueOf(k + 1);
							}

							if (j - k >= 0) {	// 좌

								arr[i][j - k] = String.valueOf(k + 1);
							}
						}
					}

					if (i == x - 1 && j == y) {		// 우

						for (int k = 0; k < ar; k++) {

							if (i - k >= 0) {	// 위

								arr[i - k][j] = String.valueOf(k + 1);
							}
							
							if (i + k < n) {	// 아래

								arr[i + k][j] = String.valueOf(k + 1);
							}

							if (j + k < n) {	// 우

								arr[i][j + k] = String.valueOf(k + 1);
							}
						}
					}

					if (i == x && j == y - 1) {		// 아래

						for (int k = 0; k < ar; k++) {

							if (i + k < n) {	// 아래

								arr[i + k][j] = String.valueOf(k + 1);
							}

							if (j + k < n) {	// 우

								arr[i][j + k] = String.valueOf(k + 1);
							}
							
							if (j - k >= 0) {	// 좌

								arr[i][j - k] = String.valueOf(k + 1);
							}
						}
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
