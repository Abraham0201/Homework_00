package hw10;

public class Q1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int num = (int) (Math.random() * 100) + 1;
			prime.prime(num);
		}
	}

	class prime {
		public static void prime(int num) {
			int factor = 0;
			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					factor = factor + 1;
				}
			}
			if (factor == 2) {
				System.out.println(num + "是質數");
			} else {
				System.out.println(num + "不是質數");
			}
		}
	}
}
