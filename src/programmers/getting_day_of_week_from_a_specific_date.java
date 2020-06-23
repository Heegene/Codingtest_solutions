package Codingtest_Solution.src.programmers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class getting_day_of_week_from_a_specific_date {

	public static void main(String[] args) {

		try {
			System.out.println(getDateDay("20200618", "yyyyMMdd")); // 입력 형식은 ("원하는 날짜", "날짜 형식" 입니다.
			// 주의하실 점은, 날짜 형식 중 연도는 YYYY가 아닌 yyyy로 기재하여 주셔야 하고, 월은 대문자 M, 일은 소문자 d로 해 주시면 됩니다. 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static String getDateDay(String date, String dateType) throws Exception {

		String day = "";

		SimpleDateFormat df = new SimpleDateFormat(dateType); // 인스턴스 생성
		Date nDate = df.parse(date); // date 부분 잘라냄

		Calendar cal = Calendar.getInstance();
		cal.setTime(nDate);// nDate 기준으로 날짜 변경

		int dayNum = cal.get(Calendar.DAY_OF_WEEK); // Calendar로부터 요일상수 받음

		switch (dayNum) { // daynum 1=일요일 2=월요일 ...
		case 1:
			day = "일요일";
			break;
		case 2:
			day = "월요일";
			break;
		case 3:
			day = "화요일";
			break;
		case 4:
			day = "수요일";
			break;
		case 5:
			day = "목요일";
			break;
		case 6:
			day = "금요일";
			break;
		case 7:
			day = "토요일";
			break;
		}

		return day;

	}

}
