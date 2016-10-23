
public class Life extends Insurance {
	
	/* Fields */
	private int invest;
	
	/* Constructor */
	Life(int duration, int costumerCode, int invest){
		super(duration, costumerCode);
		setInvest(invest);
	}
	
	
	/* Setters & Getters */
	public int getInvest(){
		return this.invest;
	}
	public void setInvest(int invest){
		this.invest = invest;
	}
	
	
	/* Methods */
	@Override
	public String toString(){
		return "\nInvest Money: " + this.invest + super.toString() + "\nTotal Cost: " + this.insuranceCostReturning();
	}
	
	public int insuranceCostReturning(){
		return this.duration * 5 + super.insuranceCostReturning();
	}
	

}
