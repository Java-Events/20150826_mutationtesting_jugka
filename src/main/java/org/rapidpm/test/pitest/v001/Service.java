package org.rapidpm.test.pitest.v001;

/**
 * Created by sven on 04.05.15.
 */
public class Service {
  public int add(int a, int b){
    if(a<2){
      return (a+b) * -1;
    } else {
      return a+b;
    }
  }


}
