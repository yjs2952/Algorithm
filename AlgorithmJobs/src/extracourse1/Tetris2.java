package extracourse1;

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
		int blankCnt = 0;
		int stack = 0;
		
		for(int i=0; i<input[0].length; i++) {
			
			blankCnt = 0;
			
			for(int j=0; j<input.length; j++) {
				
				if(input[j][i] == 1) {	// 어디서 부터 쌓을 수 있는지 확인
					
					blankCnt++;
				}
			}
			
			if(blankCnt == 4) {
				
				for(int j=input.length-1; j>=0; j--) {
					
					if(input[j][i] == 1) {
						continue;
					}
				}
			}
		}
		
	}

}
