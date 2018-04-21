package thanhdnh.hueic.edu.vn;

import java.util.Scanner;

public class MainProgram {

	public static void Main(String[] args) {

	public static void main(String[] args) {
		HangHoa hh = new HangHoa();
		KhachHang kh = new KhachHang();
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời nhập Username : ");
		String usr = sc.nextLine();
		System.out.println("Mời nhập Password : ");
		String pass = sc.nextLine();
		if (usr.equals(kh.getUsername()) && pass.equals(kh.getPassword())) {
			HangHoa haH = new HangHoa();
			System.out.println("Nhập tên hàng : ");
			String th = sc.nextLine();
			System.out.println("Nhập ngày sản xuất : ");
			String nsx = sc.nextLine();
			System.out.println("Nhập đơn giá : ");
			double dg = sc.nextDouble();
			System.out.println("Nhập số lượng : ");
			int sl = sc.nextInt();
			kh.MuaHang(th, nsx, dg, sl);
		} else {
			System.out.println(
					"Xin lỗi , tài khoản của quý khách không tồn tại trong hệ thống . Xin liên hệ với chi nhánh khách hàng gần nhất !");
		}
	}
}