package b14;

import java.util.Scanner;

public class cnksp extends congnhan {
	private int sosp;
	private float dongiasp;

	public cnksp(String name, String ngaysinh, String diachi, String loaicn, int sosp, float dongiasp) {
		super(name, ngaysinh, diachi, loaicn);
		this.sosp = sosp;
		this.dongiasp = dongiasp;
	}

	public int getSosp() {
		return sosp;
	}

	public void setSosp(int sosp) {
		this.sosp = sosp;
	}

	public float getDongiasp() {
		return dongiasp;
	}

	public void setDongiasp(float dongiasp) {
		this.dongiasp = dongiasp;
	}

	public void nhapthongtin() {
		super.nhapthongtin();
		Scanner sc = new Scanner(System.in);
		this.sosp = sc.nextInt();
		this.dongiasp = sc.nextFloat();
	}

	@Override
	public float tinhluong() {
		// TODO Auto-generated method stub
		int thuong = 0;
		if (sosp >= 1100 && sosp < 1150) {
			thuong = 1000000;
		} else if (sosp >= 1150) {
			thuong = 1500000;
		}
		return sosp * dongiasp + thuong;
	}

	public void inthongtin() {
		super.inthongtin();
	}

}
