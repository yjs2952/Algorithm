package extracourse1;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int input[][] = new int[num][3];

		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input[i].length; j++) {

				input[i][j] = sc.nextInt();
			}
		}
		
		baseBall(input);

		/*
		 * for (int i = 0; i < input.length; i++) {
		 * 
		 * for (int j = 0; j < input[i].length; j++) {
		 * 
		 * System.out.print( input[i][j] + " "); } System.out.println(); }
		 */

		sc.close();
	}

	public static void baseBall(int[][] input) {

		int strikeCnt = 0;	
		int ballCnt = 0;	
		int correctCnt = 0;	// 임의의 수와 제시한 조건이 같은 경우의 수 
		int result = 0;
		
		int num[] = new int[3];

		for (int i = 1; i < 10; i++) {

			for (int j = 1; j < 10; j++) {

				if (i == j)
					continue;

				for (int k = 1; k < 10; k++) {

					if (k == i || k == j)
						continue;

					for (int a = 0; a < input.length; a++) {

						strikeCnt = 0;
						ballCnt = 0;
						
						num[0] = input[a][0] / 100;
						num[1] = (input[a][0] % 100) / 10;
						num[2] = input[a][0] % 10;

						if (i == num[0]) {

							strikeCnt++;
						} else if (j == num[0] || k == num[0]) {

							ballCnt++;
						}

						if (j == num[1]) {

							strikeCnt++;
						} else if (i == num[1] || k == num[1]) {

							ballCnt++;
						}

						if (k == num[2]) {

							strikeCnt++;
						} else if (i == num[2] || j == num[2]) {

							ballCnt++;
						}
						
						if(strikeCnt == input[a][1] && ballCnt == input[a][2]) {
							correctCnt++;
						}else {
							break;
						}
					}
					
					if(correctCnt == input.length) {
						result++;
					}
					
					correctCnt = 0;
				}
			}
		}
		
		System.out.println(result);
	}

}
