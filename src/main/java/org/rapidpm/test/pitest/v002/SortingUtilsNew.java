package org.rapidpm.test.pitest.v002;

/**
 * Created by svenruppert on 26.08.15.
 */
public class SortingUtilsNew implements SortingUtils {

  /**
   * Extracts the numeric prefix of a given String. Returns "" if the String
   * does not contain any numeric prefix)
   *
   * @param s input String whose numeric prefix has to be extracted
   *
   * @return array containing the numeric prefix ("" if not existent) as first
   * element<br/>
   * and the remaining suffix ("" if String is numeric) as second
   * element
   * <p>
   * 1234adc -- [1234] [adc]
   * 123adc123 -- [1234] [adc123]
   * adc123 -- [][adc123]
   */
  public String[] extractNumericPrefix(final String s) {
    String[] ret = {"", s};

    final int length = s.length();
    for (int i = 0; i < length; i++) {
      final char c = s.charAt(i);
      if (c >= '0' && c <= '9') {
        ret[0] = ret[0] + c;
        ret[1] = s.substring(i + 1);
      } else {
        //ende erreicht
        ret[1] = s.substring(i);
        return ret;
      }
    }
    return ret;
  }

  /**
   * Discards the common prefix of two files ("" if not existent) and returns
   * the remaining suffices of both files).
   *
   * @param a name of the first file
   * @param b name of the second file
   *
   * @return array containing the remaining suffix of the first file as first
   * element<br/>
   * and the remaining suffix of the second file as second element<br>
   * (both file names if no common prefix exists)
   * <p>
   * 123abc , 12d -- [3abc] [d] - remove prefix 12
   * 123abc , 12 -- [3abc] [] - remove prefix 12
   */
  public String[] discardCommonPrefix(String a, String b) {
    final String[] ret = new String[2];
    int l;

    if (a.length() < b.length()) l = a.length();
    else                         l = b.length();

    int position = 0; //until first character differs
    for (; position < l; position++) {
      final char charA = a.charAt(position);
      final char charB = b.charAt(position);
      if (charA != charB) {
        break;
      }
    }
    if (position >= a.length()) ret[0]="";
    else                        ret[0]=a.substring(position);

    if (position >= b.length()) ret[1]="";
    else                        ret[1]=b.substring(position);

    return ret;
  }



}
