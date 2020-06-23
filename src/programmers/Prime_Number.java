package programmers;

public class Prime_Number {
	public static void main(String[] args) {

		System.out.println(solution(10));

	}

	public static int solution(int n) {
		int answer = 0;
		int[] number = new int[n + 1]; // n보다 1개 많은 배열

		// 2부터 n까지의 수를 배열에 넣음
		for (int i = 2; i <= n; i++) {
			number[i] = i;
		}

		// 2부터 시작해서 그 배수들을 0으로 만듦
		// 0이면 넘어가고 아니면 그 배수들을 다시 0으로 만듦
		for (int i = 2; i <= n; i++) {
			if (number[i] == 0) {
				continue;
			}
			for (int j = 2 * i; j <= n; j += i) { // i가 2일때 j는 4가 되고 4 삭제되는 식으로 배수 지워나감
				number[j] = 0;
			}
		}

		// 배열에서 0이 아닌 것들의 개수를 셈
		for (int i = 0; i < number.length; i++) {
			if (number[i] != 0) {
				answer++;
			}
		}

		return answer;
	}
}
