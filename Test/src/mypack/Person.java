package mypack;

public class Person {// 이름(name), 주민번호(regno), 성별(gender), 출생년도(birthYear), 출생월(birthMonth), 출생일(birthDay), 2000년 이전 출생 여부(isOlder) 등의 필드
	String name;
	String regno;
	String gender;
	int age;
	int birthYear;
	int birthMonth;
	int birthDay;
	boolean isOlder;
	
	Person(String name, String regno) {
		this.name = name;
		this.regno = regno;
		
		setGender(regno);
		
		switch (regno.charAt(7)) {
		case '1':
		case '2':
			this.birthYear = 1900 + Integer.parseInt(regno.substring(0, 2));
			this.isOlder = true;
			break;
		case '3':
		case '4':
			this.birthYear = 2000 + Integer.parseInt(regno.substring(0, 2));
			this.isOlder = false;
			break;
		}
		
		this.birthMonth = Integer.parseInt(regno.substring(2, 4));
		this.birthDay = Integer.parseInt(regno.substring(4, 6));
		this.age = 2022 - this.birthYear;
	}
	
	private void setGender(String regno) {
		switch (regno.charAt(7)) {
		case '1':
		case '3':
			this.gender = "남";
			break;
		case '2':
		case '4':
			this.gender = "여";
			break;
		}
	}
	
	void printPersonInfo() {
		System.out.printf(">>> %s\n", this.name);
		System.out.printf(">>> - 주민번호: %s\n", this.regno);
		System.out.printf(">>> - 성별: %s\n", this.gender);
		System.out.printf(">>> - 나이: %d세\n", this.age);
		System.out.printf(">>> - 생년월일: %d년 %d월 %d일\n", this.birthYear, this.birthMonth, this.birthDay);
		System.out.printf(">>> - 2000년 이전 출생: %s세\n", this.isOlder ? "Y" : "N");
	}
	
}
