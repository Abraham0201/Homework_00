package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		//solution1
		MyRectangle s1 = new MyRectangle();//呼應MyRectangle 20行
		s1.setWidth(10);
		s1.setDepth(20);
		System.out.println(s1.getArea());

		System.out.println("=========");
        //solution2
		MyRectangle s2 = new MyRectangle(10, 20);//main方法執行到這行，new建立物件之後接著呼叫建構子
		//，回MyRectangle執行24行，this指的會是s2
		System.out.println(s2.getArea());
	}
}
