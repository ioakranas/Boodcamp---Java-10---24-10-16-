import java.util.Scanner;

public class Exer7 {

	public static void main(String args[]){

	Scanner sc = new Scanner (System.in);

	System.out.print("Enter number of pronic numbers:");
	int a = sc.nextInt();

	for (int i=1;(i<a+1);i++){
		int outcome = i*(i+1);
		System.out.print(" "+outcome);
	}
	System.out.print("\n");
	}
}
