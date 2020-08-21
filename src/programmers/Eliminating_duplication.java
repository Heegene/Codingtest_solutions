package programmers;

import java.util.*;
public class Eliminating_duplication {
	
	    public static int[] solution(int []arr) {
	        ArrayList<Integer> temp = new ArrayList<Integer>();
	        int preNum = 10;
	        
	        for (int num: arr) {
	        	if (preNum != num) {
	        		temp.add(num); // arr�� ���Ҹ� temp�� ����
	        	}
	        	preNum = num;
	        }
	        int[] answer = new int[temp.size()];
	        
	        for (int i = 0; i < answer.length; i++) {
	        	answer[i] = temp.get(i).intValue();
	        }
	        
	        
	        
	        return answer;
	    }
	   
}
