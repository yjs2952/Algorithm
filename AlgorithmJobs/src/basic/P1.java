package basic;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int input = sc.nextInt();
		
		System.out.println(getSum(input));

		sc.close();
	}
	
	public static int getSum(int num) {
		
		// 입력 값의 자릿수의 합을 리턴하는 메소드
		
		if(num < 10) {
			return num;
		}else {
			return num%10 + getSum(num/10);
		}
	}

}
