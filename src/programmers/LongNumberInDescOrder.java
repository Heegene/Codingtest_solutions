package com.appress.spring.domain;

import java.util.Arrays;
import java.util.Collections;

public class LongNumberInDescOrder {
	public static void main(String[] args) {
		Long n = (long) 123546789889L;
		String number = "" + n;
		Integer[] arr = new Integer[number.length()];
		
		for (int i = 0; i < number.length(); i++) {
			arr[i] = Integer.parseInt(number.substring(i, i+1));
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		String tmp = "";
		for (int i = 0; i < arr.length; i++) {
			tmp += arr[i];
		}
		
		Long answer = Long.parseLong(tmp);
		System.out.println(answer);
	}
	

}
