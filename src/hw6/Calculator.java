package hw6;

import java.util.Scanner;

public class Calculator {
	private int x;
	private int y;

	public Calculator() {

	}

	public Calculator(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			this.x = x;
			this.y = y;
			throw new CalException("0的0次方沒有意義!");
		} else if (y < 0)
			throw new CalException("次方為負值，結果回傳不為整數!");
	}

	public int powerXY(int x, int y) {
		return (int) (Math.pow(x, y));
	}
}
