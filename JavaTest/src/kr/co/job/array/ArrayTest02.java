package kr.co.job.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// 문자열배열
		String name[] = new String[5];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < name.length; i++) {
			name[i] = scan.next();
		}
		System.out.println(Arrays.toString(name));

	}

}
