/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:46:33 GMT 2020
 */

package org.apache.tools.ant.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tools.ant.util.IdentityMapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IdentityMapper_ESTest extends IdentityMapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IdentityMapper identityMapper0 = new IdentityMapper();
      identityMapper0.setTo("de");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IdentityMapper identityMapper0 = new IdentityMapper();
      identityMapper0.setFrom("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IdentityMapper identityMapper0 = new IdentityMapper();
      String[] stringArray0 = identityMapper0.mapFileName("");
      assertEquals(1, stringArray0.length);
  }
}
