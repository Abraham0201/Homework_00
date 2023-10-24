package hwext;

public class Pencil extends Pen {
	public Pencil() {

	}

	public Pencil(String brand, int price) {
		super(brand, price);
	}

	@Override //呼叫super方法覆寫price
	public double getPrice() {
		return super.getPrice() * 0.8;
	}

	@Override //延續覆寫abstract
	public void write() {
		System.out.println("削鉛筆再寫");
	}

}
