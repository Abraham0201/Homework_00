package hw4;

import java.security.PublicKey;

public class Q3 {
	public static void main(String[] args) {
		String planet[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };//1
		int a = 0;//4 接回sum
		for (int j = 0; j < planet.length; j++) {
			char[] charArray = planet[j].toCharArray();//2
			a += arrayaeiou(charArray);

		}
		System.out.println(a);
	}

	public static int arrayaeiou(char[] chars) {//3
		int sum = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
				sum++;
			}

		}
		return sum;

	}
}
