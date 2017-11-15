
public abstract class TwoDimensionalShape extends Shape {

	public TwoDimensionalShape(double length, double width,double height) {
		super(length, width, height);
	}
	public TwoDimensionalShape(double length,double width) {
		super(length,width);
	}
	public TwoDimensionalShape(double length) {
		super(length);
	}
	public TwoDimensionalShape() {
		super();
	}
	public abstract double getArea();
}
