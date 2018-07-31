package basic;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		String input = sc.nextLine();
		
		System.out.println(input.length());
		
		if(isPalindrome(input, 0, (input.length() - 1))) {
			System.out.println("팰린드롬 입니다.");
		}else {
			System.out.println("팰린드롬이 아닙니다.");
		}
		
		sc.close();
	}
	
	public static boolean isPalindrome(String str, int start, int end) {
		
		// str 의 start ~ end 가 팰린드롬이면  true 아니면 false
		
		if(start == end) {
			return true;
		}else if(start > end || end < start) {
			
			return true;
		}
		else {
			if(str.charAt(start) == str.charAt(end)) {
				return isPalindrome(str, start+1, end-1);
			}else {
				return false;
			}
		}
	}
}
