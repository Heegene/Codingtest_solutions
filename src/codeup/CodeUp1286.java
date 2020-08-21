package codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1286 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[5];
	
	for (int i = 0; i < 5; i++) {
		arr[i] = sc.nextInt();
	}
	
	Arrays.sort(arr);
	
	System.out.println(arr[4]);
	System.out.println(arr[0]);
	
	
	}
}
