package baekjoon;

import java.util.Scanner;

public class baekjoon_2523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 줄수: 2*N-1 번째까지 출력
		// 예시: 3이 입력되면 5줄 출력
		
		// 증가 규칙
		// 1부터~ N까지 증가
		// N부터~까지 감소
		
		// 별 늘어나는 부분
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// 별 줄어드는 부분
		for (int i = N-1; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
