package hw3;

import java.util.Scanner;

public class Homework3Q1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int s1 = scanner.nextInt();
		int s2 = scanner.nextInt();
		int s3 = scanner.nextInt();

		if ((s1 == s2) && (s1 == s3)) {
			System.out.println("這是一個正三角形");
		} else if ((s1 == s2) || (s2 == s3) || (s1 == s3)) {
			System.out.println("這是一個等腰三角形");
		} else if ((s1 == 0) && (s2 == 0) && (s3 == 0)) {
			System.out.println("這不是三角形");
		} else {
			System.out.println("這是其他三角形");
		}

	}
}
