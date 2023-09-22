package hw5;//overloading

public class Q3 {
	                    /*方法名稱*/  /*參數*/
	public int maxElement(int[][]  x) {
		
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			max = x[i][0];
			for (int j = 1; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}

		}
		return max; /*回傳值型別*，所以int max要寫在迴圈外，不然抓不到型別*/
	}

	public double maxElement(double x[][]) {
		
		double max = 0;
		for (int i = 0; i < x.length; i++) {
			max = x[i][0];
			for (int j = 1; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}

		}
		return max;
	}
	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		Q3 h3 = new Q3();//定義物件接住回傳值。如果上面類別用static方法，可以直接使用，不用定義物件
		System.out.println(h3.maxElement(intArray));//用"."呼叫其他類別的方法 
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		System.out.println(h3.maxElement(doubleArray));//也可以定義變數接住他，再sysout，p.47範例
	}
}