import java.util.Scanner;

public class Exer6 {

	public static void main(String args[]){

	Scanner sc = new Scanner (System.in);

	System.out.print("Enter number of triangle numbers:");
	int a = sc.nextInt();

	for (int i=1;(i<a+1);i++){
		int outcome = (i*(i+1))/2;
		System.out.print(" "+outcome);
	}
	System.out.print("\n");
	}
}

