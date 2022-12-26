package mypack;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car("제네시스");
		
		//Car 객체의 필드값 출력
		/*
		 * System.out.println(myCar.model); System.out.println(myCar.start);
		 * System.out.println(myCar.speed);
		 */
		myCar.printCarState();
		
		//Car 객체의 매소드 호출
		myCar.speedUp();
		
		/*
		 * System.out.println(myCar.model); System.out.println(myCar.start);
		 * System.out.println(myCar.speed);
		 */
		myCar.printCarState();
		
		myCar.speedDown();
		
		/*
		 * System.out.println(myCar.model); System.out.println(myCar.start);
		 * System.out.println(myCar.speed);
		 */
		myCar.printCarState();
		
		
		

	}
}
