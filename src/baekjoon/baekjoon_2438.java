package baekjoon;

import java.util.Scanner;

public class baekjoon_2438 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int star = 1; star <= i; star++) {
				System.out.print("*");
				
			} 
			System.out.println();
		}
		

	}

}
