import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] input = new int[n][m];
		
		for(int i=0; i<input.length; i++) {

			for(int j=0; j<input[i].length; j++) {
				
				input[i][j] = sc.nextInt();
			}
		}
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(input[a][b]);
		
		sc.close();
	}

}
