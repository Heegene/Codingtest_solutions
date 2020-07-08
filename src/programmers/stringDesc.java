package programmers;

import java.util.Arrays;
import java.util.Collections;

public class stringDesc {
	static String s = "Zbcdefg";
	public static void main(String[] args) {
		
		// System.out.println(solution(s));
		System.out.println(solution2(s));
		
		
	}
	
	// Stringbuilder를 해결한 문제 풀이 	
	public static String solution(String s) {
        String answer = "";
        char[] sol = s.toCharArray();
        Arrays.sort(sol);
		
	    answer = new StringBuilder(new String(sol)).reverse().toString();
	    
		
		return answer;
    }
	
	// 배열을 이용한 문제 풀이
	public static String solution2(String s) {
		String[] arr = s.split(""); // 한글자 단위로 쪼갬
		Arrays.sort(arr, Collections.reverseOrder());
		// 해당 array를 역순으로(desc) 정렬
		
		StringBuilder sb = new StringBuilder();
		
		for (String output : arr) { 
			sb.append(output); //g,f,e,d,c,b,Z 순차생성하여
			// Stringbuilder 객체 안에 넣음(끝에다가 넣는거니까 add가 아니라 인덱스 없이 append를 사용) 
		}
		// sb를 String으로 변환하여 리턴 
		return sb.toString();
		
	}
	
	
	
	
}
	
	
	

