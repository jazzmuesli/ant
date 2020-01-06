/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:41:24 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import org.apache.tools.ant.taskdefs.optional.depend.constantpool.FloatCPInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FloatCPInfo_ESTest extends FloatCPInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FloatCPInfo floatCPInfo0 = new FloatCPInfo();
      String string0 = floatCPInfo0.toString();
      assertEquals("Float Constant Pool Entry: null", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FloatCPInfo floatCPInfo0 = new FloatCPInfo();
      floatCPInfo0.setValue(floatCPInfo0);
      // Undeclared exception!
      try { 
        floatCPInfo0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FloatCPInfo floatCPInfo0 = new FloatCPInfo();
      DataInputStream dataInputStream0 = mock(DataInputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        floatCPInfo0.read(dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
}
