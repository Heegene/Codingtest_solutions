package baekjoon;

import java.util.Scanner;

public class Baekjoon_5543 {
	// 삼항연산자를 이용해 세 수를 비교했음 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[5];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		int min1 = input[0] > input[1] ? input[1]:input[0];
		int min2 = input[2] > min1 ? min1 : input[2];
		
		int mindrink = input[3] > input[4] ? input[4]:input[3];
		
		
		System.out.println(min2+mindrink-50);
		
	
		
		
		
		
		
		
		
		
		
	}
}
