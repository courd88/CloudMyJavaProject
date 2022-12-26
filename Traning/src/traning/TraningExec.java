package traning;

import java.util.Scanner;

public class TraningExec {

	public static void main(String[] args) {
		Traning g = new Traning();
		g.setDan(2);
		g.print();
		
		Traning g2 = new Traning();
		g2.print();
		
		Traning g3 = new Traning(3);
		g3.print();
		
		for (int i = 2; i < 10; i ++) {
			g.setDan(i);
			g.print();
			
		}

	}

}
