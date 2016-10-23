
public class Festival {

	/* Fields */
	private Band[] band;
	
	/* Constructor */
	Festival(Band[] band){
		this.band = band;
	}
	
	/* Setters & Getters */
	public Band[] getBand(){
		return this.band;
	}
	public void setBand(Band[] band){
		this.band = band;
	}
	
	/* Methods */
	public void printBandFromSinger(String input){
		int temp = 0;
		for (Band b:band){
			if (input.equals(b.getSinger().getFName()) || input.equals(b.getSinger().getLName())){
				System.out.println(b.toString());
				temp = 1;
			}
		}
		if (temp == 0){
			System.out.println("There is no match!");
		}
	}
	
//	public int add(int a, int b) {
//		a = a+b;
//		return a;
//	}
//	
//	public void adasda(Singer singer) {
//		
//		singer.setFName("other name");
//		singer = new Singer(fName, lName);
//	}
//	 
//	public void doSth() {
//		int a = 10;
//		int b = 20;
//		int result  = add(a, b);
//		
//		System.out.println(a);
//	}
//	
	
	public void printBandFromName(String input){
		for (Band b:band){
			if (input.equals(b.getBandName())){
				System.out.println(b.toString());
			}
		}
	}
	
	public void availableBands(){
		int counter=0;
		for (Band b:band){
			if (b.getAvailability() == true){
				counter++;
			}
		}
		System.out.println("There is "+counter+" matches.");
		for (Band b:band){
			if (b.getAvailability() == true){
				System.out.println(b.toString());
			}
		}
	}

	
}
