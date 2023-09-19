package hw4;

public class Q1 {

	public static void main(String[] args) {
		int[] a = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double average = sum / a.length;
		System.out.println("平均值為:" + average);
		for (int j = 0; j < a.length; j++) {
			if (a[j] > average) {
				System.out.println(a[j]);
			}
		}
	}
}
