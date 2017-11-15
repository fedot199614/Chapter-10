
public class Sphere extends ThreeDimensionalShape {

	public Sphere(double radius) {
		super(radius);
	}

	@Override
	public double getArrea() {

		return 4 * Math.PI * Math.pow(super.getLength(), 2);
	}

	@Override
	public double getVolume() {

		return 4 / 3 * Math.PI * Math.pow(super.getLength(), 3);
	}

}
