package hw4;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		int[][] cocash = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		Scanner scanner = new Scanner(System.in);
		int s1 = scanner.nextInt();
		int sum = 0;
		System.out.print("有錢可借的員工編號:");
		for (int i = 0; i < cocash.length; i++) {
			if (s1 < cocash[i][1]) {
				System.out.print(cocash[i][0] + " ");
				sum++;

			}
		}
		System.out.print("共" + sum + "人!");

	}
}
