package mypack;

public class Gugudan {
	// 필드는 외부에서 직접 접근할 수 없도록 private 제한
		private int dan;
		
		Gugudan() {
			this.dan = 2;
		}
		
		Gugudan(int dan) {
			this.dan = dan;
		}
		
		// dan 필드의 값을 변경할 수 있는 메서드
		void setDan(int dan) {
			this.dan = dan;
		}
		
		void print() {
			System.out.println("\n==========");
			System.out.printf("%d단\n", this.dan);
			System.out.println("==========");
			for (int i = 1; i < 10; i ++) {
				System.out.printf("%d * %d = %2d \n", dan, i, dan * i);
			}
		}
	}
