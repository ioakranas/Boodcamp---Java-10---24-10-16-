/* This class exists in order to test the 
 * functionalities of the BankAccountTransactionList
 * as implemented with an ArrayList (provided by the 
 * Java Collection Framework
 */
public class TestBankAccoutTransList_ArrayList {
    public static void main(String args[]) {
        /* Declare and initialize (by calling the default constructor 
         * a BankAccountTransactionList object with name transactions_list 
         * Your list is currently empty */
        BankAccountTransactionList transactions_list = new BankAccountTransactionList();
        /* Create some dummy BankAccountTransaction to be added in the list above */
        BankAccountTransaction transaction1 = new BankAccountTransaction(300, "incoming");
        BankAccountTransaction transaction2 = new BankAccountTransaction(400, "outgoing");
        BankAccountTransaction transaction3 = new BankAccountTransaction(700, "incoming");
        BankAccountTransaction transaction4 = new BankAccountTransaction(1000, "outgoing");
        BankAccountTransaction transaction5 = new BankAccountTransaction(500, "incoming");

        /* Adding the transactions to the list. Note that most of the transactions are 
         * not added at the end of the list. What is the expected order? */
        transactions_list.add(transaction1);
        transactions_list.add(0,transaction2);
        transactions_list.add(1,transaction3);
        transactions_list.add(transaction4);
        transactions_list.add(1,transaction5);
        /* Print the stored transactions */
        transactions_list.print();
        
        /* Delete some (first and last) transactions */
        transactions_list.remove(0);
        transactions_list.remove(transactions_list.getNumberOfStoredTransactions() - 1);
        /* Print the stored transactions */
        transactions_list.print();
    }
}