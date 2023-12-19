package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);

		System.out.println("cạnh a: ");
		a = sc.nextInt();

		System.out.println("cạnh b: ");
		b = sc.nextInt();

		System.out.println("cạnh c: ");
		c = sc.nextInt();
		/**
		 * bài tập 1
		 */
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.println("-là ba cạnh của hình tam giác");
		} else {
			System.out.println("-không phải ba cạnh của hình tam giác");
		}
		/**
		 * bài tập 2
		 */
		double cv = a + b + c; // chu vi
		System.out.println("-Chu vi của hình tam giác là: " + cv);

		double p = cv / 2; // bán chu vi

		double S = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // diện tích
		System.out.println("-diện tích hình tam giác: " + S);
		System.out.println("/n");
		/**
		 * bài tập 3
		 */
		System.out.println("   ĐIỂM TRUNG BÌNH CỦA SINH VIÊN   ");

		System.out.println("-nhập điểm tb của sv: ");
		double d = sc.nextInt();
		if (d >= 8) {
			System.out.println("+loại giỏi");
		} else if (d >= 6.5) {
			System.out.println("+loại khá");
		} else if ((d >= 0) && (d <= 10)) {
			System.out.println("+loại trung bình");
		}

		/**
		 * bài tập 5
		 */
		System.out.println(" ");
		System.out.println("Tính số tiền điện phải trả trong một tháng");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("nhập số điện: ");
		double q = sc.nextInt();
		double x = 1800, y = 2500, z = 3000;
		double tong = 0;
		if ((q >= 1) && (q < 100)) {
			tong = q * x;
		} else if ((q >= 100) && (q < 200)) {
			tong = q * y;
		} else if (q >= 200) {
			tong = q * z;
		}
		System.out.println("giá tiền phải trả là: " + tong);
		System.out.println(" ");
		/**
		 * bài tập 4
		 */
		System.out.println("   NHẬP VÀO 4 SỐ NGUYÊN   ");
		System.out.println("-Nhập số thứ nhất: ");
		int aa = sc.nextInt();

		System.out.println("-Nhập số thứ hai: ");
		int bb = sc.nextInt();

		System.out.println("-Nhập số thứ ba: ");
		int cc = sc.nextInt();

		System.out.println("-Nhập số thứ tư: ");
		int dd = sc.nextInt();

		int[] ketQua = demSoChanLe(aa, bb, cc, dd);

		System.out.println("+số chẵn " + ketQua[0]);
		System.out.println("+số lẽ " + ketQua[1]);
	}

	public static int[] demSoChanLe(int aa, int bb, int cc, int dd) {
		int sochan = 0;
		int sole = 0;

		if (aa % 2 == 0) {
			sochan++;
		} else {
			sole++;
		}

		if (bb % 2 == 0) {
			sochan++;
		} else {
			sole++;

		}
		if (cc % 2 == 0) {
			sochan++;
		} else {
			sole++;
		}

		if (dd % 2 == 0) {
			sochan++;
		} else {
			sole++;
		}

		int[] ketQua = new int[2];
		ketQua[0] = sochan;
		ketQua[1] = sole;
		return ketQua;
	}

}
