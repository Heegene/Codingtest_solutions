package leetcode;

import java.util.Arrays;

public class P1480_Running_Sum_Of_1d_Array {
	public static void main(String[] args) {
		Solution solu = new Solution();
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(solu.sol(nums)));
		
	}
	
	static class Solution {
		public int[] sol (int[] nums) {
			for (int i = 1; i < nums.length; i++) {
				nums[i] += nums[i - 1];
				// i가 1일때 nums[i] += 1 -1 
				// i가 2일때 nums[i] += 2 - 1 <전번째 nums[i]를 더해줌
			}
			return nums;
		};
		
	}
	
}


