package extracourse02;
import java.util.Scanner;

public class Rook {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[8][8];

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8; j++) {

				arr[i][j] = sc.nextInt();
			}
		}

		rook(arr);

		sc.close();
	}

	public static void rook(int[][] arr) {

		int isCheckMate = 0;

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8; j++) {

				if (arr[i][j] == 1) {
					
					if(j != 0) {
						
						for (int k = j-1; k >= 0; k--) {

							if (arr[i][k] != 0) {

								if (arr[i][k] == 2) {

									isCheckMate = 1;
									break;
								} else {
									break;
								}
							}
						}
					}
					
					if(j != 7) {
						
						for (int k = j+1; k < 8; k++) {

							if (arr[i][k] != 0) {

								if (arr[i][k] == 2) {

									isCheckMate = 1;
									break;
								} else {
									break;
								}
							}
						}
					}
					
					if(i != 0) {
						
						for (int k = i-1; k >= 0; k--) {

							if (arr[k][j] != 0) {

								if (arr[k][j] == 2) {

									isCheckMate = 1;
									break;
								} else {
									break;
								}
							}
						}
					}
					
					if(i != 7) {
						
						for (int k = i+1; k < 8; k++) {
							
							if (arr[k][j] != 0) {

								if (arr[k][j] == 2) {

									isCheckMate = 1;
									break;
								} else {
									break;
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println(isCheckMate);
	}

}
