
public class Tetrahedron extends ThreeDimensionalShape {

	public Tetrahedron(double length) {
		super(length);
	}

	@Override
	public double getArrea() {

		return super.getLength() * super.getLength() * Math.sqrt(3);
	}

	@Override
	public double getVolume() {

		return super.getLength() * super.getLength() * super.getLength() * (Math.sqrt(2) / 12);
	}

}
