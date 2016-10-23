import java.util.Scanner;
import java.util.Arrays;

public class Exer1 {

	public static void main(String args[]){

		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Tax Identification Number:");
		String s = sc.nextLine();
		Boolean outcome = func(s);
		if (outcome == true)
			System.out.println("Tax Identification Number Valid.");
		else
			System.out.println("Tax Identification Number Invalid.");
	}

	public static boolean func(String str){
		int[] intArray = new int[9];
		int arrayLength = str.length();
		if (arrayLength != 9){
			System.out.println("Not a valid length");
		}
		else{
			for (int i=0;i<9;i++){
				intArray[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		double y=0;
		double sum=0;
		for (int i=1;i<9;i++){
			y = Math.pow(2,i);
			sum = sum + intArray[8-i]*y;
		}
		double temp = sum%11;
		double temp1 = temp%10;
		if (temp1 == intArray[8]){
			return true;
		}
		else{
			return false;
		}
	}
}