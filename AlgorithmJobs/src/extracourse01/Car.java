package extracourse01;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		
		int count = 0;
		
		int[] cars = new int[5];
		
		for(int i=0; i<cars.length; i++) {
			
			cars[i] = sc.nextInt();
		}
		
		for(int i=0; i<cars.length; i++) {
			
			if(cars[i] == day) {
				
				count ++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
