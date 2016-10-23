
public class DCavajo {

	/* Fields */
	private Festival festival;
	
	/* Constructor */
	DCavajo (Festival festival){
		this.festival = festival;
	}
	
	/* Setters & Getters */
	public void setFestival(Festival festival){
		this.festival = festival;
	}
	public Festival getFestival(){
		return this.festival;
	}
	
	/* Methods */
	
	public void findMeBandFromSinger(String input){
		this.festival.printBandFromSinger(input);
	}
	
	public void findMeBandFromName(String input){
		this.festival.printBandFromName(input);
	}
	
	public void findMeAvailableBands(){
		this.festival.availableBands();
	}
	
}
