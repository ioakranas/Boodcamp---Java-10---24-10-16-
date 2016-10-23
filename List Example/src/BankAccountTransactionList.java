import java.util.ArrayList;

/***
 * This class represents a list of a bank accounts' transactions.
 * For storing the Transactions we use an ArrayList provided by the 
 * Java Collections Framework 
 * (http://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
 */
public class BankAccountTransactionList {
    /* An ArrayList that stores BankAccountTransaction objects.
     * You only declare it here as a class field. The initialization 
     * is performed in the constructor. */
    private ArrayList<BankAccountTransaction> bankAccountTransactions;

    /* The default constructor. or safety reasons (avoid NullPointerException) 
     * we have to initialize the bankAccountTransactions object. */
    public BankAccountTransactionList() {
        this.bankAccountTransactions = new ArrayList<>();
    }
    
    /* An overloaded constructor that initializes the BankAccountTransaction
     * field of your class with a transaction_arraylist that received as 
     * an argument */
    BankAccountTransactionList(ArrayList<BankAccountTransaction> transaction_arraylist) {
        this.bankAccountTransactions = transaction_arraylist;
    }
    
    /* Getter and Setter methods */
    public ArrayList<BankAccountTransaction> getTransaction_arraylist() {
        return bankAccountTransactions;
    }
    public void setTransaction_arraylist(
            ArrayList<BankAccountTransaction> transaction_arraylist) {
        this.bankAccountTransactions = transaction_arraylist;
    }
    
    /* Adds a new transaction at the last position of the 
     * bankAccountTransactions ArrayList object. The object 
     * should be added in the ArrayList, and this happens by 
     * calling the add(Element e) method of the ArrayList class */
    public void add(BankAccountTransaction new_transaction) {
        this.bankAccountTransactions.add(new_transaction);
    }
    
    /* Adds a new transaction at the position (of the index argument) of the 
     * bankAccountTransactions ArrayList object. The object 
     * should be added in the ArrayList, and this happens by 
     * calling the add(Element e) method of the ArrayList class */
    public void add(int index, BankAccountTransaction new_transaction) {
        // This check exists in order to avoid the case that you try to remove an
        // element in a position out_of_bounds of your list. out_of_bounds
        // can happen at the left and the right of your list.
        if(index > -1 && index < this.bankAccountTransactions.size()) {
            this.bankAccountTransactions.add(index, new_transaction);
        } else
            System.out.println("Index " + index + " out of bounds " + this.bankAccountTransactions.size());
    }
    
    /* Removes an element at position "index" of the bankAccountTransactions ArrayList. 
     * This happens when your ArrayList object calls the remove(int index) 
     * method of the ArrayList class */
    public void remove(int index) {
        // This check exists in order to avoid the case that you try to remove an
        // element in a position out_of_bounds of your list. out_of_bounds
        // can happen at the left and the right of your list.
        if(index > -1 && index < this.bankAccountTransactions.size()) {
            this.bankAccountTransactions.remove(index);
        }
    }
    
    /* Returns the number of the stored Transactions 
     * This number is the size of the bankAccountTransactions list.
     * you can get the size by calling the size() method of the ArrayList 
     * class from your bankAccountTransactions object. */
    public int getNumberOfStoredTransactions() {
        return this.bankAccountTransactions.size();
    }
    
    /* prints all stored BankAccountTransaction */
    public void print() {
        // Your ArrayList object bankAccountTransactions gets its size
        // by calling the size() method of the ArrayList class.
        for(int i=0; i<this.bankAccountTransactions.size(); i++){
            // The way (i+1) + ". " that your printing statement starts 
            // exists only for aesthetic reasons!
            System.out.println((i+1) + ". " + this.bankAccountTransactions.get(i));
        }
        System.out.println("==============================================");
    }
    
}