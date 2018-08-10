package extracourse02;
import java.util.Scanner;

public class MaxOfArr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
			
		for(int i=0; i<9; i++) {
			
			for(int j=0; j<9; j++) {
				
				arr[i][j] = sc.nextInt();
			}
		}
		
		maxArr(arr);
		
		sc.close();
	}
	
	public static void maxArr(int[][] arr) {
		
		int maxVal = 0;
		int col = 0;
		int row = 0;
				
		for(int i=0; i<9; i++) {
			
			for(int j=0; j<9; j++) {
				
				if(arr[i][j] > maxVal) {
					
					maxVal = arr[i][j];
					
					row = i;
					col = j;
					
				}else if(arr[i][j] == maxVal) {
					
					if(i < row) {
						
						row = i;
						col = j;
					}else if(i == row) {
						
						if(j < col) {
							
							row = i;
							col = j;
						}
					}
				}
			}
		}
		
		System.out.println(maxVal);
		System.out.println((row+1) + " " + (col+1));
	}
}
