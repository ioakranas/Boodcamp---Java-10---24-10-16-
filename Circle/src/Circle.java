
public class Circle {
	
	/* x and y coordinates*/
	private int x;
	private int y;
	private int r;
	private static final double pi = 3.14;
	private static int count;
	
	/*default constructor*/
	Circle(){
		this.x = this.y = 0;
		this.r = 0;
		count += 1;
	}
	
	/*OverLoaded constructor1*/
	Circle(int x, int y){
		this.x = x;
		this.y = y;
		count += 1;
	}
	
	/*OverLoaded constructor2*/
	Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
		count += 1;
	}
	
	/* Copy constructor */
	public Circle copy(){
		Circle new_circle = new Circle();
		new_circle.x = this.x;
		new_circle.y = this.y;
		new_circle.r = this.r;
		return new_circle;
	}
	
	
	/*getters and setters methods*/
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public int getR(){
		return this.r;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public void setR(int r){
		this.r = r;
	}
	/* Print */
	public void print (){
		System.out.println("I'm a circle at point("+getX() +","+getY()+") and radius "+getR());
	}
	
	/* Calculate Area */
	public double calculateArea(){
		return (pi*this.r*this.r);
	}
	
	public void printArea (){
		System.out.println("The area of this circle is "+calculateArea());
	}
	
	/* Calculate Perimeter*/
	public double calculatePerimeter(){
		return (pi*2*this.r);
	}
	
	public void printPerimeter(){
		System.out.println("The perimeter of this circle is "+calculatePerimeter());

	}
	
	public boolean cocentric(Circle c){
		return (this.x==c.x && this.y ==c.y);
	}
	
	public static int getCount() { 
		return count; 
	}
	public void printCount(){
		System.out.println("Number of existing circles : "+ Circle.getCount());
	}
	
	
}
