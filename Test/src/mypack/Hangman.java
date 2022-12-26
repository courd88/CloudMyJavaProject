package mypack;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		// 단어장 생성 (문장에서 문장부호를 제거한 후 공백을 기준으로 단어를 분리)
		final String STATEMENT = "The best of the BBC, with the latest news and sport headlines, weather, highlights and much more from across the whole of BBC Online."
					.replaceAll(",",  "")
					.replaceAll("\\.", "");		
		String[] words = STATEMENT.split(" "); 
		
		// 단어장에서 임의의 단어를 추출
		// Math.random() * (max - min + 1) + min
		int randNum = (int)(Math.random() * words.length);
		String word = words[randNum];
		
		// 단어의 자릿수를 표시
		String display = "";
		for (int i = 0; i < word.length(); i ++) {
			display += "_";
		}
		System.out.println("단어 >>> " + display);
		System.out.println("시스템이 추출한 단어를 맞춰 보세요.");
		


		// 사용자가 입력한 문자(char)가 단어에 있는 경우, 해당 문자를 출력하고, 
		// 없는 경우 이전 상태를 그대로 출력
		Scanner scan = new Scanner(System.in);
		while(true) {
			String c = scan.nextLine();
			String temp = display;
			display = "";
			for (int i = 0; i < word.length(); i ++) {
				if (String.valueOf(word.charAt(i)).equals(c)) {
					display += c; 
				} else {
					display += temp.charAt(i);
				}
			}
			System.out.println("단어 >>> " + display);
			
			if (word.equals(display)) {
				System.out.println("정답입니다.");
				break;
			}
		}
	}

}
