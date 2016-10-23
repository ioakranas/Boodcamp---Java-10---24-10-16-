
public class ResizableCircle extends Circle implements Resizable{
	
	
	/* Constructor */
	ResizableCircle(double radius){
		super(radius);
	}
	
	
	
	
	/* Methods */
	public void resize(double input){
		double temp = super.radius*input;
		super.setRadius(temp);
	}

	

}
