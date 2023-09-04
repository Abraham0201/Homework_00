package hw1;

public class Homework2 {
	public static void main(String[] args) {
//Q1
		System.out.println("Q1");
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("總和為"+sum);
		System.out.println("\nQ2");
//Q2
		int j = 1;
		for (int i = 1; i <= 10; i++) {
			j *= i;
		}
		System.out.println("1到10的連乘積為:" + j);
		System.out.println("\nQ3");
//Q3
		int k = 1, i = 1;
		while (i <= 10) {
			k *= i;
			i++;
		}
		System.out.println("1到10的連乘積為:" + k);
		System.out.println("\nQ4");
//Q4
		for (int a = 1; a <= 10; a++) {
			int square = a * a;
			System.out.print(square + " ");

		}
		System.out.println();
		System.out.println("\nQ5");
//Q5
		int sum1 = 0;
		for (int b = 1; b <= 49; b++) {
			if (b % 10 == 4) {
			} else if (b / 10 == 4) {
			} else {
				System.out.print(b + " ");
				sum1++;
			}
		}
		System.out.println();
		System.out.println("共有"+sum1+"個數字");
		System.out.println("\nQ6");
//Q6
		for (int c = 11; c >= 1; c--) {
			for (int d = 1; d < c; d++) {
				System.out.print(d + " ");
			}
			System.out.println();
		}
		System.out.println("Q7");
//Q7
		int n1, n2, n3;
		for (n1 = 0; n1 <= 5; n1++) {
			for (n2 = 0; n2 <= n1; n2++) {
				n3 = 65 + n1;
				char n4 = (char) n3;
				System.out.print(n4);
			}
			System.out.println();
		}
	}
}