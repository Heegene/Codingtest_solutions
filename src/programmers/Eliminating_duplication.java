package algorithm;

import java.util.*;
public class Eliminating_duplication {
	
	    public static int[] solution(int []arr) {
	        int[] answer = {};
	        TreeSet ts = new TreeSet<>();
	        for (int i = 0; i < arr.length; i++) {
	            ts.add(arr[i]); 
	        }
	        
	        Object[] a = ts.toArray();
	        
	        for (int i = 0; i < a.length; i ++ ) {
	        	answer[i] = (int)a[i];
	        }
	        
	        return answer;
	    }
	    
	    public static void main(String[] args) {
	    	int[] arr = {1,1,2,3,4,4,8};
			System.out.println(solution(arr));
		}

}
