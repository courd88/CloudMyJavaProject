package traning;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		String intput = scn.nextLine();
		int score  = Integer.parseInt(intput);
		String hakjum = "";
		if (score >= 90) {
			hakjum = "A 학점";
		} else if (score < 90 && score >= 80) {
			hakjum = "B 학점";
		} else if (score < 80 && score >= 70) {
			hakjum = "C 학점";
		} else {
			hakjum = "D 학점";
		}
		System.out.println(score + "점은 " + hakjum + " 입니다");
		
		
	}

}
