
public class Singer {
	
	/* Fields */
	private String fName;
	private String lName;
	
	/* Constructor */
	Singer(String fName, String lName){
		this.fName = fName;
		this.lName = lName;
	}
	
	/* Setters & Getters */
	
	public void setFName(String fName){
		this.fName = fName;
	}
	public String getFName(){
		return this.fName;
	}
	public void setLName(String lName){
		this.lName = lName;
	}
	public String getLName(){
		return this.lName;
	}
	
	/* Methods */
	public String toString(){
		return "First Name: "+getFName()+"\nLast Name: "+getLName();
	}

}
