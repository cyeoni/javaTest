package kr.co.job.array;

public class ArrayYest01 {

	public static void main(String[] args) {
		// 배열 : 같은 타입의 변수를 하나의 묶음으로 다르는것
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			score[i] = (int) ((Math.random() * 100) + 1);
			System.out.print(score[i] + " ");
			// System.out.println(Arrays.toString(score));
		}

	
	
	
	
	
	}

}
