import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] input = new int[n][3];

		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < 3; j++) {

				input[i][j] = sc.nextInt();
			}
		}
		
		diceGame(input);

		sc.close();
	}

	public static void diceGame(int[][] input) {

		int sameCnt1 = 1; // 같은 수의 빈도수
		int sameCnt2 = 1;

		int sameNum1 = 0; // 같은 수
		int sameNum2 = 0;

		int bigNum1 = 0; // 셋 중 가장 큰 수
		int bigNum2 = 0;

		int total = 0; // 상금

		for (int i = 0; i < input.length; i++) { // 참여한 사람 수 만큼 반복

			sameCnt1 = 1;

			for (int j = 1; j < input[i].length; j++) { // 3개의 주사위 각각의 번호 비교

				if (input[i][0] == input[i][j]) {

					sameCnt1++;
					sameNum1 = input[i][0];
				} else {
					if (input[i][0] > input[i][j]) {

						bigNum1 = input[i][0];
					} else {

						bigNum1 = input[i][j];
					}
				}
			}
			
			if(sameCnt1 < sameCnt2) {
				
				continue;
			}else {
				
				if(sameCnt1 > sameCnt2)	sameNum2 = 0;
				
				if(sameCnt1 == 1) {
					
					bigNum2 = bigNum1;
				}else {
					
					sameCnt2 = sameCnt1;

					if (sameNum1 > sameNum2) {

						sameNum2 = sameNum1;
					}
				}
			}
		}

		if(sameCnt2 == 3) {
			
			total = 10000 + sameNum2 * 1000; 
		}else if(sameCnt2 == 2) {
			
			total = 1000 + sameNum2 * 100;
		}else {
			
			total = bigNum2 * 100;
		}
		
		System.out.println(total);
	}

}
