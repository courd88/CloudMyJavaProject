package mypack;

import java.util.Scanner;

public class HiTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름과 주민번호를 적으세요");

		

//		String name = " 이름 ";
//		String number = " 번호 ";

		String name = scan.nextLine().trim();
		String regno = scan.nextLine().trim();

		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + regno);

		char genderCode = regno.charAt(7);

		String gender = "";
//		if (genderCode == '1'  || genderCode == '3') {
//		gender = "남";
//		} else if (genderCode == '2'  || genderCode == '4') {
//			gender = "여";
//		}

		switch (genderCode) {
		case '1':
		case '3':
			gender = "남";
			break;
		case '2':
		case '4':
			gender = "여";
			break;

		}
		
		regno.substring(0, 2);
		int year = Integer.parseInt(regno.substring(0, 2));
		
		int age = 0;
		
		switch (genderCode) {
		case '1':
		case '2':
			age = 2022 - (1900 + year);
			break;
		case '3':
		case '4':
			age = 2022 - (2000 + year);
			break;
		}

		System.out.printf(">>> %s(%s, %s, 나이 %d세)", name, regno, gender, age);

		}
	}

