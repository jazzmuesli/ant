/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:26:36 GMT 2020
 */

package org.apache.tools.ant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.Location;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xml.sax.Locator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Location_ESTest extends Location_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locator locator0 = mock(Locator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(locator0).getColumnNumber();
      doReturn(0).when(locator0).getLineNumber();
      doReturn((String) null).when(locator0).getSystemId();
      Location location0 = new Location(locator0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Location location0 = new Location("X#}", (-1691), (-1691));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Location location0 = new Location("");
      String string0 = location0.toString();
      assertEquals(": ", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Location location0 = null;
      try {
        location0 = new Location((Locator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Location", e);
      }
  }
}