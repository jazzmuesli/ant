/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:22:17 GMT 2020
 */

package org.apache.tools.ant.util.regexp;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tools.ant.util.regexp.RegexpUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegexpUtil_ESTest extends RegexpUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = RegexpUtil.removeFlag(0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = RegexpUtil.hasFlag(0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegexpUtil regexpUtil0 = new RegexpUtil();
  }
}