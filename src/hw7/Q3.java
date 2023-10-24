package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q3 {
	public static void copyFile(File inputFile, File outputFile) {
		try {
			FileReader in = new FileReader(inputFile);
			FileWriter out = new FileWriter(outputFile);

			int num;
			while ((num = in.read()) != -1) {
				out.write(num);
			}
			in.close();
			out.close();
		} catch (Exception e) {

		}
	}
}