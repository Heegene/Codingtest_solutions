package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2675 {
	static String S = "";
	static int R = 0;
	static int T = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		
		for (int i = 0; i < T; i++) {
			
			int R = Integer.parseInt(str[0]);
			// 배열의 첫번째에 해당하는 걸 숫자로 변환
			
			S = str[1];
			
		}
		
		solution(S);
	}

	public static void solution(String S) {
		String res = "";
		// 배열에 한글자씩 저장
		
		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j < R; j++) {
				res = S.charAt(j) + "";
				System.out.println(res);
			}
		}
		


	}

}
