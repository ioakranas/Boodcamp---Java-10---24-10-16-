import java.util.Scanner;
import java.util.Arrays;

public class Exer2 {

	public static void main(String args[]){

		Scanner sc = new Scanner (System.in);
		System.out.print("Enter 8-bit binary number :");
		String s = sc.nextLine();
		Boolean outcome = func(s);
		if (outcome == true)
			System.out.println("Parity check OK.");
		else
			System.out.println("Parity check NOT OK.");
		}

	public static boolean func(String str){

		int[] intArray = new int[8];
		int arrayLength = str.length();
		if (arrayLength != 8){
			System.out.println("Not a valid length");
		}
		else{
			for (int i=0;i<8;i++)
				intArray[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
			//if (intArray[i] != 0 || intArray[i] != 1){
				//System.out.println("Not a binary nymber.");
				//break;
			//}
		}
		int temp=0;
		for (int i=0;i<7;i++){
			if (intArray[i] == 1)
				temp=temp+1;
		}
		int temp1 = temp%2;
		int digit = intArray[7];
		if ((digit == 0 && temp1 ==0) || (digit == 1 && temp1 == 1))
			return true;
		else
			return false;
		}
}
