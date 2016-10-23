
public class Insurance {
	
	/* Fields */
	int duration;
	static int iid=0;
	public final int insuranceCode;
	int customerCode;
	
	
	/* Constructor */
	Insurance(int duration, int customerCode){
		this.duration = duration;
		this.customerCode = customerCode;	
		iid++;
		this.insuranceCode = iid;
	}
	
	
	/* Setters & Getters */
	public int getInsuranceCode(){return this.insuranceCode;}
	public int getDuration(){return this.duration;}
	public void setDuration(int duration){this.duration = duration;}
	public int getCustomerCode(){return this.customerCode;}
	public void setCustomerCode(int customerCode){this.customerCode=customerCode;}
	
	/* Methods */
	@Override
	public String toString(){
		return "\nInsurance Code: " + this.insuranceCode + "\nCostumer Code: " + this.getCustomerCode() +
				"\nDuration:" + this.duration;
	}
	
	public int  insuranceCostReturning(){
		return 100;
	}
	
	public void printSpecificInsuranceByInsuranceCode(int input){
		if (input == this.insuranceCode){
			System.out.println(toString());
		}
	}
	
	public void printSpecificInsuranceByCostumerCode(int input){
		if (input == this.customerCode){
			System.out.println(toString());
		}
	}
	
}
