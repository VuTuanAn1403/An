package b8;

public class triangle extends shape {
	private int base, height;

	public triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return height * base / 2;
	}

	@Override
	public String toString() {
		return "triangle [base=" + base + ", height=" + height + ", getArea()=" + getArea() + ", toString()="
				+ super.toString() + "]";
	}

}
