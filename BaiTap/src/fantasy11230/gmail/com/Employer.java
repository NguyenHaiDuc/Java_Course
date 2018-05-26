package fantasy11230.gmail.com;

public class Employer {
	private String ma;
	private String hoten;
	private int namsinh;
	private boolean gioitinh;
	private double hsl;

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public boolean getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public double getHsl() {
		return hsl;
	}

	public void setHsl(double hsl) {
		this.hsl = hsl;
	}

	public double TinhLuong() {
		return hsl * 1250000;
	}
	
	public Employer(String ma, String hoten, int namsinh, boolean gioitinh, double hsl) {
		this.ma = ma;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
		this.hsl = hsl;
	}

	@Override
	public String toString() {
		return "Sinh viên : \n" + "Mã sv : " + ma + "\n Họ tên : " + hoten + "\n Năm sinh : " + namsinh
				+ "\n Giới tính : " + ((gioitinh) ? "Nam" : "Nữ") + "Lương : " + TinhLuong();
	}
}
