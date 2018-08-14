package extracourse02;

import java.util.Scanner;

public class ClassPresident {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] input = new int[n][5];
		
		for(int i=0; i<input.length; i++) {
			
			for(int j=0; j<input[0].length; j++) {
				
				input[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
	}
	
	public static void classPresident(int n, int[][] input) {
		
		for(int i=0; i<input[0].length; i++) {
			
			for(int j=0; j<input.length; j++) {
				
				
				
			}
		}
	}

}
