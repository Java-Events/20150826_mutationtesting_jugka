package org.rapidpm.test.pitest.v001;

import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by sven on 04.05.15.
 */
public class ServiceTest {

  @Test
  public void testAdd001() throws Exception {
    final Service service = new Service();
    final int add = service.add(0, 0);
    Assertions.assertThat(add).isEqualTo(0);
  }

  //increasing code coverage -> 100 percent
  @Test
  public void testAdd004() throws Exception {
    final Service service = new Service();
    final int add = service.add(3, 0);
    Assertions.assertThat(add)
        .isPositive()
        .isEqualTo(3);
  }

  // added step 1
  @Test
  public void testAdd003() throws Exception {
    final Service service = new Service();
    final int add = service.add(2, 0);
    Assertions.assertThat(add)
        .isPositive()
        .isEqualTo(2);
  }


  // added step 2
  @Test
  public void testAdd002() throws Exception {
    final Service service = new Service();
    final int add = service.add(1, 0);
    Assertions.assertThat(add)
        .isNegative()
        .isEqualTo(-1);
  }

  // added step 3
  @Test
  public void testAdd005() throws Exception {
    final Service service = new Service();
    final int add = service.add(1, 1);
    Assertions.assertThat(add)
        .isNegative()
        .isEqualTo(-2);
  }
  // added step 4
  @Test
  public void testAdd006() throws Exception {
    final Service service = new Service();
    final int add = service.add(2, 2);
    Assertions.assertThat(add)
        .isPositive()
        .isEqualTo(4);
  }




}