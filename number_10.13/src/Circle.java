
public class Circle extends TwoDimensionalShape {
	public Circle(double radius) {
		super(radius);

	}

	@Override
	public double getArea() {
		return Math.PI * super.getLength() * super.getLength();
	}

}
