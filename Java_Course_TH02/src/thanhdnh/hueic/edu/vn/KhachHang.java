package thanhdnh.hueic.edu.vn;

public class KhachHang {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String un) {
		username = un;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String pw) {
		password = pw;
	}
	public KhachHang(String un, String pw) {
		username = un;
		password = pw;
	}
	public KhachHang() {
		username = "admin";
		password = "admin123";
	}
	public void MuaHang(String th , String nsx , double dg , int sl) {
		HangHoa hh = new HangHoa();
		hh.setTenHang(th);
		hh.setNgaySanXuat(nsx);
		hh.setDonGia(dg);
		hh.setSoLuong(sl);
		hh.TinhTien();
		System.out.println(hh.HangHoa());
	}
}
