package Codingtest_Solution.src.programmers;

import java.util.Arrays;

public class IncreasedByTwo {
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(20000000,9909)));
		
		
	}
	
	public static long[] solution(long x, int n) { // x부터 시작해서 x씩 증가를 n번동안 함 
		long[] answer = new long[n]; // n개만큼 long 배열에 공간 마련 
		
		for (int i = 0; i < n; i ++ ) { // n번 반복
			answer[i] =  x * ( i + 1);
		}
		
		return answer; 
		
		
	}

}
