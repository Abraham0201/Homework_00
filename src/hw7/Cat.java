package hw7;

import java.io.Serializable;

public class Cat extends Animals implements Serializable {

	private static final long serialVersionUID = 2857156072417228367L;
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	@Override

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
}
