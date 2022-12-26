package test.system;

public class ValueComareExample {

	public static void main(String[] args) {
		
		int i1 = 100;
		int i2 = 100;
		System.out.println(i1 == i2);
		
		Integer ii1 = 128;
		Integer ii2 = 128;
		System.out.println(ii1 == ii2);
		System.out.println(ii1.equals(ii2));
		
		Integer ii3 = 127;
		Integer ii4 = 127;
		System.out.println(ii3 == ii4);
		System.out.println(ii3.equals(ii4));
	}

}

////포장 값 비교
//포장 객체는 내부 값을 비교할 때 
//== 또는 != 연산을 사용 수 없고, *equals 메서드를 사용해야 함
//~~~~~~~~~~~~~~~ ⇐ 값을 비교하는 것이 아니고, 번지를 비교하기 때문
