
public class Customer {
	
	/* Fields */
	final int customerCode;
	static int cid =0;
	String name;
	int birth;
	static String sex;
	
	/* Constructor */
	Customer (String name, int birth, String sex){
		setName(name);
		setBirth(birth);
		setSex(sex);
		cid++;
		this.customerCode = cid;
	}

	
	/* Setters & Getters */
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public int getCode(){
		return this.customerCode;
	}
	public void setBirth(int birth){
		this.birth = 2016 - birth;
	}
	public int getBirth(){
		return this.birth;
	}
	public void setSex(String sex){
		if (sex.equals("male") || sex.equals("female")){
			sex = sex;
		}
		else{
			sex = "wrong";
		}
	}
	public String getSex(){
		return sex;
	}
	
	
	/* Methods */
	@Override
	public String toString(){
		return "\nCustomer Code: " + this.customerCode + "\nCustomer Name: " + this.name + "\nCustomer Age: " + this.birth +
			   "\nCustomer Sex: "+ sex;
	}
	
	
}
