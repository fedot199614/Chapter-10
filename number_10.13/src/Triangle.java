
public class Triangle extends TwoDimensionalShape {

	public Triangle(double a, double b, double c) {
		super(a, b, c);
	}

	@Override
	public double getArea() {
        double a = super.getHeight();
		double b = super.getLength();
		double c = super.getWidth();
		double poluPerimeter = (a + b + c) / 2;
		return Math.sqrt(poluPerimeter * (poluPerimeter - a) * (poluPerimeter - b) * (poluPerimeter - c));
	}

}
