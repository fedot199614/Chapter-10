
public class Test {
	public static void main(String[] args) {
		Shape[] figure = new Shape[6];
		Circle circle = new Circle(10);
		Triangle triangle = new Triangle(3, 3, 3);
		Square square = new Square(4);
		Sphere sphere = new Sphere(4);
		Cube cube = new Cube(4);
		Tetrahedron tetrahedron = new Tetrahedron(4);
		figure[0] = circle;
		figure[1] = triangle;
		figure[2] = square;
		figure[3] = sphere;
		figure[4] = cube;
		figure[5] = tetrahedron;
		for (Shape currentFigure : figure) {
			if (currentFigure instanceof TwoDimensionalShape) {
				System.out.println(((TwoDimensionalShape) currentFigure).getArea());
			} else if (currentFigure instanceof ThreeDimensionalShape) {
				System.out.println(((ThreeDimensionalShape) currentFigure).getArrea() + " | "
						+ ((ThreeDimensionalShape) currentFigure).getVolume());
			}

		}

	}
}
