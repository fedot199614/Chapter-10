
public class Cube extends ThreeDimensionalShape {

	public Cube(double length) {
		super(length);
	}

	@Override
	public double getArrea() {

		return super.getLength() * super.getLength() * 6;
	}

	@Override
	public double getVolume() {

		return super.getLength() * super.getLength() * super.getLength();
	}

}
