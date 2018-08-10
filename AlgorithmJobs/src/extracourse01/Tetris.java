package extracourse01;

import java.util.Scanner;

public class Tetris {

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
			
			for(int j=0; j<input.length-1; j++) {
				
				if(input[j][i] == 0) {
					
					blankCnt++;
				}
				
				if(input[j][i] != input[j+1][i]) {
					
					blankCnt = 0;
				}
			}
			
			if(blankCnt >= 4) {
				
				for(int j=input.length-1; j>=0; j--) {
					
					if(input[j][i] == 1) {
						continue;
					}else {
						input[j][i] = 1;
						stack++;
					}
					
					if(stack == 4) {
						break;
					}
				}
				
				stack = 0;
				
				for(int j=0; j<input.length; j++) {
					
					for(int k=0; k<input[j].length; k++) {
						
						if(input[j][k] == 0) {
							break;
						}else {
							horizonCnt++;
						}
					}
				}
				
				if(horizonCnt == 0) {
					
					for(int j=0; j<input.length; j++) {
						
						if(input[j][i] == 0) {
							continue;
						}else {
							input[j][i] = 0;
						}
					}
				}
			}
			
			
			
		}
	}

}
