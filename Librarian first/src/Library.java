
public class Library {
	
	/* Fields */
	private Book[] books;

	/* Constructor */
	Library(Book[] books){
		this.books = books;
	}
	
	/* Getters and Setters */
	public Book[] getBooks(){
		return this.books;
	}
	public void setBooks(Book[] books){
		this.books = books;
	}
	
	/* Methods */
	public void printAvailableBooks(){
		int counter=0;
		for (Book b:books){
			if (b.isAvailable() == true){
				System.out.println(b.toString());
				counter++;
			}
		}
		System.out.println("The Library has "+counter+" available books.");
	}
	
	public void printBookDetails(String input_name){
		int temp =0;
		for (Book b:books){
			if (input_name.equals(b.getTitle())){
				System.out.println("Match found.");
				System.out.println(b.toString());
				temp = 1;
			}
		}
		if (temp == 0){
			System.out.println("No match.");
		}
	}
	
	public void printBookFromAuthor(String input_name){
		for (Book b:books){
			if (input_name.equals(b.getAuthor().getName())){
				//System.out.println("Works");
				System.out.println(b.toString());
			}
		}
	}
	
	
}
