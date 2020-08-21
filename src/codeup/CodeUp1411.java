package codeup;

import java.util.Scanner;

public class CodeUp1411 {
	// 빠진 카드 찾기
	// 첫번째 줄에는 총 카드의 수가 입력됨
	// 1부터 총 카드의 수까지 카드가 순서대로 있고,
	// 한 장의 카드가 빠져 있는데, 빠진 카드를 출력
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int total = 0;
		int exp = 0;
		for (int i = 1; i <= N ; i++) {
			total += i;
		}
		for (int i = 0; i < N - 1; i++) {
			exp += sc.nextInt();
		}
		System.out.println(total-exp);
	}
}
