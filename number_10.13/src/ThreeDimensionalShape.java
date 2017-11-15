
public abstract class ThreeDimensionalShape extends Shape {
	
	public ThreeDimensionalShape(double length, double width,double height) {
		super(length, width, height);
	}
	public ThreeDimensionalShape(double length,double width) {
		super(length,width);
	}
	public ThreeDimensionalShape(double length) {
		super(length);
	}
	public ThreeDimensionalShape() {
		super();
	}
	
	
	
	public abstract double getArrea(); 
	public abstract double getVolume(); 
		
	
}
