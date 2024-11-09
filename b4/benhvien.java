package b4;

public class benhvien {
	private String ten, diachi, giamdoc;

	public benhvien() {
		// TODO Auto-generated constructor stub
	}

	public benhvien(String ten, String diachi, String giamdoc) {
		this.ten = ten;
		this.diachi = diachi;
		this.giamdoc = giamdoc;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiachi() {
		return diachi;
	}

	@Override
	public String toString() {
		return "benhvien [ten=" + ten + ", diachi=" + diachi + ", giamdoc=" + giamdoc + "]";
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getGiamdoc() {
		return giamdoc;
	}

	public void setGiamdoc(String giamdoc) {
		this.giamdoc = giamdoc;
	}

}
