package codeup;

import java.util.Scanner;

public class CodeUp1173 {
	// 30분 전 시간 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String timeinput = sc.nextLine();
		
		int hour = Integer.parseInt(timeinput.substring(0, timeinput.indexOf(" ")));
		int minute = Integer.parseInt(timeinput.substring(timeinput.indexOf(" ") + 1));
		
		minute = minute - 30;
		
		if (minute < 0) {
			minute = minute + 60;
			hour = hour - 1;
		}
		
		if (hour < 0) {
			hour = hour + 24;
		}
		
		System.out.println(hour + " " + minute);
		
	}
	
}
