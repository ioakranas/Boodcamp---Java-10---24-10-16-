
public class Employee {
	
	/* Fields */
	private String fname;
	private String lname;
	private int birth;
	private int id;
	public static int year = 2016;
	public static int code=0;
	
	/* Constructors */
	 Employee (String fname, String lname, int birth){
		setFname(fname);
		setLname(lname);
		setBirth(birth);
		code++;
		id=code;
	}
	
	
	/* Getters & Setters */
	public void setFname(String fname){
		this.fname = fname;
	}
	public String getFname(){
		return this.fname;
	}
	public void setLname(String lname){
		this.lname = lname;
	}
	public String getLname(){
		return this.lname;
	}
	public void setBirth(int birth){
			this.birth = birth;
	}
	public int getBirth(){
		return this.birth;
	}
	
	
	/* Methods */
	@Override
	public String toString(){
		return ("ID:"+this.id+"\nFirst Name:  "+getFname()+",\nLast Name: "+ getLname()+
				" \nAge: "+ getAge()+" years old.\n");
	}
	
	public int getAge(){
		return (year - this.getBirth());
	}
	
}
