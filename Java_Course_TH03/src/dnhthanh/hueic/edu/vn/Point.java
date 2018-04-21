package dnhthanh.hueic.edu.vn;

public class Point {
	private float x;// Tọa độ x
	private float y;// Tọa độ y

	public Point() {
		this.setX(Math.round(Math.random() * 50));
		this.setY(Math.round(Math.random() * 50));
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
