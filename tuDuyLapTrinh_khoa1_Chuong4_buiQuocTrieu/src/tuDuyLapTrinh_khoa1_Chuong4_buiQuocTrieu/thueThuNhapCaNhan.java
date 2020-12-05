package tuDuyLapTrinh_khoa1_Chuong4_buiQuocTrieu;

import java.util.Scanner;

public class thueThuNhapCaNhan {
	static final float thue5 =(float) 0.05;
	static final float thue10 = (float) 0.1;
	static final float thue15 = (float) 0.15;
	static final float thue20 = (float) 0.2;
	static final float thue25 = (float) 0.25;
	static final float thue30 =  (float) 0.30;
	static final float thue35 = (float) 0.35;

	static final int thuNhap60 = 60000000;
	static final int thuNhap120 = 120000000;
	static final int thuNhap216 = 216000000;
	static final int thuNhap210 = 210000000;
	static final int thuNhap384 = 384000000;
	static final int thuNhap624 = 624000000;
	static final int thuNhap960 = 960000000;

// Ham Input	
	public static String nhapHoTen(Scanner scan) {
		String hoTen;
		System.out.println("Nhap vao ho va ten:");
		hoTen = scan.nextLine();

		return hoTen;
	}

	public static float nhapThuNhapNam(Scanner scan) {
		float thuNhapNam;
		System.out.println("Nhap vao thu nhap nam:");
		System.out.println("Ghi chu: * don vi tinh 1 VND");
		thuNhapNam = Float.parseFloat(scan.nextLine());

		return thuNhapNam;
	}

	public static int nhapSoNguoiPhuThuoc(Scanner Scan) {
		int nguoiPhuThuoc;
		System.out.println("Nhap vao so nguoi phu thuoc");
		nguoiPhuThuoc = Integer.parseInt(Scan.nextLine());
		return nguoiPhuThuoc;
	}
//Ham Tinh Toan

	public static float tinhThuNhapChiuThue(float thuNhapNam, int nguoiPhuThuoc) {
		float thuNhapChiuThue;

		thuNhapChiuThue = (float) (thuNhapNam - 4000000 - (nguoiPhuThuoc * 1600000));
		return thuNhapChiuThue;
	}

	public static float tinhThueCaNhan(float thuNhapChiuThue) {
		float thueCaNhan;

		if (thuNhapChiuThue <= thuNhap60) {
			thueCaNhan = thuNhapChiuThue * thue5;
		} else if (thuNhapChiuThue > thuNhap60 && thuNhapChiuThue <= thuNhap120) {
			thueCaNhan = thuNhapChiuThue * thue10;
		} else if (thuNhapChiuThue > thuNhap120 && thuNhapChiuThue <= thuNhap216) {
			thueCaNhan = thuNhapChiuThue * thue15;
		} else if (thuNhapChiuThue > thuNhap216 && thuNhapChiuThue <= thuNhap384) {
			thueCaNhan = thuNhapChiuThue * thue20;
		} else if (thuNhapChiuThue > thuNhap384 && thuNhapChiuThue <= thuNhap624) {
			thueCaNhan = thuNhapChiuThue * thue25;
		} else if (thuNhapChiuThue > thuNhap624 && thuNhapChiuThue <= thuNhap960) {
			thueCaNhan = thuNhapChiuThue * thue30;
		} else {
			thueCaNhan = thuNhapChiuThue * thue35;
		}

		return thueCaNhan;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String hoTen = nhapHoTen(scan);
		float thuNhapNam = nhapThuNhapNam(scan);
		int soNguoiPhuThuoc = nhapSoNguoiPhuThuoc(scan);
		float thuNhapChiuThue = tinhThuNhapChiuThue(thuNhapNam, soNguoiPhuThuoc);
		String thueCaNhan = String.format("%f", tinhThueCaNhan(thuNhapChiuThue));

		System.out.println("Thue ca nhan cua " + hoTen + " phai dong: " + thueCaNhan);

//1. Tao bien co dinh thuNhap60, thuNhap120,thuNhap216, thuNhap210, thuNhap384, thuNhap624,thuNhap960
//2. Ham input hoten
//3. Ham input thu nhap nam
//4. ham input so nguoi phu thuoc
//5. Tinh thuNhapChiuThue = ThuNhapNam - 4 - so nguoi phu thuoc *1.6
//6.Tao bien co dinh thu5= 5%; thue10, thue15, thue20, thue25, thue30, thue35
//7. hanh Tinh ThueCaNhan phai dong = thu nhap chiu thue * thue
//		8. In ra man hinh thue ca nhan phai dong
	}

}
