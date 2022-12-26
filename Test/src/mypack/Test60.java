package mypack;

public class Test60 {

	public static void main(String[] args) {

		OUTER: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 3) {
					continue OUTER;
				}
				System.out.println(i + " , " + j);
			}
		}
	}
}
