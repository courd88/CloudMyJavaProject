package mypack;

import java.util.Arrays;
import java.util.Scanner;

public class qoduf {

	public static void main(String[] args) {

		final int STUDENT = 5;
		Scanner scan = new Scanner(System.in);

		int[] scores = new int[STUDENT];

		int totalScore = 0;
		for (int i = 0; i < STUDENT; i++) {
			System.out.printf("%d번째 학생의 점수를 입력하세요.\n", i + 1);
			scores[i] = scan.nextInt();
			totalScore += scores[i]; 
		}
		double average = totalScore / STUDENT;

		for (int i = 0; i < STUDENT; i++) {
			totalScore = totalScore + scores[i];
		System.out.printf("%d번째 학생의 점수 : %d\n", i + 1, scores[i]);
	}
		System.out.println("-----------");
		System.out.println("총점 : "+ totalScore);
		System.out.println("평균 : " + average);

}
}
