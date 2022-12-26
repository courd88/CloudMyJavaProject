package mypack;

import java.util.Arrays;
import java.util.Scanner;

public class qodufdustmq {
	public static void main(String[] args) {

		final int STUDENTS_PER_CLASS = 3; 
		final int CLASSES_PER_GRADE = 3;
		
		Scanner scan = new Scanner(System.in);

		int[][] scores = new int[CLASSES_PER_GRADE] [STUDENTS_PER_CLASS]; 
		
		
		for (int cls = 0; cls < CLASSES_PER_GRADE; cls ++) {
			System.out.printf("*** %d반 ***\n", cls + 1);		
		for (int std = 0; std < STUDENTS_PER_CLASS; std ++) {
			System.out.printf("%d번 학생의 점수를 입력.", std + 1);
			scores[cls][std] = scan.nextInt();
		}
		}
		int[] totalScores = new int[CLASSES_PER_GRADE];
		for (int cls = 0; cls < CLASSES_PER_GRADE; cls ++) {
			for (int std = 0; std < STUDENTS_PER_CLASS; std ++) {
				totalScores[cls] += scores[cls][std];
			}
		}
		
		double[] averages = new double[CLASSES_PER_GRADE];
		for (int cls = 0; cls < CLASSES_PER_GRADE; cls ++) {
			averages[cls] = totalScores[cls] / STUDENTS_PER_CLASS;
		}
		
		int totalScoreForGrade = 0;
		for (int cls = 0; cls < CLASSES_PER_GRADE; cls ++) {
			totalScoreForGrade += totalScores[cls];
		}
		
		

}

	

}
