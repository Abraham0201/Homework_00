package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q5 {
	
	public static void main(String[] args) {
		Q5 q5 = new Q5();
		File file = new File("C:\\data", "Object.ser");

		q5.readObjectFromFile(file);
	}

	public void readObjectFromFile(File file) {

		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

//			while (animals.size() < 4) {
//				// 加入讀取到的物件(強轉Animal)
//				animals.add((Animal) ois.readObject());
//			}
			// 遍歷animals，並調用各自的speak()
//			for (Animal animal : animals) {
//				animal.speak();
//			}
		  int num;
		  while((num=ois.read())!=-1) {
			  System.out.println((char)num);
		  }
		  ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}