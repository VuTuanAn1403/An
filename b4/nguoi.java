package b4;

public class nguoi {

	private String ten;
	private int tuoi;
	private char gioitinh;

	public nguoi() {
		// TODO Auto-generated constructor stub
	}

	public nguoi(String ten, int tuoi, char gioitinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public char getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(char gioitinh) {
		this.gioitinh = gioitinh;
	}

	@Override
	public String toString() {
		return "nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + "]";
	}

}
