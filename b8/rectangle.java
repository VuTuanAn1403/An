package b8;

public class rectangle extends shape {
	private int length, width;

	public rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public String toString() {
		return "rectangle [length=" + length + ", width=" + width + ", toString()=" + super.toString() + "dien tich"
				+ getArea() + "]";
	}

}
