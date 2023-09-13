package hw3;

import java.util.Scanner;

public class Homework3Q3 {
	public static void main(String[] args) {

		System.out.println("阿文...請輸入你討厭哪個數字?");
		int i;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		for (i = 1; i <= 49; i++) {
			if (i % 10 == number) {
			} else if (i / 10 == number) {
			} else {
				System.out.print(i +" \t ");
				sum++;
				if(sum%6==0)
					System.out.println();
			}
		}
		
		System.out.print("總共有" + sum + "個數字可選");
	}
}