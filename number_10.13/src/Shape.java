
public abstract class Shape {
	private double length;
	private double width;
    private double height;
	public Shape(double length, double width,double height) {
		setLength(length);
		setWidth(width);
		setHeight(height);
	}

	public Shape(double length, double width) {
		this(length, width,1);
	}
	public Shape(double length) {
		this(length, 1 ,1);
	}
	public Shape() {
		this(1, 1, 1);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length > 0) {
			this.length = length;
		} else {
			throw new IllegalArgumentException("Значение должно быть больше 0");
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width > 0) {
			this.width = width;
		} else {
			throw new IllegalArgumentException("Значение должно быть больше 0");
		}

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height > 0) {
		this.height = height;
		}else {
			throw new IllegalArgumentException("Значение должно быть больше 0");
		}

	}
		
}
