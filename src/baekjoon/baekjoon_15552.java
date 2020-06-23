package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class baekjoon_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine().trim());
        // 버퍼에 T값을 입력받는데 trim()을 이용해 잘라냄
      
        
        for (int i=1; i <= T; i++) { // T번만큼 식을 반복
            String text = br.readLine(); // readline으로 String값 반환
            String[] word = text.split(" "); // 공백 split 으로 나눠줌
            int a = Integer.parseInt(word[0]); // word[0] 을 정수화
            int b = Integer.parseInt(word[1]); // word[1]을 정수화
            bw.write("Case #"+ i + ": "+ a + " + " + b + " = " +(a+b) + "\n"); // a+b를 출력하고 줄바꿈처리 
            
        }
        
        bw.flush();
        bw.close();
    }
}
