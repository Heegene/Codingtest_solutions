package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_10951 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = "";

		while ((input = br.readLine()) != null && input.length() != 0) { // 입력값 없이 엔터쳤을때 종료
			String[] cutoff = input.split(" ");
			
			int A = Integer.parseInt(cutoff[0]);
			int B = Integer.parseInt(cutoff[1]);
			
			String r = A + B + "\n";
			
			bw.write(r, 0, r.length());
		}
	

		bw.flush();
		bw.close();
	}

}
