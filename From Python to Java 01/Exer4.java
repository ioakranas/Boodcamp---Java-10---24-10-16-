import java.util.Scanner;

public class Exer4 {

	public static void main(String args[]){

	double y=0;
	double x=0;
	Scanner sc = new Scanner (System.in);

	System.out.print("Enter the value of a: ");
	double a = sc.nextDouble();
	System.out.print("Enter the value of b: ");
	double b = sc.nextDouble();
	System.out.print("Enter the value of c: ");
	double c = sc.nextDouble();

	double z = (b*b)-4*a*c;

	if (z < 0)
		System.out.print("No real-valued solutions exists.");
	else{
		x = (-b+Math.sqrt(z))/2*a;
		y = a*(x*x)+b*x+c;
		}

	System.out.print("The output is: " +y);
	System.out.print("\n");



	}

}