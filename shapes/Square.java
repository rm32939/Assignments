package shapes;

public class Square extends Shape {

	public Square(double side) {
		super(side);
	}
	@Override
	public void computeArea() {
		// TODO Auto-generated method stub
		System.out.println("Area= "+length*length);
	}

	@Override
	public void computePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter= "+4*length);
	}
	
	@Override
	public String toString() {
		return "this is a square";
	}

}
