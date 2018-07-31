package basic;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int input = sc.nextInt();
		
		binary(input);
		
		sc.close();
		
	}
	
	public static void binary(int num) {
		
		// 입력 값을 이진수로 변환하여 리턴하는 메소드
		
		if(num == 1){
			System.out.print(num); 
		}else if(num == 0) {
			System.out.print(num);
		}else {
			binary(num/2);
			System.out.print(num%2);
		}
	}

}
