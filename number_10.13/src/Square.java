
public class Square extends TwoDimensionalShape {
	public Square(double length) {
		super(length);
	}

	@Override
	public double getArea() {

		return super.getLength() * super.getLength();
	}

}
