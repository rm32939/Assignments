package shapes;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sq= new Square(25.5);
		sq.computeArea();
		sq.computePerimeter();
		System.out.println(sq);
		ShapeDrawer sd= new ShapeDrawer();
		draw(sd, sq);
	
		
		Drawable d = new Drawable() { //anonymous inner class(can be used within a class)

			@Override
			public void draw(Shape s) {

				if(s instanceof Square)
					System.out.println("Drawing shapes using drawable");
			}
			
		};
		
		draw(d, sq);
		draw(new MyDrawable(), sq);
	}	
	
	public static void draw(Drawable d, Shape s) {
		d.draw(s);
	}
	
	static class MyDrawable implements Drawable{

		@Override
		public void draw(Shape s) {
			if(s instanceof Square)
				System.out.println("Drawing shapes using MyDrawable");
		}
		
	}
}
