/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:11:14 GMT 2020
 */

package org.apache.tools.ant.filters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.Reader;
import org.apache.tools.ant.filters.ExpandProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExpandProperties_ESTest extends ExpandProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExpandProperties expandProperties0 = new ExpandProperties();
      Reader reader0 = expandProperties0.chain(expandProperties0);
      assertNotSame(reader0, expandProperties0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExpandProperties expandProperties0 = new ExpandProperties();
      ExpandProperties expandProperties1 = new ExpandProperties(expandProperties0);
      assertFalse(expandProperties1.equals((Object)expandProperties0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExpandProperties expandProperties0 = new ExpandProperties();
      try { 
        expandProperties0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExpandProperties expandProperties0 = new ExpandProperties();
      // Undeclared exception!
      try { 
        expandProperties0.chain((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ExpandProperties expandProperties0 = null;
      try {
        expandProperties0 = new ExpandProperties((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }
}
