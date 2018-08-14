package extracourse02;

import java.util.Scanner;

public class ColorPaper {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 1~100 사이의 정수
		
		int[][] paper = new int[101][101];
		int[][] input = new int[n][4];
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<4; j++) {
				
				input[i][j] = sc.nextInt();
			}
		}
		
		result(paper, input);
		
		sc.close();
	}
	
	public static void result(int[][] paper, int[][] input) {
		
		int[] num = new int[input.length];
		
		for(int idx=0; idx<input.length; idx++) {
			
			for(int j=input[idx][1]; j<=input[idx][3] + input[idx][1] - 1; j++) {
				
				for(int i=input[idx][0]; i<=input[idx][2] + input[idx][0] - 1; i++) {
					
					paper[i][j] = idx+1;
				}
			}
		}
		
		for(int i=0; i<paper.length; i++) {
			
			for(int j=0; j<paper[0].length; j++) {
				
				for(int a=0; a<num.length; a++) {
					
					if(paper[i][j] == a+1) {
						
						++num[a] ;
					}
				}
			}
		}
		
		for(int i=0; i<num.length; i++) {
			
			System.out.println(num[i]);
		}
		
		//return 0;
	}

}
