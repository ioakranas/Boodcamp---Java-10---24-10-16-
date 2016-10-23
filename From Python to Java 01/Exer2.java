import java.util.Scanner;

public class Exer2 {

	public static void main(String args[]){

	Scanner sc = new Scanner (System.in);

	System.out.print("Enter number of 50 euro banknotes: ");
	int a = sc.nextInt();
	System.out.print("Enter number of 20 euro banknotes: ");
	int b = sc.nextInt();
	System.out.print("Enter number of 10 euro banknotes: ");
	int c = sc.nextInt();
	System.out.print("Enter number of 5 euro banknotes: ");
	int d = sc.nextInt();
	System.out.print("Enter number of 2 euro coins: ");
	int e = sc.nextInt();
	System.out.print("Enter number of 1 euro coins: ");
	int f = sc.nextInt();

	int sum = 50*a+20*b+10*c+5*d+2*e+f;

	System.out.print("You have " +sum+  " euros.");
	System.out.print("\n");

	}

}