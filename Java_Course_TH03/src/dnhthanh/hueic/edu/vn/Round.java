package dnhthanh.hueic.edu.vn;

public class Round {
	private float R;// Bán kính
	private Point O;// Tâm

	public Round() {
		this.setR(Math.round(Math.random() * 100));
		this.setO(new Point());
	}

	// Xét vị trí tương đối điểm với đường tròn: nếu nằm trong - trả về -1; nếu nằm
	// ngoài - trả về 1; nếu nằm trên - trả về 0
	public int ViTriTuongDoiDiemVoiDuongTron(Point A) {

		return 0;
	}

	public float getR() {
		return R;
	}

	public void setR(float r) {
		R = r;
	}

	public Point getO() {
		return O;
	}

	public void setO(Point o) {
		O = o;
	}
}
