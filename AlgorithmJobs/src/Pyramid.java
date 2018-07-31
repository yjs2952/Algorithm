import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int s = sc.nextInt();

		int[] input = new int[200];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {	// 공백

				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {	// 숫자

				s = s % 10;

				if (s == 0) {	// 10인 경우 0으로 초기화
					s = 1;
				}

				input[j] = s++;
				
				if (i % 2 != 0) { // 짝수 번째 줄 (정상 출력)

					System.out.print(input[j]);

				}
			}
			
			if (i % 2 == 0) { // 홀수 번째 줄 (반대로 출력)
				
				for(int j=2*i; j>=0; j--) {
					
					System.out.print(input[j]);
				}
			} 
			
			System.out.println();
		}

		sc.close();
	}
}
