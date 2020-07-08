package programmers;

import java.util.Arrays;

public class Budget {
	
	public static void main(String[] args) {
		int[] d = {2, 2, 3, 8,5,6};
		int budget = 10;
		
		System.out.println(solution(d,budget));
	}
	
	public static int solution(int[] d, int budget) {
		int answer=0;
		int result=0;
		Arrays.sort(d); // int 배열을 오름차순으로 배열 
		for (int i = 0; i < d.length; i++) { // d length 만큼 반복(품목 수만큼)
			result += d[i]; // result 에 각 원소를 합산
			
			if (result > budget) { // 결과값이 budget을 초과하는 경우
				answer = i; // i번째에 answer 을 넣고 loop를 빠져나감 
				break;
			} 
			if (result <= budget) {
				answer = d.length;
			}
		}
		
		return answer; // answer 반환 
	}

}
