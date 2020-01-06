/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:55:03 GMT 2020
 */

package org.apache.tools.ant.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.types.FlexInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FlexInteger_ESTest extends FlexInteger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FlexInteger flexInteger0 = new FlexInteger("3");
      String string0 = flexInteger0.toString();
      assertEquals("3", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FlexInteger flexInteger0 = new FlexInteger("3");
      int int0 = flexInteger0.intValue();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FlexInteger flexInteger0 = null;
      try {
        flexInteger0 = new FlexInteger("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Zero length string
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FlexInteger flexInteger0 = null;
      try {
        flexInteger0 = new FlexInteger((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Integer", e);
      }
  }
}
