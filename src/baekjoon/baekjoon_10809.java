package baekjoon;

import java.util.Scanner;

public class baekjoon_10809 {
	
	public static void main(String[] args) {
		
		// 단어를 입력받음
		// a~z까지의 알파벳 순서 중
		// 해당 알파벳이 나타나는 위치 인덱스 값 리턴
		// 만약, 해당 알파벳이 들어가지 않으면
		// -1값 리턴
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		// a~z까지의 알파벳은 숫자처럼 사용할 수 있음 
		for (char c = 'a'; c <= 'z'; c++ ) {
			System.out.print(input.indexOf(c) + " "); 
			///
		}
		
		
		
		
		
		
		
		
		
	}

}
