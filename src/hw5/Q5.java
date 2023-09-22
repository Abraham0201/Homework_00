package hw5;

public class Q5 {
	public void genAuthCode() {
		int[] code = new int[8];
		int r;
		for (int i = 0; i < code.length; i++) {
			while (true) {
				r = (int) (Math.random() * 75) + 48;//產生48~122的亂數
				if ((47 < r && r < 58) || (64 < r && r < 91) || (96 < r && r < 123)) {
					code[i] = r;
					System.out.print((char) code[i]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為：");
		Q5 h5 = new Q5();
		h5.genAuthCode();
	}
}
