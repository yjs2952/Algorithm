package basic;
import java.util.Scanner;

public class RepresentNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		
		for(int i=0; i<input.length; i++) {
			
			input[i] = sc.nextInt();
		}
		
		getRepresentNumber(input);

		sc.close();	
	}
	
	public static void getRepresentNumber(int[] input) {
		
		int sum = 0;
		int avg = 0;
		
		//int tempNum = 0;	// 현재 대표값
		int numCount = 1;	// 빈도수
		
		int tempNum2 = 0;	// 현재 최빈값
		int numCount2 = 1;	// 빈도수
		
		// 평균값
		for(int i=0; i<input.length; i++){
			sum += input[i];
		}
		
		avg = sum/input.length;
		
		// 최빈값
		for(int i=0; i<input.length; i++) {
			
			if(i != 0 && input[i] == input[i-1]) continue;
			
			for(int j=i+1; j<input.length; j++) {	// 현재 대표값
				
				if(input[i] == input[j]) {	// 기준값과 비교값이 같은 경우
					
					//tempNum = input[i];
					numCount++;
				}
				
			}
			
			if(numCount > numCount2) {	// 빈도수가 다른 경우
				
				numCount2 = numCount;
				tempNum2 = input[i];
			}else if(numCount == numCount2) {	// 빈도수가 같은 경우
				
				if(tempNum2 > input[i]) {
					
					tempNum2 = input[i];
				}
			}
  			
			numCount = 1;
		}
		
		System.out.println(avg);
		System.out.println(tempNum2);
		
	}
}
