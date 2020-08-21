package codeup;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CodeUp2055 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		TreeSet<Integer> res = new TreeSet<>();
		for (int i = 1; i <= b; i++) {
			if (a%i == 0) {
				res.add(i);
			}
			if (b%i == 0) {
				res.add(i);
			}
		}
		
		Iterator it = res.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}
}
