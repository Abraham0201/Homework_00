package hw5;

public class Q2 {
	public static void main(String[] args) {
		System.out.println("本次亂數結果:");
		Q2 h2 = new Q2();
		h2.randAvg();

	}
	public void randAvg() {
		int sum = 0;
		for (int j = 0; j < 10; j++) {
		int i =	(int)( Math.random() * 101) ;
			sum += i;
			System.out.print(i +"\t");
		}
		System.out.println();
		System.out.println(sum / 10);
	}

}
