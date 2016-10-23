import java.util.Scanner;

public class Exer3 {

	public static void main(String args[]){

	Scanner sc = new Scanner (System.in);

	System.out.print("Give the size of the first side of the triange: ");
	double a = sc.nextDouble();
	System.out.print("Give the size of the second side of the triange: ");
	double b = sc.nextDouble();
	System.out.print("Give the size of the third side of the triange: ");
	double c = sc.nextDouble();

	double area = (Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)))/4;

	System.out.print("The area of the triange is: " +area);
	System.out.print("\n");



	}

}