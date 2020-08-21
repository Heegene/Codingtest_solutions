package codeup;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CodeUp2007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "";
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] asc = arr;
		Integer[] desc = new Integer[n];
		for (int i = 0; i < n; i++) {
			desc[i] = arr[i];
		}
		
		Arrays.sort(asc);
		Arrays.sort(desc, Collections.reverseOrder());
		
		if (asc.equals(arr)) {
			ans = "오름차순";
		} else if (desc.equals(arr)) {
			ans = "내림차순";
		} else {
			ans = "섞임";
		}
		
		System.out.println(ans);
		
	}
}
