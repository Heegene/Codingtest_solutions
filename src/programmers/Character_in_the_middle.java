package Codingtest_Solution.src.programmers;

public class Character_in_the_middle {

	    public String solution(String s) {
	        String answer = "";
	       int divide = s.length() / 2;

			if (s.length() % 2 == 0) {

				answer = s.substring(divide - 1, divide + 1);

			} else {

				answer = s.substring(divide, divide + 1);
			}

			return answer;
	    }
	
	
}
