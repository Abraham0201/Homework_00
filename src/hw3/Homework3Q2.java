package hw3;

import java.util.Scanner;

public class Homework3Q2 {

	public static void main(String[] args) {
		int number;
		number = (int) (Math.random() * 10);

		Scanner scanner = new Scanner(System.in);

		while (true) {
			int guess = scanner.nextInt();

			if (guess == number) {
				System.out.println("答對了!答案就是" + number);
			} else {
				System.out.println("猜錯囉");
			}

		}
	}
}