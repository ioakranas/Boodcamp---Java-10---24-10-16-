
public class Librarian {
	
	/* Fields */
	private Library library;
	
	/* Constructor */
	Librarian(Library library){
		this.library = library;
	}
	
	/* Setters and Getters */
	public void setLibrary(Library library){
		this.library = library;
	}
	public Library getLibrary(){
		return this.library;
	}
	
	/* Methods */
	
	public void findMeBooksFromAuthor(String input_name ){
		this.library.printBookFromAuthor(input_name);
	}
	
	public void findMeAvailableBooks(){
		this.library.printAvailableBooks();
	}
	
	public void findMeBook(String input_name){
		this.library.printBookDetails(input_name);
	}
}
