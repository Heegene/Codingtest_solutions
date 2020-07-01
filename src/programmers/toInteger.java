package programmers;

public class toInteger {

	public static void main(String[] args) {
		
		System.out.println(solution("-6"));
		
		String s = "hello";
		test(s);
		System.out.println(s);
		
	}
	
	
	public static int solution (String s) {
		int answer = 0;
		
		answer = Integer.parseInt(s);
		
		
		return answer;
	}
	
	public static void test (String s) {
		s += "Java!";
	}
}
