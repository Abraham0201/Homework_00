package hw9;

import org.w3c.dom.css.Counter;

public class Q1 implements Runnable {
	int counter = 1;
	String name;

	public Q1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		while (counter <= 10) {
			System.out.println(name + "吃第" + counter + "碗飯");
			if (counter == 10) {
				System.out.println(name + "吃完了!");
			}
			try {
				Thread.sleep((int) (Math.random() * 2501 + 500));
			} catch (Exception e) {
				// TODO: handle exception
			}
			counter++;
		}

	}

	public static void main(String[] args) {

		Q1 q1 = new Q1("饅頭人");
		Thread t1 = new Thread(q1);
		Q1 q2 = new Q1("詹姆士");
		Thread t2 = new Thread(q2);
		System.out.println("-----大胃王快食比賽開始!-----");

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("-----大胃王快食比賽結束!-----");

	}

}
