package Codingtest_Solution.src.programmers;

public class sum_between_two_ints {

	public static void main(String[] args) {
		long answer = solution(10, 15);
		System.out.println(answer);
	}

	// 조건
	// 정수 a,b가 같으면 아무 값이나 리턴
	// 같지 않은 경우 둘 사이 수의 합을 리턴 (3,6이면 3,4,5 합인 12)
	public static long solution(int a, int b) {
		long answer = 0;
		long bigger = 0; 

		if (a == b) {
			answer = a;
		} else if (a > b) { // a가 큰 경우
			bigger = a;  // long variable 'bigger'에 a의 값을 저장
			for (long i = b; i <= bigger; i++) { // i에 b값을 넣고 bigger과 같아질 때까지 반복
				answer += i; 
			}
		} else {
			bigger = b; 
			for (long i = a; i <= bigger; i++) {
				answer += i;

			}
		}

		return answer;
	}

}
