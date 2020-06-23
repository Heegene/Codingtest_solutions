package baekjoon;

import java.util.Scanner;

public class baekjoon_10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A[] = new int[sc.nextInt()]; // 입력한 A의 개수만큼 배열 공간 할당
		int X = sc.nextInt(); // X보다 작은 수를 출력해야 하므로 X값을 입력 받음

		for (int i = 0; i < A.length; i++) { // A의 길이만큼(10번 반복)
			A[i] = sc.nextInt(); // A의 i번째 값에 입력받은 숫자 할당
			}
		
		for (int i = 0; i < A.length; i++) { // a[0]부터 끝까지 카운터
			if (A[i] < X) { // A[i] 값이 X보다 작으면 A[i] 출력 
				System.out.println(A[i]);
			}
			
		}
		
		
		
		}

	}

