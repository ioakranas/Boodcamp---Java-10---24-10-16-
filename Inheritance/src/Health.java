
public class Health extends Insurance {
	
	/* Fields */
	int expense;
	
	/* Constructor */
	Health(int duration, int costumerCode, int expense){
		super(duration, costumerCode);
		setExpense(expense);
	}
	
	
	/* Setters & Getters */
	public int getExpense(){
		return this.expense;
	}
	public void setExpense(int exprense){
		this.expense = exprense;
	}
	
	
	/* Methods */
	@Override
	public String toString(){
		return "\nInvest Money: " + this.expense + super.toString() + "\nTotal Cost: " + this.insuranceCostReturning();
	}
	
	public int insuranceCostReturning(){
		if (Customer.sex.equals("male")){
		return this.duration * 7 + super.insuranceCostReturning() + 50;
		}
		else{
			return this.duration * 7 + super.insuranceCostReturning();
		}
	}
	
	
}
