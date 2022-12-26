package mypack;

import java.util.Arrays;

public class Hi {

	public static void main(String[] args) {

		String str = "kim 안녕하시렵니까 kim";

		System.out.println(str + " 길이 : " + str.length());

		System.out.println(str + " 3번째 글자 : " + str.charAt(3));
		System.out.println(str + " 마지막 글자 :  " + str.charAt(str.length() - 1));

		System.out.println(str + " '까' 글자의 위치 : " + str.indexOf("까"));

		System.out.println("" + false);
		System.out.println(String.valueOf('나'));
		System.out.println(String.valueOf(1234));
		System.out.println(String.valueOf(1234L));
		System.out.println(String.valueOf(1234.56F));
		System.out.println(String.valueOf(1234.56));

		String s1 = "안녕";
		String s2 = "하세요";
		String s3 = s1.concat(s2);
		String s4 = s1 + s2;
		System.out.println(s3);
		System.out.println(s4);

		String s5 = "abcABC123가나다";
		char[] charArray = s5.toCharArray();
		for (char c : charArray) {
			System.out.printf("[%c] ", c);
		}
		System.out.println();

		byte[] byteArray = s5.getBytes();
		for (byte b : byteArray) {
			System.out.printf("[%x]", b);
		}

		System.out.println();

		System.out.println(s5.toLowerCase());

		System.out.println(s5.toUpperCase());

		System.out.println(s5.replace('b', 'x'));
		System.out.println(s5.replaceAll("가나", "왔나"));

		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 9));
		System.out.println(str.substring(5, 10));

		String[] strArray = str.split(" ");
		System.out.println(Arrays.toString(strArray));

		String s6 = "      앞뒤에 공백(스페이스,탭,줄바꿈)이 포함된 글자		";
		String s7 = "		앞뒤에 탭을 포함한 글자		";
		String s8 = """
				줄바꿈 문자가
				포함된 글자
				""";

		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		
		System.out.println(s6.trim());  //공백제거 .trim()
		System.out.println("[" + s7.trim() + "]");  //보기쉽게 [] 추가
		System.out.println(s8);
		
		
		// #6 문자열 내용 비교
				// 문자열의 실제 내용을 비교 => equals(String s)
				String str1 = new String("abcABC가나다");
				String str2 = "abcABC가나다";
				String str3 = "abcABC가나다";
				String str4 = new String("abcABC가나다");
				
				// == 동등 비교 연산자를 이용해서 비교 => 스택 메모리의 값을 비교
				System.out.println(str1 == str2);
				System.out.println(str2 == str3);
				System.out.println(str3 == str4);
				System.out.println(str4 == str1);
				
				// equlas() => (힙 메모리에 저장된) 실제 값을 비교
				System.out.println(str1.equals(str2));
				System.out.println(str2.equals(str3));
				System.out.println(str3.equals(str4));
				System.out.println(str4.equals(str1));
				
				
				// 대소문자를 구분하지 않고 실제 내용을 비교 => equalsIgnoreCase(String s)
				System.out.println(str1.equals("ABCabc가나다"));
				System.out.println(str1.equalsIgnoreCase("ABCabc가나다"));
				
				
		

	}

}
