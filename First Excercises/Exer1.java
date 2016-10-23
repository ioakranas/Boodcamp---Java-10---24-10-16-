import java.util.Scanner;

public class Exer1 {

	public static void main(String args[]){

	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the first number:");
	int a = sc.nextInt();
	System.out.print("Enter the second number:");
	int b = sc.nextInt();
	int out = bootcamp(a,b);
	System.out.println(out);

	}

	public static int bootcamp (int number1, int number2){

		int outcome=0;
		if (number1 < number2){
			int temp1 = Math.abs(number1 - number2);
			double temp2 = Math.sqrt(outcome);
			outcome = (int) temp2;
		}
		else
			outcome = number1+number2;
		return outcome;

	}

}