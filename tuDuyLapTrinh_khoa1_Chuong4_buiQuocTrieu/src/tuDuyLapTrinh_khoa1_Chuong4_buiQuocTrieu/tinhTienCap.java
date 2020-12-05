package tuDuyLapTrinh_khoa1_Chuong4_buiQuocTrieu;

import java.util.Scanner;

public class tinhTienCap {

	static final float phiHoaDon_nhaDan = (float) 4.5;
	static final float phihoaDon_doanhNghiep = (float) 15;
	static final float phiDichVu_nhaDan = (float) 20.5;
	static final float phiDichVu_doanhNghiep_75 = (float) 75;
	static final float phiDichVu_doanhNghiep_5 = (float) 5;
	static final float phiKenhCaoCap_nhaDan = (float) 7.5;
	static final float phiKenhCaoCap_doanhNghiep = (float) 50;

	public static int nhapMaKhachHang(Scanner scan) {
		int maKhachHang;
		System.out.println("Nhap vao Ma Khach Hang");
		System.out.println("Ghi chu: nhap 1 cho khach hang nha dan va nhap 2 cho khach hang doanh nghiep");
		maKhachHang = Integer.parseInt(scan.nextLine());
		return maKhachHang;
	}

	public static int nhapSoTaiKhoan(Scanner scan) {
		int sotaiKhoan;
		System.out.println("Nhap vao so tai khoan");
		System.out.println("Ghi chu: nhap vao so tai khoan co 5 chu so");
		sotaiKhoan = Integer.parseInt(scan.nextLine());

		return sotaiKhoan;
	}

	public static int nhapSoKetNoi(Scanner scan) {
		int soKetNoi;
		System.out.println("Nhap so ket noi tai khoan doanh nghiep");

		soKetNoi = Integer.parseInt(scan.nextLine());

		if (soKetNoi < 0) {
			System.out.println("So ket noi vua nhap KHONG hop le!");
		}

		return soKetNoi;
	}

	public static float tinhTienCapNhaDan() {
		float tienCapNhaDan;

		tienCapNhaDan = phiHoaDon_nhaDan + phiDichVu_nhaDan + phiKenhCaoCap_nhaDan;

		return tienCapNhaDan;
	}

	public static float tinhTienCapDoanhNghiep(int soKetNoi) {
		float tienCapDoanhNgiep = 0;

		if (soKetNoi <= 10) {
			tienCapDoanhNgiep = phihoaDon_doanhNghiep + phiDichVu_doanhNghiep_75 * soKetNoi + phiKenhCaoCap_doanhNghiep;

		} else if (soKetNoi > 10) {
			tienCapDoanhNgiep = phihoaDon_doanhNghiep + phiKenhCaoCap_doanhNghiep + phiDichVu_doanhNghiep_75
					+ phiDichVu_doanhNghiep_5 * (soKetNoi - 10);
		}

		return tienCapDoanhNgiep;
	}

	public static float hamTinhTienCap (int maKhachHang, int soKetNoi) {
		float tienCap = 0;

		if (maKhachHang == 1) {
			tienCap = tinhTienCapNhaDan();
		} else if (maKhachHang == 2) {
			tienCap = tinhTienCapDoanhNghiep(soKetNoi);
		}

		return tienCap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int maKhachHang = nhapMaKhachHang(scan);
		int soTaiKhoan = nhapSoTaiKhoan(scan);
		int soKetNoi = 0;
		
		if (maKhachHang == 2) {
			soKetNoi = nhapSoKetNoi(scan);
		}

		float tienCap = hamTinhTienCap(maKhachHang, soKetNoi);

		System.out.println("So tai khoan khach hang: " + soTaiKhoan);
		System.out.println("Ma khach hang: " + maKhachHang);
		System.out.println("Tien cap phai thanh toan: " + tienCap + "USD");

	}
}

//1.tao bien co dinh
//phiHoaDon_nhaDan = 4.5;
//phihoaDon_doanhNghiep = 15;
//phiDichVu_nhaDan = 20.5;
//phiDichVu_doanhNghiep_75 = 75;
//phiDichVu_doanhNghiep_5 = 5;
//phiKenhCaoCap_nhaDan = 7.5;
//phiKenhCaoCap_doanhNghiep = 50;
//2. tao ham Input ma khach hang
//3. tao ham input so tai khoan
//4. tao ham tinh tien cap nha dan
//tienCapNhaDan = phiHoaDon_nhaDan + phiDichVu_nhaDan + phiKenhCaoCap_nhaDan
//5.tao ham input so ket noi
//6. tao ham tinh phi dich vu doanh nghiep
//if ( soKetNoi <+ 10 ) {phiDichVu = 75}
//else { phiDichVu = 75* 10 + (soKetNoi - 10 )* 5;
//
//
//7. tao ham tinh tien cap Doanh Nghiep
//tiencapDoanhNghiep = phiHoaDon + phiDichVuCoBan + phiThueCaoCap
//}
//
//8. tao ham phan loai khach hang
//if (makhachahng = 1) {
//	goi ham tinh tien cap nha dan
//} else if (makhachhang =2) {
//	goi ham tinh tien cap doanh nghiep
//}
//
//9. in ket qua ra man hinh