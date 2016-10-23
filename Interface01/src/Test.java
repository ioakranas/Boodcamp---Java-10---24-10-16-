import java.util.*;



public class Test {

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		Circle c = new Circle(5);
		
		System.out.println("Parameter: " + c.getParameter());
		System.out.println("Area: " + c.getArea());
		
		ResizableCircle c1 = new ResizableCircle(10);
		
		System.out.println("Parameter: " + c1.getParameter());
		System.out.println("Area: " + c1.getArea());
		
		double temp = scan.nextDouble();
		c1.resize(temp);
		
		
		System.out.println("Parameter: " + c1.getParameter());
		System.out.println("Area: " + c1.getArea());
		
		
		
	}
}
