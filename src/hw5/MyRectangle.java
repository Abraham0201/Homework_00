package hw5;

public class MyRectangle {
	private double width;// 實體變數
	private double depth;

	public void setWidth(double width) {
		this.width = width;// this. 區別實體變數跟區域變數
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getArea() {
		return (width * depth);
	}
//========================

	public MyRectangle() {

	}// 建構子

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
