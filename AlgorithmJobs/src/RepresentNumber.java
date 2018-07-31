import java.util.Scanner;

public class RepresentNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 10;
		int[] input = new int[num];

		for (int i = 0; i < input.length; i++) {

			input[i] = sc.nextInt();
		}
		
		getRepresentNumber(input);

		sc.close();
	}
	
	public static void getRepresentNumber(int[] input) {
		
		// 주어진 값 목록의 평균값과 최빈값을 출력하는 메소드
		
		int sum = 0;
		int avg = 0;
		
		int num1 = 0;		// 이전 비교대상
		int tempNum1 = 1;	// 이전 비교대상의 갯수
		
		int num2 = 0;		// 최빈값
		int tempNum2 = 1;	// 최대 빈도수
		
		for(int i=0; i<input.length; i++) {
			
			sum += input[i];
		}
		
		avg = sum / input.length;
		
		for(int i=0; i<input.length; i++){
			
			if(input[i] == num1) continue;
			
			tempNum1 = 1;
			
			for(int j=i+1; j<input.length; j++) {
				
				if(input[i] == input[j]) {	// 값이 같은 경우
					num1 = input[i];
					tempNum1++;
				}
			}
			
			if(tempNum1 > tempNum2) {	// 빈도수 비교
				
				tempNum2 = tempNum1;
				num2 = num1;
			}else if(tempNum1 == tempNum2) { // 빈도수가 같은 경우	
				
				if(num1 < num2) { // 작은 값을 대표값으로 지정
					num2 = num1;
				}
			}
		}
		
		System.out.println(avg);
		System.out.println(num2);
		
	}
}
