package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_10952 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean run = true;

		while (run) {
			String input = br.readLine();
			String[] cutoff = input.split(" ");
			int A = Integer.parseInt(cutoff[0]);
			int B = Integer.parseInt(cutoff[1]);
			if (A == 0 && B == 0) {
				run = false;
			} else {

				String r = A + B + "\n";
				bw.write(r, 0, r.length());
			}

		}
		bw.flush();
		bw.close();

	}
}
