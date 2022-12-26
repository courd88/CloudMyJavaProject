package test.system;

import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		System.out.println(sdf.format(now));
		
		

	}

}
