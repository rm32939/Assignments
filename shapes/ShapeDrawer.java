package shapes;

public class ShapeDrawer implements Drawable {

	@Override
	public void draw(Shape s) {
		// TODO Auto-generated method stub
		if(s instanceof Square) { //insstanceof checks what shape is being held in s
			System.out.println("Drawing square");
		}
	}
	
}
