/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:09:51 GMT 2020
 */

package org.apache.tools.ant.types.selectors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.types.selectors.DependSelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DependSelector_ESTest extends DependSelector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DependSelector dependSelector0 = new DependSelector();
      MockFile mockFile0 = new MockFile("", "");
      boolean boolean0 = dependSelector0.selectionTest(mockFile0, mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DependSelector dependSelector0 = new DependSelector();
      String string0 = dependSelector0.toString();
      assertEquals("{dependselector targetdir: NOT YET SET granularity: 0}", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DependSelector dependSelector0 = new DependSelector();
      // Undeclared exception!
      try { 
        dependSelector0.selectionTest((File) null, (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.selectors.SelectorUtils", e);
      }
  }
}