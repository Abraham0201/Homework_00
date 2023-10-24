package hw10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
	String regex="^\\d+$";
	Scanner sc = new Scanner(System.in);
	String input;
    double num2;
	while(true) {
		System.out.println("請輸入數字");
		String num1 = sc.next();
		if (num1.matches(regex)) {
			num2 = Double.parseDouble(num1);
			break;
		}else {
			System.out.println("數字格式不正確，請再輸入一次!");
			
		}
	}


	 System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號: ");
     input = sc.next();
     switch (input) {
         case "1" -> {
             Format formatter = new DecimalFormat("#,###,###,###,###.######");
             System.out.println(formatter.format(num2));
         }
         case "2" -> {
             Format formatter = new DecimalFormat("###.##%");
             System.out.println(formatter.format(num2));
         }
         case "3" -> {
             Format formatter = new DecimalFormat("0.###E00");
             System.out.println(formatter.format(num2));
         }
         default -> {
             System.out.println("沒有這個選項！");
         }
	
}


}}

