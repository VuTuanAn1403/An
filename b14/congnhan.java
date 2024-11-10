package b14;

import java.util.Scanner;

public abstract class congnhan {
	private String name, ngaysinh, diachi, loaicn;

	public void nhapthongtin() {
		Scanner sc = new Scanner(System.in);
		this.name = sc.nextLine();
		this.ngaysinh = sc.nextLine();
		this.diachi = sc.nextLine();
		this.loaicn = sc.nextLine();
	}

	public congnhan(String name, String ngaysinh, String diachi, String loaicn) {
		this.name = name;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.loaicn = loaicn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getLoaicn() {
		return loaicn;
	}

	public void setLoaicn(String loaicn) {
		this.loaicn = loaicn;
	}

	public abstract float tinhluong();

	public void inthongtin() {
		System.out.println(name);
		System.out.println(diachi);
		System.out.println(ngaysinh);
		System.out.println(loaicn);
		System.out.println(tinhluong());
	}

}
