package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class eliminate_the_smallest {

	public static void main(String[] args) {
		int[] input = {1, 2, 3, 4};
		System.out.println(Arrays.toString(solution(input))); // 배열의 내용을 시각화하여 보기 위해 사용
		// 그냥 sysout하면 주소값이 나타남 
		int a = 10;
		int minusa = ~10+1;
		System.out.println(minusa);
	}

	static int[] solution(int[] arr) {
		int[] answer = {};
		ArrayList<Integer> ls = new ArrayList<Integer>(); // 리스트 생성
		// 여기서list는 Arraylist해도 되고 linkedlist를 해도 상관 없음 
		
		for (int i = 0; i < arr.length; i++) {
			ls.add(arr[i]); // 배열과 동일하게 리스트에 담음
		}
		
		if (ls.size()!= 1) {
			ls.remove(Collections.min(ls));
			answer = new int[ls.size()];
			for (int i = 0; i < ls.size(); i++) {
				answer[i] = ls.get(i);
			}
		}
			else {
				answer = new int[] {-1};
			}
		return answer; 
		
	}
}

// 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
// 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
// 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
// 제한 조건
// arr은 길이 1 이상인 배열입니다.
// 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
// 입출력 예
