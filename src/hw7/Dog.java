package hw7;

import java.io.Serializable;

public class Dog extends Animals implements Serializable {

	private static final long serialVersionUID = -4389793696694146488L;
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
