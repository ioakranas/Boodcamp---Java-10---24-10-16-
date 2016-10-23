import java.util.*;

public class Exer4 {

	public static void main(String args[]){

		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number of shifts:");
		int shift = sc.nextInt();
		Double[] array = new Double[]{1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
		for (int i=1;i<=shift;i++){
			for (int j=0;j<10;j++){
				if (array[j] != 1)
					array[j] = array[j]-1;
				else
					array[j] = 10.0;
			}
			System.out.println(Arrays.toString(array));
		}
	}
}