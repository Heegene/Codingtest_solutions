package baekjoon;

import java.util.Scanner;

public class baekjoon_2439 {
	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		int n = N.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int space = n-1; space >= i; space--) {
				System.out.print(" ");
			}
			for (int star = 1; star <= i; star++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
