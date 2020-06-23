package Codingtest_Solution.src.programmers;

public class HarshadNumber {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(solution(10));
		
		
	}
	
	
	public static boolean solution(int x) throws Exception {
		int sum = 0;
		int divide = x; // x를 임시저장해둠 
		
		// 각 자리수의 합 구하기 
		while (x != 0) { 
			sum += x % 10; // 각 자리수 뒤에서부터 더하기  
			x /= 10; // 다음 자리수로 넘어가기 위해 반복 
		} // sum에 자리수의 합이 마련됨 
		
		return divide % sum == 0 ? true : false; 
		// x는 자리수의 합으로 나눴을 때 맞아 떨어지므로(나머지 0)
		// 이 경우 true(하샤드 수) 
	}

}
