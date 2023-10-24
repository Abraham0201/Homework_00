package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q1 {
	public static void main(String[] args) {
		String str;
		int count = 0, count1 = 0;
		File f1 = new File("C:/Sample.txt");
		long a = (f1.length());
		try {
			FileReader fr = new FileReader("C:/Sample.txt");
			FileReader fr1 = new FileReader("C:/Sample.txt");
			BufferedReader br = new BufferedReader(fr1);
			
			while ((fr.read()) != -1) {// 字元
				count++;
			}
			while ((str =br.readLine()) != null) {// 行數
				if (str.length() > 0) {
					count1++;
				}
			}
			System.out.println("Sample.txt檔案共有" + a + "個位元組，" + count + "個字元，" + count1 + "列資料");
			br.close();
			fr.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
