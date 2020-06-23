package baekjoon;

import java.util.Scanner;

public class baekjoon_2739 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int scan1 = scanner.nextInt();
		
		
		for (int N = 1; N <= 9; N ++) {
			System.out.println(scan1 + " * " + N + " = " + (scan1*N) );
			
		}
		
	}
}
