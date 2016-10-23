
public class TestCircles {
	
	public static void main(String args[]){
		
		Circle c1 = new Circle();
		c1.setX(4);
		c1.setY(3);
		c1.setR(9);
		c1.printCount();
		
		Circle c2 = new Circle(1,1);
		c2.printCount();
		Circle c3 = new Circle(4,4,4);
		c3.printCount();
		Circle c4 = new Circle(3,3,3);
		c4.printCount();
		
		/* Print all the Constructors */
		c1.print();
		c2.print();
		c3.print();
		/* Print Perimeter and Area */
		c1.printPerimeter();
		c1.printArea();
		
		/*Testing c4 and c5 */
		Circle c5 = c4.copy();
		c5.printCount();
		c5.print();
		c4.setR(4);
		c4.setX(4);
		c4.setY(4);
		c5.print();
		c4.print();
		c1.cocentric(c2);
		System.out.println(c3.cocentric(c4));
		
		
		
	}
}
