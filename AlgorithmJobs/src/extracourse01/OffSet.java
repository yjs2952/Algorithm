package extracourse01;

import java.util.Scanner;

public class OffSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input[][] = new int[5][5];

		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input.length; j++) {

				input[i][j] = sc.nextInt();
			}
		}

		offSet(input);

		sc.close();
	}

	public static void offSet(int[][] input) {

		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input.length; j++) {

				if (i > 0 && j > 0 && i < 4 && j < 4) {

					if (input[i][j] < input[i][j - 1] && input[i][j] < input[i][j + 1] && input[i][j] < input[i - 1][j]
							&& input[i][j] < input[i + 1][j]) {

						System.out.print("* ");
					} else {
						System.out.print(input[i][j] + " ");
					}
				} else {

					if (i == 0 && j != 4) {

						if (j == 0 && input[i][j] < input[i][j + 1] && input[i][j] < input[i + 1][j]) {

							System.out.print("* ");
						} else if (j != 0 && input[i][j] < input[i][j - 1] && input[i][j] < input[i][j + 1]
								&& input[i][j] < input[i + 1][j]) {

							System.out.print("* ");
						} else {

							System.out.print(input[i][j] + " ");
						}
					} else if (i != 0 && j == 0) {

						if (i == 4 && input[i][j] < input[i][j + 1] && input[i][j] < input[i - 1][j]) {

							System.out.print("* ");
						} else if (i != 4 && input[i][j] < input[i][j + 1] && input[i][j] < input[i - 1][j]
								&& input[i][j] < input[i + 1][j]) {

							System.out.print("* ");
						} else {

							System.out.print(input[i][j] + " ");
						}
					}else if(j != 0 && i == 4) {
						
						if (j == 4 && input[i][j] < input[i][j - 1] && input[i][j] < input[i - 1][j]) {

							System.out.print("* ");
						} else if (j != 4 && input[i][j] < input[i][j - 1] && input[i][j] < input[i][j + 1]
								&& input[i][j] < input[i - 1][j]) {

							System.out.print("* ");
						} else {

							System.out.print(input[i][j] + " ");
						}
					}else if(i != 4 && j == 4) {
						
						if (i == 0 && input[i][j] < input[i][j - 1] && input[i][j] < input[i + 1][j]) {

							System.out.print("* ");
						} else if (i != 0 && input[i][j] < input[i][j - 1] && input[i][j] < input[i - 1][j]
								&& input[i][j] < input[i + 1][j]) {

							System.out.print("* ");
						} else {

							System.out.print(input[i][j] + " ");
						}
					}
				}
			}
			
			System.out.println();
		}
	}
}
