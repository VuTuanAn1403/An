package b14;

import java.util.Scanner;

public class cntcn extends congnhan {
	private float luongcb, hsluong;
	private int songay;

	public cntcn(String name, String ngaysinh, String diachi, String loaicn, float luongcb, float hsluong, int songay) {
		super(name, ngaysinh, diachi, loaicn);
		this.luongcb = luongcb;
		this.hsluong = hsluong;
		this.songay = songay;
	}

	public void nhapthongtin() {
		super.nhapthongtin();
		Scanner sc = new Scanner(System.in);
		this.luongcb = sc.nextFloat();
		this.hsluong = sc.nextFloat();
		this.songay = sc.nextInt();
	}

	@Override
	public float tinhluong() {
		// TODO Auto-generated method stub
		float thuong = 0;
		if (songay >= 20)
			thuong = (float) (1.2 * luongcb);

		return luongcb * hsluong + thuong;
	}

	public void inthongtin() {
		super.inthongtin();
	}
}
