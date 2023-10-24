package hw7;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Q2 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int r;
		try {
			FileOutputStream fos = new FileOutputStream("Data.txt", true);//append
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			for (int i = 0; i <10; i++) {
				r = (int) (Math.random() * 1000) + 1;
				num[i] = r;
				bos.write(String.valueOf (num[i]+"\t").getBytes());								
			}
			bos.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
