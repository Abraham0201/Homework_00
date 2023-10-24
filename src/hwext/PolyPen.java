package hwext;

public class PolyPen {
	public static void main(String[] args) {
		Pen[] p = new Pen[2];

		p[0] = new Pencil("SKB", 20);
		p[1] = new InkBrush("Pentel", 50);

		for (int i = 0; i < p.length; i++) {
			p[i].write();
			System.out.println("價格是：" + p[i].getPrice());
		}

	}
}
