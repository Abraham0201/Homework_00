package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Q4 {
	public static void main(String[] args) {
		File file = new File("C:/data", "Object.ser");
		Q4 q4 = new Q4();
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdir();
		}
		Animals[] a = { new Cat("暹羅"), new Cat("短毛"), new Dog("吉娃娃"), new Dog("柯基") };
		q4.writeIntoFile(file, a);
	}

	public void writeIntoFile(File file, Animals[] a) {
		try (FileOutputStream fr = new FileOutputStream(file);) {// 讀取輸出流
			ObjectOutputStream oup = new ObjectOutputStream(fr);// 物件的輸出流包覆FileOutputStream,Object(物件寫出)只有output/input有這個方法
			for (Animals animal : a) {
				oup.writeObject(animal);
			}
			System.out.println("Objects written to file successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readObjectFromFile(File file) throws ClassNotFoundException {

		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			while (true) {
				((Animals) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
