package programmers;

import java.util.Arrays;
import java.util.TreeSet;

public class Eliminate_The_Smallest_Treeset {
	
	public static void main(String[] args) {
		int[] input = {1,2,3,4};
		System.out.println(Arrays.toString(solution(input)));
		
	}
	
	
	public static Integer[] solution (int[] arr) {
		Integer[] answer = {};
		TreeSet<Integer> ls = new TreeSet<>();
		for(int i = 0; i < arr.length; i++) {
			ls.add(arr[i]);
		} // treeset 에 배열 복사
		ls.pollFirst();
		answer = ls.toArray(new Integer[0]);
		// TreeSet을 사용할 경우 복사만 하고 pollFirst만 해도 되는 장점이 있지만
		// 프로그래머스 문제에서 요청하는 반환값 int[]는 충족하지 않음
		
		
		
		return answer;
	}

}
