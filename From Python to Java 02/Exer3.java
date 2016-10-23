import java.util.Scanner;
import java.util.Arrays;

public class Exer3 {

	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);


		System.out.print("Enter the first side of the triange:");
		int a = sc.nextInt();
		System.out.print("Enter the second side of the triange:");
		int b = sc.nextInt();
		System.out.print("Enter the third side of the triange:");
		int c = sc.nextInt();
		boolean x1 = check1(a,b,c);
		boolean x2 = check2(a,b,c);
		boolean x3 = equilateral(a,b,c);
		int perim = perimeter(a,b,c);

		do {
			if (x1 == false || x2 == false){
				System.out.println("Negative side detected");
				break;
			}
			if ( x3 == true) {
				System.out.println(perim);
				}
		}while (x3==true);
}


		public static int perimeter(int temp1, int temp2, int temp3){
			int per = 0;
			per = temp1+temp2+temp3;
			return per;
		}


		public static boolean equilateral(int temp1, int temp2, int temp3){
			if ((temp1==temp2) && (temp2==temp3))
				return true;
			else
				return false;
		}


		public static boolean check1(int temp1, int temp2, int temp3){
		if (temp1>0 && temp2>0 && temp3>0)
			return true;
		else
			return false;
		}


		public static boolean check2(int temp1, int temp2, int temp3){
			if ((temp1 <= temp2+temp3))
				return true;
			else if (( temp2 <= temp1+temp3))
				return true;
			else if (( temp3 <= temp1+temp2))
				return true;
			else
				return false;
		}


}