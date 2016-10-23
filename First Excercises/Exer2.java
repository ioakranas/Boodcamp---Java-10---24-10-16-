import java.util.*;

public class Exer2 {

	public static void main(String args[]){

		roll();
	}

	public static void roll(){

		int counter = 0;
		int die1=0;
		int die2=0;
		while( die1 != 1 || die2 != 1){
			die1 = (int)(6.0*Math.random())+1;
			die2 = (int)(6.0*Math.random())+1;
			counter++;
		}
		System.out.println("The dice rolled " +counter+ " times!");
	}
}