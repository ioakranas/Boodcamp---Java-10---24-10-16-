import java.util.*;

public class Exer5 {

	public static void main(String args[]){

		drawFunction();
	}


	static char[][] getClean() {
		return new char[][] {{' ', ' ', ' '},
						 	{' ', ' ', ' '},
						    {' ', ' ', ' '}};
	}

	public static void printer (char array[][]){
		System.out.println("  1 2 3 ");
		System.out.println("--------");
		System.out.println("1|"+array[0][0]+"|"+array[0][1]+"|"+array[0][2]+"|");
		System.out.println("--------");
		System.out.println("2|"+array[1][0]+"|"+array[1][1]+"|"+array[1][2]+"|");
		System.out.println("--------");
		System.out.println("3|"+array[2][0]+"|"+array[2][1]+"|"+array[2][2]+"|");
		System.out.println("--------");
		System.out.println("\n");
	}

	public static boolean check(int a, int b){
		if ((a < 4 && a > 0) && (b < 4 && b > 0)) {
			return true;
		} else {
			return false;
		}
	}


	public static int win(char array[][]){
		int temp=0;
		for (int i=0;i<3;i++){
			if (array[i][0] == 'X' && array[i][1] == 'X' && array[i][2] == 'X')
			temp=1;
			if (array[0][i] == 'X' && array[1][i] == 'X' && array[2][i] == 'X')
			temp=1;
			if (array[i][0] == 'O' && array[i][1] == 'O' && array[i][2] == 'O')
			temp=2;
			if (array[0][i] == 'O' && array[1][i] == 'O' && array[2][i] == 'O')
			temp=2;
		}
		if (array[0][0] == 'X' && array[1][1] == 'X' && array[2][2] == 'X')
			temp=1;
		if (array[0][2] == 'X' && array[1][1] == 'X' && array[2][0] == 'X')
			temp=1;
		if (array[0][0] == 'O' && array[1][1] == 'O' && array[2][2] == 'O')
			temp=2;
		if (array[0][2] == 'O' && array[1][1] == 'O' && array[2][0] == 'O')
			temp=2;

		return temp;
	}


	public static void drawFunction(){

		Scanner sc = new Scanner (System.in);
		char[][] triliza = getClean();
		int temp = 0;
		int turn = 1;
		int counter = 0;
		boolean che = true;
		System.out.println("\n");
		System.out.println("Let's Start the game!");
		printer(triliza);

		while (temp==0 && counter<9){
			counter++;
			if (turn == 1){
				System.out.print("Player 'X', enter the xdimention:");
				int x = sc.nextInt();
				System.out.print("Player 'X', enter the ydimention:");
				int y = sc.nextInt();
				System.out.println("\n");
				che = check(x,y);
				if (che==false){
					System.out.println("Invalid input.");
					break;
				}
				if (triliza[x-1][y-1] == ' '){
					triliza[x-1][y-1] = 'X';
					printer(triliza);
					temp = win(triliza);
					if (temp ==1) {
						System.out.println("Player 'X' - WIN - the game!");
						break;
					}
					turn = 2;
				}
				else{
					System.out.println("Position occupied.");
					System.out.println("Try another position.");
					System.out.println("\n");
				}
			}
			else if (turn == 2){
				System.out.print("Player 'O', enter the xdimention:");
				int x = sc.nextInt();
				System.out.print("Player 'O', enter the ydimention:");
				int y = sc.nextInt();
				System.out.println("\n");
				che = check(x,y);
				if (che==false){
					System.out.println("Invalid input.");
					break;
				}
				if (triliza[x-1][y-1] == ' ' ){
					triliza[x-1][y-1] = 'O';
					printer(triliza);
					temp = win(triliza);
					if (temp==2) {
						System.out.println("Player 'O' - WIN - the game!");
						break;
					}
					turn = 1;
				} else {
					System.out.println("Position occupied.");
					System.out.println("Try another position.");
					System.out.println("\n");
				}
			} else {
				System.out.println("Whaaaaaaat?");
			}
			if (counter == 9){
				System.out.println("TIE");
				System.out.println("No moremoves.");
			}
		}
	}
}