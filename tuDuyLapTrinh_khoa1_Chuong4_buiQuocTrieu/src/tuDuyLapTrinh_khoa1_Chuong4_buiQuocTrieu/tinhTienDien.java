package tuDuyLapTrinh_khoa1_Chuong4_buiQuocTrieu;

import java.util.Scanner;

public class tinhTienDien {
	
	static final int tienDien500 = 500;
	static final int tienDien650 = 650;
	static final int tienDien850 = 850;
	static final int tienDien1100 = 1100;
	static final int tienDien1300 = 1300;
	
	static final int kw50 = 50;
	static final int kw100 = 100;
	static final int kw200 = 200;
	static final int kw350 = 350;
	
// Ham nhap ten nguoi dung
	public static String nhapHoTen(Scanner scan) {
		String hoTen;
		System.out.println("Nhap vao ho va ten:");
		hoTen = scan.nextLine();

		return hoTen;
	}
//Ham nhap soKW
	public static float nhapSoKw(Scanner scan) {
		float soKw;
		System.out.println("Nhap vao so Kw tieu thu");
		System.out.println("Ghi chu: * don vi tinh 1 kW");
		soKw = Float.parseFloat(scan.nextLine());

		return soKw;
	}

//Ham tinh tien dien
	public static float  tinhTienDien (float soKw) {
		float tienDien;
		if (soKw <= kw50 ) {
			tienDien = soKw * tienDien500;			
		} else if (soKw <= kw100 && soKw > kw50 ) {
			tienDien = 50 * tienDien500 + ((soKw-kw50) * tienDien650);			
		} else if (soKw <= kw200 && soKw > kw100 ) {
			tienDien = 50 * tienDien500 + 50 * tienDien650 + (soKw-kw100) * tienDien850;			
		}else if (soKw <= kw350 && soKw > kw200 ){
			tienDien = 50 * tienDien500 + 50 * tienDien650 + 100 * tienDien850 + (soKw-kw200) * tienDien1100;			
		} else {
			tienDien = 50 * tienDien500 + 50 * tienDien650 + 100 * tienDien850 + 150 * tienDien1100 + (soKw-kw350) * tienDien1300;			
		}
		
		return tienDien;
		
	}
	
// 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//tao static variable
//1.nhap vao ho ten nguoi su dung
//2. nhap vao so KW
//3. ham tinh tien dien
//4. in so tien phai thanh toan
		
		Scanner scan = new Scanner(System.in);

		String hoTen = nhapHoTen(scan);
		float soKw = nhapSoKw(scan);
		
		float tienDien = tinhTienDien(soKw);
				
				
	
		System.out.println("tien dien phai dong cua " + hoTen + " la " + tienDien);
	}

}
