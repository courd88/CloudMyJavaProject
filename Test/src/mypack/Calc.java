package mypack;

import java.util.Arrays;

public class Calc {

	public static void main(String[] args) {
		// 매개변수 개수 확인
		if (args.length != 3 ) {
			System.out.println("잘못된 입력입니다");
			System.out.println("예) Clac 숫자 puls|minus 숫자");
			System.exit(0);
		}
		
		// 두번째 매개변수 식별확인
		
		if (args[1].equals("plus")) {
			
		}
		
		// plus이면 첫번째 매개변수 + 세번째 매겨변수 결과 출력
		
		// minus면 첫번째 매개변수 - 세번째 매개변수 결과 출력
		
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
		
		
		if (args[1].equals("plus")) {
			
		}
		
	}
	
	

}
	
