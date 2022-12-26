package mypack;

import java.util.Arrays;

public class Traning {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3 };
		System.out.println(Arrays.toString(array));
		modifyDate(array);
		System.out.println(Arrays.toString(array));
	}
	private static void modifyDate(int[] a) {
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	}

	
}

