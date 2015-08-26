package org.rapidpm.test.pitest.v002;

/**
 * Created by svenruppert on 26.08.15.
 */
public class SortingUtilsOld implements SortingUtils{

  /**
   * Extracts the numeric prefix of a given String. Returns "" if the String
   * does not contain any numeric prefix)
   *
   * @param s input String whose numeric prefix has to be extracted
   * @return array containing the numeric prefix ("" if not existent) as first
   * element<br/>
   * and the remaining suffix ("" if String is numeric) as second
   * element
   */
  public String[] extractNumericPrefix(String s) {
    String[] ret = {"", s};
    for (int i = 1; i <= s.length(); i++) {
      String temp = s.substring(0, i);
      try {
        Long.parseLong(temp);
        ret[0] = temp;
        if (i < s.length())
          ret[1] = s.substring(i);
        else
          ret[1] = "";
      } catch (NumberFormatException e) {
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
   * @return array containing the remaining suffix of the first file as first
   * element<br/>
   * and the remaining suffix of the second file as second element<br>
   * (both file names if no common prefix exists)
   */
  public String[] discardCommonPrefix(String a, String b) {
    String[] ret = {a, b};
    int l = a.length() < b.length() ? a.length() : b.length();
    for (int i = 0; i < l; i++) {
      if (a.charAt(i) == b.charAt(i)) {
        if (i + 1 < l) {
          ret[0] = a.substring(i + 1);
          ret[1] = b.substring(i + 1);
        } else {
          if (a.length() < b.length()) {
            ret[0] = "";
            ret[1] = b.substring(i + 1);
          }
          if (a.length() == b.length()) {
            ret[0] = "";
            ret[1] = "";
          }
          if (a.length() > b.length()) {
            ret[0] = a.substring(i + 1);
            ret[1] = "";
          }
        }
      } else
        break;
    }
    return ret;
  }

}
