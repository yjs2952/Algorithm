import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		array1(n, m);
		
		sc.close();
	}

	public static void array1(int n, int m) {
		
		int[][] input = new int[n][m];
		int num = 0;
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<m; j++) {
			
				input[i][j] = ++num; 
			}
		}
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<m; j++) {
			
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}
}
