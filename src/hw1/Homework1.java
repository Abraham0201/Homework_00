package hw1;

public class Homework1 {

	public static void main(String[] args) {

//Q1
		System.out.println("Q1");
		int a = 12;
		int b = 6;
		System.out.println("積:" + a * b);
		System.out.println("和:" + (a + b));
		System.out.println("\nQ2");
//Q2
		int egg = 200;
		int dozen = 12;
		System.out.println(egg / dozen + "打");
		System.out.println(egg % dozen + "顆");
		System.out.println("\nQ3");
//Q3
		int totalSeconds = 256559;
		int days = totalSeconds / (24 * 60 * 60);
		int seconds1 = totalSeconds % (24 * 60 * 60);
		int hours = seconds1 / (60 * 60);
		seconds1 = seconds1 % (60 * 60);
		int minutes = seconds1 / 60;
		int seconds = seconds1 % 60;
		System.out.println("Days:" + days);
		System.out.println("Hours:" + hours);
		System.out.println("Minutes:" + minutes);
		System.out.println("Seconds:" + seconds);
		System.out.println("\nQ4");
//Q4
		double PI = 3.1415;
		System.out.printf("圓面積:%.2f%n", PI * 5 * 5);
		System.out.printf("圓周長:%.2f%n", 2 * PI * 5);
		System.out.println("\nQ5");
//Q5
		int P = 1500000;
		float r = 0.02f;
		int t = 10;
		System.out.printf("本金加利息:%.0f%n", P * Math.pow(1 + r, t));
		System.out.println("\nQ6");
//Q6
		System.out.println(5 + 5);
		System.out.println(5 + '5'); // '5'以字元表示，對應的ASCII值是53，因此5+53=58
		System.out.println(5 + "5"); // "5"以字串表示，因此直接將兩個字符串接在一起為55

	}
}