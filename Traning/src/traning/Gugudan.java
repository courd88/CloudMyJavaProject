package traning;


public class Gugudan {
	private int dan;
	Gugudan() {
		this.dan = 2;
	
	}
	
	Gugudan(int dan) {
		this.dan = dan;

	} 
	void print() {
		System.out.println("\n--------");
		System.out.printf("%d단\n", this.dan);
		System.out.println("-----------");
		for (int i = 1; i < 10; i ++) {
			System.out.printf("%d * %d = %2d \n", dan, i, dan * i);
		}
	}

	public void setDan(int i) {
		// TODO Auto-generated method stub
		
	}

}