package extracourse02;

import java.util.Scanner;

public class AttackRange2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 맵 크기
		int x = sc.nextInt(); // x좌표
		int y = sc.nextInt(); // y좌표
		int ar = sc.nextInt(); // 사정거리
		
		x--;
		y--;
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				
				if(i == x && j == y) {
					System.out.print("x ");
					continue;
				}
				
				System.out.print(checkRange(x-i, y-j, ar) + " ");
			}
			
			System.out.println();
		}

		sc.close();
	}
	
	public static int checkRange(int i, int j, int ar) {
		
		if(Math.abs(i) + Math.abs(j) <= ar) {
			
			return Math.abs(i) + Math.abs(j); 
		}
		
		return 0;
	}

}
