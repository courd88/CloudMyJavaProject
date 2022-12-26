package traning;

public class GugudanExec {

	public static void main(String[] args) {
		Gugudan g = new Gugudan();
		g.setDan(2);
		g.print();
		
		Gugudan g2 = new Gugudan();
		g2.print();
		
		Gugudan g3 = new Gugudan(3);
		g3.print();
		
		for (int i = 2; i < 10; i ++) {
			g.setDan(i);
			g.print();
		}

	}

}
