/***
 * This class represent a transaction (transfer of money)
 * of a bank account. The 2 fields are just dummy fields since this 
 * example serves only demonstrating reasons for adding and removing 
 * objects in a list. 
 * @author angor
 */
public class BankAccountTransaction {
    /* amount of money of the transaction */
    private int amount_of_money;
    /* The type of transaction ("incoming" or "outgoing") */
    private String transaction_type;
    
    /* Overloaded constructor with 2 arguments */
    BankAccountTransaction(int amount_of_money, String transaction_type) {
        this.amount_of_money = amount_of_money;
        this.transaction_type = transaction_type;
    }

    /* Getters and Setter methods */
    public int getAmount_of_money() {
        return amount_of_money;
    }
    public void setAmount_of_money(int amount_of_money) {
        this.amount_of_money = amount_of_money;
    }
    public String getTransaction_type() {
        return transaction_type;
    }
    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    /* Returns a string with the field values of the class */
    @Override
    public String toString() {
        return "BankAccountTransaction [amount_of_money=" + amount_of_money
                + ", transaction_type=" + transaction_type + "]";
    }   

}