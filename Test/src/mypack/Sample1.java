package mypack;

import java.io.IOException;

public class Sample1 {
	
	// 필드
	int i;
	int d;
	boolean b;
	String s;
	
	//메소드
	void work() throws IOException {
		int k;
		//System.out.println(k);
	}

	public static void main(String[] args) {
		// Sample 클래스의 인스턴스 생성
		Sample1 sample = new Sample1();
		System.out.println(sample.i);
		System.out.println(sample.d);
		System.out.println(sample.b);
		System.out.println(sample.s);

	}

}
