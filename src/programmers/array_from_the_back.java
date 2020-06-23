package Codingtest_Solution.src.programmers;

import java.util.Arrays;

class array_from_the_back {
	public static void main(String[] args) {
	long n = 12345678912321L;
	
	array_from_the_back test = new array_from_the_back();
//	System.out.println(test.solution(n)); 이렇게 하면 원하지 않는 값이 나타남 

	
	int[] array = test.solution(n);
	System.out.println(Arrays.toString(array));
	}
	
    public int[] solution(long n) {
        String a = "" + n;  // long 자연수 n을 String 으로 변경 
        
				int[] answer = new int[a.length()]; // String a의 길이만큼 할당 
				int count = 0; // count 초기화 
				
				while (n > 0 ) {
					answer[count] = (int) (n%10); 
					// 자리수 배열에 넣고 옮김 (소수점 int 절삭) 
					n /= 10;
					count++;
				}
				
				return answer;
    }
}





