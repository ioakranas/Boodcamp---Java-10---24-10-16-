import java.util.*;

public class Test {
	
	public static Customer[] customers = new Customer[10];
	public static Insurance[] insurances = new Insurance[10];

	public static void main(String args[]){
		
		Customer giannis = new Customer("Giannis",1985,"male");
		Customer ioannis = new Customer("Ioannis",1985,"male");
		Customer marielena = new Customer("Marielena",1989,"female");
		Customer olga = new Customer("Olga",1988,"female");
		Customer petros = new Customer ("Petros",1990,"male");
		Customer kostas = new Customer ("Kostas", 1995, "male");
		Customer giorgos = new Customer ("Giorgos", 1980, "male");
		Customer eleni = new Customer ("Eleni", 1970, "female");
		Customer ritsa = new Customer ("Ritsa", 1987, "female");
		Customer kostas1 = new Customer ("Kostas", 1995, "male");
		
		customers[0] = giannis;
		customers[1] = ioannis;
		customers[2] = marielena;
		customers[3] = olga;
		customers[4] = petros;
		customers[5] = kostas;
		customers[6] = giorgos;
		customers[7] = eleni;
		customers[8] = ritsa;
		customers[9] = kostas1;
		
		Insurance ins1 = new Life(5,1,500);
		Insurance ins2 = new Health(1,1,897);
		Insurance ins3 = new Life(5,2,500);
		Insurance ins4 = new Health(5,3,100);
		Insurance ins5 = new Health(5,4,500);
		Insurance ins6 = new Life(5,4,500);
		Insurance ins7 = new Life(5,5,85);
		Insurance ins8 = new Life(5,6,500);
		Insurance ins9 = new Life(5,7,1500);
		Insurance ins10 = new Life(5,8,1000);
		
		insurances[0] = ins1;
		insurances[1] = ins2;
		insurances[2] = ins3;
		insurances[3] = ins4;
		insurances[4] = ins5;
		insurances[5] = ins6;
		insurances[6] = ins7;
		insurances[7] = ins8;
		insurances[8] = ins9;
		insurances[9] = ins10;
		
		//Insurance[] insurances = {ins1,ins2,ins3,ins4,ins5,ins6,ins7,ins8,ins9,ins10};
		
		Scanner sc = new Scanner(System.in);
		Scanner sc11 = new Scanner(System.in);
		int temp=0;
		int temp1=0;
		
		do{
			System.out.println("***** MENU *****");
			System.out.println("1. Print all insurances.");
			System.out.println("2. Search insurances by customer code.");
			System.out.println("3. Search insurances by insurance code.");
			System.out.println("4. Print Costumer's Cost by insurance code.");
			System.out.println("5. Quit");
			temp = sc.nextInt();
			if (temp == 1){
				for (int i=0;i<10;i++){
					System.out.println(Test.insurances[i].toString());
				}
			}
			else if (temp == 2){
				temp1 = sc11.nextInt();
				for (int i=0;i<10;i++){
					Test.insurances[i].printSpecificInsuranceByCostumerCode(temp1);
				}
				
			}
			else if (temp == 3){
				temp1 = sc11.nextInt();
				for (int i=0;i<10;i++){
					Test.insurances[i].printSpecificInsuranceByInsuranceCode(temp1);
				}
			}
			else if (temp == 4){
				temp1 = sc11.nextInt();
				for (int i=0;i<10;i++){
					System.out.println(Test.insurances[i].insuranceCostReturning());
				}
			}
			else if (temp == 5){
				break;
			}
			else{
				System.out.println("Wrong Input..\nPlease try again!");
			}
			
			
		}while (temp != 4);
		
	}
	
}