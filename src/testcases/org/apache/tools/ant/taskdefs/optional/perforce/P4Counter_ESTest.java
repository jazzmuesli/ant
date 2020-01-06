/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:52:00 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.perforce;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Counter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class P4Counter_ESTest extends P4Counter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      P4Counter p4Counter0 = new P4Counter();
      p4Counter0.setValue(2512);
      assertFalse(p4Counter0.shouldSetProperty);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      P4Counter p4Counter0 = new P4Counter();
      p4Counter0.setProperty("1k\"*l%Y'AYi&A{cO");
      assertFalse(p4Counter0.shouldSetValue);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      P4Counter p4Counter0 = new P4Counter();
      p4Counter0.setName("1k\"*l%Y'AYi&A{cO");
      assertFalse(p4Counter0.shouldSetProperty);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      P4Counter p4Counter0 = new P4Counter();
      try { 
        p4Counter0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // No counter specified to retrieve
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.perforce.P4Counter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      P4Counter p4Counter0 = new P4Counter();
      p4Counter0.counter = "1k\"*l%Y'AYi&A{cO";
      p4Counter0.setFailonerror(false);
      // Undeclared exception!
      try { 
        p4Counter0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }
}
