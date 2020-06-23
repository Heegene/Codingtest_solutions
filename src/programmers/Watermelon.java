package Codingtest_Solution.src.programmers;

public class Watermelon {
	public static void main(String[] args) {
		
	Solution sol = new Solution(); //
		
	System.out.println(sol.solution(5));

	}
}

class Solution {
	public String solution(int n) {
		
		String answer = ""; // answer 변수를 for 문 바깥에서 반환시켜야 하기때문에 바깥에 기재해 줍니다. 
		
		for (int i = 0; i < n ; i++) { // n의 길이만큼 반복하게 됩니다. ex n이 5라고 하면 0,1,2,3,4 이렇게 해서 다섯번
			if (i % 2 != 0) { // i가 홀수일 때 
				answer += "박"; // 답에 '박'을 더합니다. 0,1,2,.. 이렇게 시작하므로 박을 먼저 씁니다.
			}
			if (i%2 ==0 ) { // i가 짝수일 때 
				answer += "수"; // 답에 '수'를 더합니다.
				
			}
			
		}
		return answer; // 더해진 결과물을 반환합니다. 
	}
}
