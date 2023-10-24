package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//scanner，不用get set方法
		System.out.println("請輸入x的值:");
		System.out.println("請輸入y的值:");

		try {
			int x = scanner.nextInt();//寫在try裡面，不然InputMismatchException會catch不到
			int y = scanner.nextInt();
			Calculator c = new Calculator(x, y);//參數(x,y)代表Calculator建構子13行的x,y
			System.out.println(x + "的" + y + "次方等於" + c.powerXY(x, y));
		} catch (CalException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("輸入格式不正確");
		}
	}
}
