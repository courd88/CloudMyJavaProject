package test.system;

import java.util.Arrays;
import java.util.Scanner;

public class LottoExample {

	public static void main(String[] args) {

		// 사용자 입력 후 정렬 해서 출력
		System.out.println(">1 부터 45사이 6개 숫자"); // 1
		System.out.print(">"); // 2
		Scanner scan = new Scanner(System.in); // 3
		String input = scan.nextLine(); // 4
		scan.close(); // 5

		// 입력값을 콤마를 기준으로 분리
		String[] values = input.split(","); // 6

		// 로또 번호의 데이터 차입과 동일한 데이터 타입으로 변경 sTring[] - int[]
		int[] userInputNumbers = new int[6];
		for (int i = 0; i < values.length; i++) {
			userInputNumbers[i] = Integer.parseInt(values[i].trim());
		}
		System.out.println(Arrays.toString(userInputNumbers));

		// 사용자 입력 데이터를 담고있는 배열의 값을 정렬
		Arrays.sort(userInputNumbers);
		System.out.println(Arrays.toString(userInputNumbers));

		// 정렬된 결과를 출력
		System.out.print(">> 선택번호: ");
		for (int no : userInputNumbers) {
			System.out.printf("%2d  ", no);// 두자리 띄어서 출력 %2d
		}
		System.out.println();

		// 로또 번호 생성 후 정렬하고 출력
		// 로또 번호를 저장하는 배열을 정의
		int[] lottoNumbers = new int[6]; // 번호를 정의
		while (true) {
			int num = (int) (Math.random() * 45) + 1;
			
			int i = 0;
			for (i = 0; i < lottoNumbers.length; i++) {
				if (lottoNumbers[i] == num)
					break;
				if (lottoNumbers[i] == 0) {
					lottoNumbers[i] = num;
					break;
				}
			}
			if ( i == lottoNumbers.length)
				break;
		}
		//System.out.println(Arrays.toString(lottoNumbers));
		
		Arrays.sort(lottoNumbers);
		//System.out.println(Arrays.toString(lottoNumbers));
		
		System.out.print(">> 선택번호: ");
		for (int no : userInputNumbers) {
			System.out.printf("%2d  ", no);// 두자리 띄어서 출력 %2d
		}
		System.out.println();
				

		// 로또 번호와 사용자 입력을 비교해서 결과 출력
		int count = 0;
		for (int user : userInputNumbers) {
			for(int lotto : lottoNumbers) {
				if ( lotto == user) {
					count ++;
					break;
				}
				
			}
		}
		String message = "";
		if (count == 6 ) {
			message = "1등으로 당첨되었습니다.";
		}
		else if (count == 5) {
			message = "2등이야";
		}
		else if (count == 4) {
			message = "삼";
		}
		else {
			System.out.printf("%d개가 일치하므로 %s\n", count, message);
		}
		
		System.out.printf("%d개가 일치 하므로 당첨안됫습니다.\n", count);
		
		

	}

}
