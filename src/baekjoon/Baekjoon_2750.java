package algorithm;


import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numofint = sc.nextInt();
		int[] nums = new int[numofint];
		
		for (int i = 0; i < numofint; i++) {
			nums[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}
}
