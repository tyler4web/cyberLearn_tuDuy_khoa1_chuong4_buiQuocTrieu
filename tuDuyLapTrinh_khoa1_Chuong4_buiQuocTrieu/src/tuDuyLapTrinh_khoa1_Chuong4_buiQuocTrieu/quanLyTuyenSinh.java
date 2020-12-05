package tuDuyLapTrinh_khoa1_Chuong4_buiQuocTrieu;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;
//Tao Static variable

public class quanLyTuyenSinh {
	static final float KHUVUC_A = 2;
	static final float KHUVUC_B = 1;
	static final float KHUVUC_C = (float) 0.5;
	static final float KHUVUC_X = 0;

	static final float DOITUONG_1 = (float) 2.5;
	static final float DOITUONG_2 = (float) 1.5;
	static final float DOITUONG_3 = 1;

//Tao ham input nhap
	public static float nhapDiemToan(Scanner scan) {
		float diemToan;

		System.out.println("Nhap vao diem Toan:");
		diemToan = Float.parseFloat(scan.nextLine());

		return diemToan;
	}

	public static float nhapDiemVan(Scanner scan) {
		float diemVan;
		System.out.println("Nhap vao diem Van:");

		diemVan = Float.parseFloat(scan.nextLine());
		return diemVan;
	}

	public static float nhapDiemAnh(Scanner scan) {

		float diemAnh;

		System.out.println("Nhap vao diem Anh:");
		diemAnh = Float.parseFloat(scan.nextLine());

		return diemAnh;
	}

	public static String nhapKhuVuc(Scanner scan) {
		String khuVuc;

		System.out.println("Nhap Khu Vuc:");
		System.out.println("**Ghi Chu: Nhap A,B,C cho cac khu vuc A,B,C tuong ung. Nhap X neu khong thuoc khu vuc uu tien!");
		khuVuc = scan.nextLine();
		return khuVuc;
	}

	public static float nhapDoiTuong(Scanner scan) {
		int doiTuong;
		System.out.println("Nhap Doi Tuong:");
		System.out.println("**Ghi Chu: Nhap 1,2,3 cho cac doi tuong 1,2,3 tuong ung. Nhap 0 neu khong thuoc khu vuc uu tien!");
		doiTuong = Integer.parseInt(scan.nextLine());
		return doiTuong;
	}

	public static float nhapDiemChuanHoiDong(Scanner scan) {

		float diemChuanHoiDong;

		System.out.println("Nhap vao diem chuan hoi dong:");
		diemChuanHoiDong = Float.parseFloat(scan.nextLine());

		return diemChuanHoiDong;
	}

	// tao ham tinh toan

	public static float tinhDiemKhuVuc(String khuVuc) {
		float diemKhuVuc = 0;

		if (khuVuc.equals("A") || khuVuc.equals("a")) {
			diemKhuVuc = 2;
		} else if (khuVuc.equals("B") || khuVuc.equals("b")) {
			diemKhuVuc = 1;
		} else if (khuVuc.equals("C") || khuVuc.equals("c")) {
			diemKhuVuc = (float) 0.5;
		}else if (khuVuc.equals("X") || khuVuc.equals("x")) {
			diemKhuVuc = 0;
		} else {
			System.out.println("Input Khu Vuc khong hop le");
		}

		return diemKhuVuc;
	}
	
	public static float tinhDiemDoiTuong (int doiTuong) {
		float diemDoiTuong = 0;
		
		if (doiTuong == 1) {
			diemDoiTuong = (float) 2.5;
		} else if (doiTuong == 2) {
			diemDoiTuong = (float) 1.5;
		} else if (doiTuong == 3) {
			diemDoiTuong = 1;
		} 
		
		return diemDoiTuong;
	}
	
	public static float tinhDiemUuTien (float diemDoiTuong, float diemKhuVuc) {
		float diemUuTien;
		
		diemUuTien = diemDoiTuong + diemKhuVuc;
		
		return diemUuTien;
		
	}
	
	public static float tinhDiemTongKet (float diemUuTien, float diemToan, float diemVan, float diemAnh) {
		
		float diemTongKet;
		
		diemTongKet = diemToan + diemVan + diemAnh + diemUuTien;
		System.out.println("Diem tong ket cua thi sinh: " + diemTongKet);
		return diemTongKet;
	}
	
//Ham in ket qua
//	public static void inDiemTongKet (float diemTongKet) {
//		System.out.println("Diem tong ket cua thi sinh: " + diemTongKet);
//	}
	
	public static void inDauRot (float diemTongKet, float diemChuanHoiDong) {
		if (diemTongKet >= diemChuanHoiDong) {
			System.out.println("Chuc mung ban da dau dai hoc!");
		}else {
		System.out.println("Ket qua cua ban KHONG dat yeu cau! ");}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. tao bien diemTongKet, diemChuan, diemToan, diemVan, diemAnh, diemUuTien
//2. Tao ham nhap diem 3 mon thi
//3. tao ham nhap khu vuc
//4. tao ham nhap doi tuong du thi
//5. tao ham nhap diem chuan hoi dong
//6. Tao ham tinh diem khu vuc
//If (A) {diemkhu vuc = 2)
//}
//		6. Tao Ham tinh diem doi tuong
//		If (1) {2.5)
//6. tao ham tinh diem uu tien
//		diem uu tien = diem khu vuc + diem doi tuong
//7. tao ham tinh diem Tong Ket
//				diem tong ket  = diemToan + diemVan + diemAnh + diemUuTien
//8. tao ham in tong so dat duoc

//9. tao ham in ket qua dau rot

		Scanner scan = new Scanner(System.in);
		float diemToan = nhapDiemToan(scan);
		float diemVan = nhapDiemVan(scan);
		float diemAnh = nhapDiemAnh(scan);
		
		String khuVuc = nhapKhuVuc(scan);
		int doiTuong = (int) nhapDoiTuong(scan);
		float diemChuanHoiDong = nhapDiemChuanHoiDong(scan);
		
		float diemDoiTuong = tinhDiemDoiTuong(doiTuong);
		float diemKhuVuc = tinhDiemKhuVuc(khuVuc);
		float diemUuTien = tinhDiemUuTien(diemDoiTuong, diemKhuVuc);
		
		float diemTongKet = tinhDiemTongKet(diemUuTien, diemToan, diemVan, diemAnh);
		
//		inDiemTongKet(diemTongKet);
		inDauRot(diemTongKet, diemChuanHoiDong);
		

	}

}
