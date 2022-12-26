package mypack;

public class GugudanExec {

	public static void main(String[] args) {
		// Gugudan 인스턴스를 생성
				Gugudan g = new Gugudan();
				// g.dan = 2;	// <= 객체의 필드 값을 직접 수정하는 것은 올바른 방법이 아님
				g.setDan(2);
				g.print();
				
				Gugudan g2 = new Gugudan();		// Gugudan() 생성자를 호출
				g2.print();
				
				Gugudan g3 = new Gugudan(3);	// Gugudan(int dan) 생성자를 호출
				g3.print();
				
				for (int i = 2; i < 10; i ++) {
					g.setDan(i);
					g.print();
				}

			}

		}
