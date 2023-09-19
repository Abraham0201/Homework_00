package hw4;

import java.util.Scanner;

import javax.print.attribute.standard.JobMessageFromOperator;

public class Q5 {
	public static void main(String[] arg) {
		System.out.println("請輸入西元年月日:");
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		int m = scanner.nextInt();
		int d = scanner.nextInt();
		int[] dofm = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (y < 0 || m < 1 || m > 12) {
			System.out.println("輸入格式錯誤");
		}
		if (y % 4 == 0) {
			dofm[1] = dofm[1] + 1;
		}
		if (d < 0 || d > dofm[m - 1]) {
			System.out.println("輸入格式錯誤");
		} else {
			int sum = 0;
			for (int i = 0; i < dofm.length; i++) {

				sum += dofm[i];
				if ((m - 1) == (i + 1)) {
					break;
				}
			}
			System.out.println("輸入的日期為該年第" + (sum + d) + "天");
		}
	}
}
