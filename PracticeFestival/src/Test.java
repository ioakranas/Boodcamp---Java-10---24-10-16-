import java.util.*;

public class Test {
	
	public static void main(String args[]){
	
		
		Singer peter = new Singer("Peter", "Abstract");
		Singer john = new Singer("John", "Kranas");
		Singer apostolis = new Singer ("Apostolis", "Xatzignatiou");
		Singer cobain = new Singer("Curt", "Cobain");
		Singer clapton = new Singer("Eric", "Clapton");
		Singer karalidis = new Singer("Giannis", "Karalidis");
		Singer germanos = new Singer("Kostas", "Germanos");
		Singer gialamas = new Singer("Kostas", "Goulman");

		
		Band copsa = new Band("Copsa", john, "geitonia",5,5,5, true);
		Band nirvana = new Band("Nirvana", cobain, "nevermind",5,4,3,true);
		Band redhot = new Band("RedHotChillyPeppers", peter, "californication",1,1,1,false);
		Band foofighters = new Band("Foo Fighters", cobain, "asdasdasd", 9,9,9,false);
		Band acdc = new Band("Ac - Dc", gialamas, "tommorowland",1,1,1,true);
		Band radiohead = new Band("Radiohead", karalidis, "californication",1,1,1,true);
		Band underworld = new Band("Underworld", germanos, "asadasdsad",5,7,8,true);
		Band sawf = new Band("SAWF", john, "FuckThemAll",4,1,3,false);
		Band bizkit = new Band("Limp Bizkit", apostolis, "asdadasd",1,1,1,true);

		
		Band[] band = {copsa, nirvana, redhot};
		
		Festival festival = new Festival(band);
		DCavajo dcavajian = new DCavajo(festival);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String bandName;
		String singerName;
		int temp=0;
		
		//dcavajian.findMeAvailableBands();
		//dcavajian.findMeBandFromName("Nirvana");
		//dcavajian.findMeBandFromSinger("John");
		
		
		System.out.println("Welcome to the Dcavajo's Festival.");
		System.out.println("How do you want to proceed?");
		
		do{
			System.out.println("1. Show all available bands");
			System.out.println("2. Search for band (by band name)");
			System.out.println("3. Display bands from a specific singer");
			System.out.println("4. Quit");
			temp = sc1.nextInt();
			if (temp == 1){
				dcavajian.findMeAvailableBands();
			}
			if (temp == 2){
				bandName = sc2.nextLine();
				dcavajian.findMeBandFromName(bandName);
			}
			if (temp == 3){
				singerName = sc2.nextLine();
				dcavajian.findMeBandFromSinger(singerName);
			}
			if (temp == 4){
				System.out.println("Thank you for your time!");
				break;
			}
			if (temp < 1 || temp > 4){
				System.out.println("Wrong Input.");
			}
		}while(temp==4);
		
		
	}
		

}
