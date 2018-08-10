package extracourse01;

import java.util.Scanner;

public class Tetris2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();

		int input[][] = new int[r][c];

		for (int i = 0; i < r; i++) {

			for (int j = 0; j < c; j++) {

				input[r][c] = sc.nextInt();
			}
		}

		sc.close();
	}

	public static void tetris(int[][] input) {

		int horizonCnt = 0;
		int blankPos = 0;
		int stack = 0;

		for (int i = 0; i < input[0].length; i++) {

			for (int j = 0; j < input.length; j++) {

				if (input[j][i] == 1) { // ?–´?””?„œ ë¶??„° ?Œ“?„ ?ˆ˜ ?žˆ?Š”ì§? ?™•?¸

					blankPos = j+1;
					break;
				}
			}
			
			if(blankPos < 3) {
				
				break;
			}else {
				
				
			}
		}
	}
}
