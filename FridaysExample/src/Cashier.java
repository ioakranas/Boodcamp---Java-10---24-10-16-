
public class Cashier extends Employee{
	int bonus;
	
	Cashier (String fname, String lname, int birth, int bonus){
		super(fname, lname, birth);
		this.bonus=bonus;
		
	}
	
	
	public static void main (String args[]){
		Cashier c1 = new Cashier("Petros", "Petrou", 1984, 1000);
		System.out.println(c1.toString());
		System.out.println(c1.getBonus());
	}
	
	
	public int getBonus(){
		return this.bonus;
	}
	

}
