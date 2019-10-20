
public class Wall {
	double hight;
	double width;

	public Wall() {

	}

	public Wall(double hight, double width) {

		this.hight = hight;
		this.width = width;

	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		if (hight < 0) {
			this.hight = 0.0;
		} else {
			this.hight = hight;
		}

	}

	public double getWidth() {
		return width;
	}

	public void setWideth(double width) {
		if (width < 0.0) {
			this.width = 0.0;
		} else {
			this.width = width;
		}
	}

	public double getArea() {
		double area = hight * width;
		return area;

	}

}
