package codeup;

import java.util.Scanner;

public class GcdLcm {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println(gcd(num1,num2));
		System.out.println(lcm(num1, num2));
	}
	
	public static int gcd (int num1, int num2) {
		// 최대공약수
		while  (num2 > 0) {
			int temp = num2; // temp = 6
			num2 = num1 % num2; // num2 = 2 나누기 6의 나머지
			num1 = temp; // num1 = 6
		}
		return num1;
	}
	
	public static int lcm (int num1, int num2) {
		// 최소공배수
		// 0이 아닌 두 수의 곱 / 두 수의 최대공약수
		
		return (num1 * num2) / gcd(num1, num2);
	}
}
