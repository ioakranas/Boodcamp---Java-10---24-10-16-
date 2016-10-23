
public class Circle implements Shape{
	
	/* Fields */
	protected double radius;


	/* Constructor */

	Circle(double radius){
		this.radius = radius;
		
	}
	
	/* Getters & Setters */
	public void setRadius(double radius){this.radius=radius;}
	public double getRadius(){return this.radius;}

	@Override
	public double getParameter() {
		return this.radius*2*3.14;
		}

	@Override
	public double getArea() {
		return this.radius*3.14*this.radius;
	}
	
	
	/* Methods */
	
}