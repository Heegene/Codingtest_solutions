package Codingtest_Solution.src.hackerrank;

import java.util.Scanner;

public class java_if_else {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 홀수면 weird
		// 짝수 이면서 2에서 5 사이면 not weird
		// 짝수 이면서 6이랑 20 사이이면 weird
		// 20 보다 크면 not weird
		
		int N = scanner.nextInt();
		
		if (N%2!=0) {
			System.out.println("Weird");
		} else if (N >= 2 && N <= 5) {
			System.out.println("Not Weird");
		} else if (N >= 6 && N <= 20) {
			System.out.println("Weird");
		} else {
			System.out.println("Not Weird");
		}
		
		
		
		
		
		
		
	}

}
