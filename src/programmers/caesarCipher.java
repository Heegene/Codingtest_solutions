package programmers;


public class caesarCipher {
	
	static String s = "AB";
	static int n = 1;
	
	public static void main(String[] args) {
		System.out.println(solution(s,n));
		
		char tem = 'A';
		System.out.println(tem+1);
		
	}
	
	
	
	public static String solution(String s, int n) {
		String answer = "";
		char temp = 0;
		char[] sol = s.toCharArray();
		for (int i = 0; i < sol.length; i++) {
			sol[i] = temp;
			temp += 2;
			sol[i] = temp;
		}

//		answer = Arrays.toString(sol);
		answer = new StringBuilder(new String(sol)).toString();
		
		return answer;
		
	}
	
//	public static String solution(String s) {
//        String answer = "";
//        char[] sol = s.toCharArray();
//        Arrays.sort(sol);
//		
//	    answer = new StringBuilder(new String(sol)).reverse().toString();
//	    
//		
//		return answer;
//    }

}
