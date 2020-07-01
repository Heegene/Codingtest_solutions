package leetcode;

import java.util.Arrays;

public class P1470_Shuffle_The_Array {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,4,3,2,1};
		int n = 4;
		System.out.println(Arrays.toString(Solution.shuffle(nums,n)));
		
	}
	
	static class Solution {
		public static int[] shuffle(int[] nums, int n) {
//			Input: nums = [2,5,1,3,4,7], n = 3
//					Output: [2,3,5,4,1,7] 
//					Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7]. 
			
			int[] res = new int[n*2]; // n의 2배만큼(nums의 length만큼) 자리 할당 
			
			for (int i = 0; i < nums.length; i++) { // 빈 배열에 값을 넣기 위해 nums의 길이만큼(배열의 길이만큼) 반복
				res[i] = nums[i / 2 + n * (i % 2)]; 
				// 짝수/홀수 여부에 따라 달라지는 순서
				
			}
			return res;
			
		}
	}

}
