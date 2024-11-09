package b4;

public class benhnhan extends nguoi {
	benhvien bv;
	private String tiensu, chuandoan, benhvien;

	public benhnhan() {
		// TODO Auto-generated constructor stub
	}

	public benhnhan(String ten, int tuoi, char gioitinh) {
		super(ten, tuoi, gioitinh);
		// TODO Auto-generated constructor stub
	}

	public benhnhan(String tiensu, String chuandoan, String benhvien) {
		this.tiensu = tiensu;
		this.chuandoan = chuandoan;
		this.benhvien = benhvien;
	}

	public String getTiensu() {
		return tiensu;
	}

	public void setTiensu(String tiensu) {
		this.tiensu = tiensu;
	}

	public String getChuandoan() {
		return chuandoan;
	}

	public void setChuandoan(String chuandoan) {
		this.chuandoan = chuandoan;
	}

	public String getBenhvien() {
		return benhvien;
	}

	public void setBenhvien(String benhvien) {
		this.benhvien = benhvien;
	}

	@Override
	public String toString() {
		return "benhnhan [bv=" + bv + ", tiensu=" + tiensu + ", chuandoan=" + chuandoan + ", benhvien=" + benhvien
				+ "]";
	}

}
