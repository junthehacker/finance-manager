package environment;

import java.util.ArrayList;
import transaction.Transaction;

public class Environment {

  private ArrayList<Transaction> transactions;
  private static Environment instance;

  private Environment() {
    // Private constructor
  }

  /**
   * Get the singleton instance.
   *
   * @return The environment instance.
   */
  public static Environment getInstance() {
    if (instance == null) {
      instance = new Environment();
    }
    return instance;
  }

  /**
   * Get a list of transactions.
   *
   * @return A list of transactions.
   */
  public ArrayList<Transaction> getTransactions() {
    return transactions;
  }

  /**
   * Set a list of transactions.
   *
   * @param transactions A list of transactions.
   */
  public void setTransactions(ArrayList<Transaction> transactions) {
    this.transactions = transactions;
  }

}
