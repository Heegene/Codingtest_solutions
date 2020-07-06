package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class baekjoon_2675 {
	static String S = "";
	public static void main(String[] args)  {
		
	Scanner sc = new Scanner(System.in);	
	
	while (sc.nextLine() != null) {
		S = sc.nextLine();
		
	}
	System.out.println(solution(S));
	
	}
	
//	
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String input = "";
//
//		while ((input = br.readLine()) != null && input.length() != 0) { // 입력값 없이 엔터쳤을때 종료
//			String[] cutoff = input.split(" ");
//			
//			int A = Integer.parseInt(cutoff[0]);
//			int B = Integer.parseInt(cutoff[1]);
//			
//			String r = A + B + "\n";
//			
//			bw.write(r, 0, r.length());
//		}
//	
//
//		bw.flush();
//		bw.close();
	
	
	public static String solution(String S) {
		// 배열에 한글자씩 저장
		String res = "";
		String[] arr = S.split("");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				res += arr[i];
			}
		}
		
				
		return res;
		
		
	}

}
