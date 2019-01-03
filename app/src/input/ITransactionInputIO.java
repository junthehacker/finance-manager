package input;

import java.util.ArrayList;
import transaction.Transaction;

public interface ITransactionInputIO {
  ArrayList<Transaction> read(String fileName);
}
