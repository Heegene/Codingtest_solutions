package Codingtest_Solution.src.programmers;
import java.util.Calendar;

public class year_2016 {

		public static void main(String[] args) {

		
				System.out.println(getDateDay(6,19));
		}
		
//		static String getDateDay(String date, String dateType) throws Exception {
			static String getDateDay (int a, int b) {
			String answer = "";

			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, 2016);
			cal.set(Calendar.MONTH, a-1);
 			cal.set(Calendar.DAY_OF_MONTH, b);
			
			
			int dayNum = cal.get(Calendar.DAY_OF_WEEK); // Calendar로부터 요일상수 받음

			switch (dayNum) { // daynum 1=일요일 2=월요일 ...
			case 1:
				answer = "일요일";
				break;
			case 2:
				answer = "월요일";
				break;
			case 3:
				answer = "화요일";
				break;
			case 4:
				answer = "수요일";
				break;
			case 5:
				answer = "목요일";
				break;
			case 6:
				answer = "금요일";
				break;
			case 7:
				answer = "토요일";
				break;
			}

			return answer;

		}

	}


