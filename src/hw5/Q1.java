package hw5;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] arg) {
		int width;
		int height;
		Scanner scanner = new Scanner(System.in);

		System.out.println("請輸入寬與高:");
		width = scanner.nextInt();
		height = scanner.nextInt();
		Q1 h = new Q1();
		h.starSquare(width, height);
	}                                                  
	public void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
