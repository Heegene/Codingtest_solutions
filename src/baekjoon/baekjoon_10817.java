package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] arr = new int[] {A, B, C};
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
	}

}
