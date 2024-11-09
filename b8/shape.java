package b8;

public abstract class shape {
	private String color;

	protected abstract double getArea();

	public shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "shape [color=" + color + "]";
	}

}
