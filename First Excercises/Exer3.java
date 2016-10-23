import java.util.*;

public class Exer3 {

	public static void main(String args[]){

		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number of shifts:");
		int shift = sc.nextInt();
		int[] sarray = {1,2,3,4,5,6,7,8,9,10};
		for (int i=1;i<=shift;i++){
			for (int j=0;j<10;j++){
				if (sarray[j] != 1)
					sarray[j] = sarray[j]-1;
				else
					sarray[j] = 10;
			}
			System.out.println(Arrays.toString(sarray));
		}
	}
}