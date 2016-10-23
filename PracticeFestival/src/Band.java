
public class Band {

	/* Fields */
	private String bandName;
	private Singer singer;
	private String quote;
	private int numberOfAlbums;
	private int numberOfMembers;
	private int timesPlayed;
	private boolean availability;
	
	/* Constructor */
	Band(String bandName, Singer singer, String quote, int numberOfAlbums, int numberOfMembers, int timesPlayed, boolean availability){
		this.bandName = bandName;
		this.singer = singer;
		this.numberOfAlbums = numberOfAlbums;
		this.numberOfMembers = numberOfMembers;
		this.timesPlayed = timesPlayed;
		this.availability = availability;
	}
	
	/* Setters & Getters */
	public void setBandName(String bandName){
		this.bandName = bandName;
	}
	public String getBandName(){
		return this.bandName;
	}
	public void setSinger(Singer singer){
		this.singer = singer;
	}
	public Singer getSinger(){
		return this.singer;
	}
	public void setQuote(String quote){
		this.quote = quote;
	}
	public String getQuote(){
		return this.quote;
	}
	public void setNumberOfAlbums(int numberOfAlbums){
		this.numberOfAlbums = numberOfAlbums;
	}
	public int getNumberOfAlbums(){
		return this.numberOfAlbums;
	}
	public void setNumberOfMembers(int numberOfMembers){
		this.numberOfMembers = numberOfMembers;
	}
	public int getNumberOfMembers(){
		return this.numberOfMembers;
	}
	public void setTimesPlayed(int timesPlayed){
		this.timesPlayed = timesPlayed;
	}
	public int getTimesPlayed(){
		return this.timesPlayed;
	}
	public void setAvailability(boolean availability){
		this.availability = availability;
	}
	public boolean getAvailability(){
		return this.availability;
	}
	
	/* Methods */
	public String toString(){
		String temp;
		if (getAvailability() == true){
			temp = "The Band is available.";
		}
		else{
			temp = "The Band is not available.";
		}
		return "Band Name: "+getBandName()+"\nSinger First Name: "+singer.getFName()+
				"\nSinger Last Name: "+singer.getLName()+"Band Quote: "+getQuote()+
				"\nNumber Of Albums: "+getNumberOfAlbums()+"\nNumber Of Members: "+
				getNumberOfAlbums()+"\nTimes Played At Festval: "+getTimesPlayed()+
				"\nAvailability: "+temp+"\n";
	}
}
