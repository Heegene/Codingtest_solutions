package Codingtest_Solution.src.programmers;

import java.util.Arrays;

public class MrKim {
	static String answer = "";
	
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		solution(seoul);
		System.out.println(answer);
		
		
	}



	public static String solution(String[] seoul) {
		int index = Arrays.asList(seoul).indexOf("Kim");
		answer = "김서방은" + index + "에 있다";
		return answer;
		
	}
}