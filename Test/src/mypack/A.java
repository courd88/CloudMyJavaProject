package mypack;

public class A {
	
	//필드
	int m = 3;
	int n = 4;
	
	//매소드
	void work1() {
		int k = 5;                   // work1 매소드 지역변수
		System.out.println(m + n);   // 필드값은 클래스 내부에서 사용가능
		System.out.println(k);		 // 지역변수는 k work1 내부에서만 사용가능
		work2(3);					 // 매개변수 값은 해당 매소드를 호출하는 쪽에서 설정
	}
	void work2(int i) { 			 // 매개변수 i도 work2 매소드 지역변수
		int j =4;					 // work2 매소드 지역변수
		//System.out.println(k);	 // work1 지역변수는 work1 외부에서 사용불가
		System.out.println(m + n);
		System.out.println(i + j);
	}

}
