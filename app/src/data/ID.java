package data;

import java.util.Random;

public class ID {

  private String id;
  private static final String RANDOM_FIELD = "abcdefghijklmnopqrstuvwxyz01234567890";

  /**
   * Create a new ID instance with random string.
   */
  public ID() {
    this.id = generateRandom(RANDOM_FIELD);
  }

  /**
   * Create an ID instance with predefined string.
   * @param id The ID string.
   */
  public ID(String id) {
    this.id = id;
  }

  /**
   * Convert ID to string.
   * @return The ID in string.
   */
  public String toString() {
    return this.id;
  }

  /**
   * Check if two IDs are equal.
   * @param o ID to check.
   * @return True if equal.
   */
  public boolean equals(Object o) {
    if(o instanceof ID) {
      ID i = (ID)o;
      return i.toString().equals(id);
    }
    return false;
  }

  /**
   * Generate a random 17 char string.
   * @param field String of chars to choose from.
   * @return 17 char string.
   */
  private static String generateRandom(String field) {
    Random rand= new Random();
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < 17; i++) {
      int randIndex=rand.nextInt(field.length());
      res.append(field.charAt(randIndex));
    }
    return res.toString();
  }
}
