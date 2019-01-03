import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import data.ID;
import org.junit.Test;

public class IDTest {
  @Test
  public void testIDShouldGenerate17CharRandomStr() {
    ID id = new ID();
    assertEquals(17, id.toString().length());
  }

  @Test
  public void testIDShouldUseStringProvided() {
    ID id = new ID("test");
    assertEquals("test", id.toString());
  }

  @Test
  public void testIDShouldWorkWithEquals() {
    ID id = new ID("123");
    ID id2 = new ID("123");
    assertEquals(id, id2);
  }

  @Test
  public void testIDShouldNotGenerateSameStrings() {
    ID id = new ID();
    ID id2 = new ID();
    assertNotEquals(id, id2);
  }
}
