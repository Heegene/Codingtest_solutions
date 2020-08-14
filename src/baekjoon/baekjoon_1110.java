package baekjoon;

import java.util.Scanner;

public class baekjoon_1110 {
	// 0 <= x <= 99인 정수
	// 주어진 수가 10보다 작으면 0을 붙여 두자리 수를 만듦
	// 각 자리의 수를 더함
	// 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 값의 합의 가장 오른쪽 자리 수를 이어붙임
	// 이 연산을 반복하여 원래의 수로 돌아올 때까지의 사이클의 길이 구하기
	
	// 예시: 26의 사이클은 4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int count = 0;
		int tmp = input;
		
		while (true) {
			int a = tmp / 10; // 십의자리
			int b = tmp % 10; // 일의자리
			// 2, 6
			
			if (a+b < 10) { 
				tmp = b*10 + a+ b; // 68
				// 60 + 2 + 6 해서 68 만듦
			} else {
				tmp = b *10 + (a+b)%10;
				
			}
			
			count++;
			if (tmp == input) {
				break; // 원래의 수로 돌아오면 break;
			}
		}
		
		System.out.println(count);
		sc.close();
		
		
		
		
	}

}
