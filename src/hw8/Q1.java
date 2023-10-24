package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();

		arr.add(new Integer(100));
		arr.add(new Double(3.14));
		arr.add(new Long(21L));
		arr.add(new Short("100"));
		arr.add(new Double(5.1));
		arr.add("Kitty");
		arr.add(new Integer(100));
		arr.add(new Object());
		arr.add("Snoopy");
		arr.add(new BigInteger("1000"));

		Iterator objs = arr.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());
		System.out.println();

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println();

		for (Object obj : arr)
			System.out.println(obj);
		System.out.println();
		
		Iterator objs1 = arr.iterator();
		while(objs1.hasNext()) {
//		for (Iterator it = arr.iterator(); it.hasNext();) {
			if (!(objs1.next() instanceof Number)) { //false就移除
				objs1.remove();
			}
		}
		for (Object obj : arr) {
			System.out.println(obj);
		}
	}
}