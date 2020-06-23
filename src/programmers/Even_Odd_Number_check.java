package programmers;

public class Even_Odd_Number_check {
 public static void main(String[] args) {
	System.out.println(solution(3)); // 테스트를 위해 int를 넣는 공간입니다. 
	 
}	
	
 public static String solution(int num) {
	 String answer = "";
	 answer = num % 2 == 0 ? "Even" : "Odd"; // 삼항연산자를 이용하여 2의 배수(짝수)인 경우 answer에 "Even"을 대입, 아닌 경우 "Odd" 대입 
	 return answer;
 }
 
	

}


