package org.rapidpm.test.pitest.v002;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SortingUtilsExtractNumericPrefixOldTest {



  private SortingUtils create() {
    return new SortingUtilsOld();
  }




  @Test(expected = NullPointerException.class)
  public void testExtractNumericPrefix001() throws Exception {
    final SortingUtils sortingUtils = create();
    final String[] result = sortingUtils.extractNumericPrefix(null);
    fail();
  }


  @Test
  public void testExtractNumericPrefix002() throws Exception {
    final SortingUtils sortingUtils = create();
    final String[] result = sortingUtils.extractNumericPrefix("158");
    assertEquals(2, result.length);
    assertEquals("158", result[0]);
    assertEquals("", result[1]);
  }

  @Test
  public void testExtractNumericPrefix003() throws Exception {
    final SortingUtils sortingUtils = create();
    final String[] result = sortingUtils.extractNumericPrefix("word");
    assertEquals(2, result.length);
    assertEquals("", result[0]);
    assertEquals("word", result[1]);
  }

  @Test
  public void testExtractNumericPrefix004() throws Exception {
    final SortingUtils sortingUtils = create();
    final String[] result = sortingUtils.extractNumericPrefix("481words");
    assertEquals(2, result.length);
    assertEquals("481", result[0]);
    assertEquals("words", result[1]);
  }

  @Test
  public void testExtractNumericPrefix005a() throws Exception {
    final SortingUtils sortingUtils = create();
    final String[] result = sortingUtils.extractNumericPrefix("0");
    assertEquals(2, result.length);
    assertEquals("0", result[0]);
    assertEquals("", result[1]);
  }
  @Test
  public void testExtractNumericPrefix005b() throws Exception {
    final SortingUtils sortingUtils = create();
    final String[] result = sortingUtils.extractNumericPrefix("1");
    assertEquals(2, result.length);
    assertEquals("1", result[0]);
    assertEquals("", result[1]);
  }
  @Test
  public void testExtractNumericPrefix005c() throws Exception {
    final SortingUtils sortingUtils = create();
    final String[] result = sortingUtils.extractNumericPrefix("9");
    assertEquals(2, result.length);
    assertEquals("9", result[0]);
    assertEquals("", result[1]);
  }

  @Test
  public void testExtractNumericPrefix006() throws Exception {
    final SortingUtils sortingUtils = create();
    final String[] result = sortingUtils.extractNumericPrefix("/");
    assertEquals(2, result.length);
    assertEquals("", result[0]);
    assertEquals("/", result[1]);
  }
  @Test
  public void testExtractNumericPrefix007() throws Exception {
    final SortingUtils sortingUtils = create();
    final String[] result = sortingUtils.extractNumericPrefix(":");
    assertEquals(2, result.length);
    assertEquals("", result[0]);
    assertEquals(":", result[1]);
  }

}