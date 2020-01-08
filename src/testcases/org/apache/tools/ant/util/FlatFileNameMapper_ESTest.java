/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 23:01:46 GMT 2020
 */

package org.apache.tools.ant.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.util.FlatFileNameMapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FlatFileNameMapper_ESTest extends FlatFileNameMapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FlatFileNameMapper flatFileNameMapper0 = new FlatFileNameMapper();
      String[] stringArray0 = flatFileNameMapper0.mapFileName("");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FlatFileNameMapper flatFileNameMapper0 = new FlatFileNameMapper();
      flatFileNameMapper0.setTo("-%-6_C");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FlatFileNameMapper flatFileNameMapper0 = new FlatFileNameMapper();
      flatFileNameMapper0.setFrom("-%-6_C");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FlatFileNameMapper flatFileNameMapper0 = new FlatFileNameMapper();
      // Undeclared exception!
      try { 
        flatFileNameMapper0.mapFileName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }
}