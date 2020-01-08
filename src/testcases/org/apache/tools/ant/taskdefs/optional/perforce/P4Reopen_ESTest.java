/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:12:29 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.perforce;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Reopen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class P4Reopen_ESTest extends P4Reopen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      P4Reopen p4Reopen0 = new P4Reopen();
      p4Reopen0.setToChange("");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      P4Reopen p4Reopen0 = new P4Reopen();
      // Undeclared exception!
      try { 
        p4Reopen0.setToChange((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.perforce.P4Reopen", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      P4Reopen p4Reopen0 = new P4Reopen();
      try { 
        p4Reopen0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Problem exec'ing P4 command: null
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.perforce.P4Base", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      P4Reopen p4Reopen0 = new P4Reopen();
      p4Reopen0.setFailonerror(false);
      // Undeclared exception!
      try { 
        p4Reopen0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }
}