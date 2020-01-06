/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:32:30 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.perforce;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Submit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class P4Submit_ESTest extends P4Submit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      P4Submit p4Submit0 = new P4Submit();
      P4Submit.P4SubmitAdapter p4Submit_P4SubmitAdapter0 = p4Submit0.new P4SubmitAdapter();
      // Undeclared exception!
      try { 
        p4Submit_P4SubmitAdapter0.process("b4zGwo:/#Pu;&");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      P4Submit p4Submit0 = new P4Submit();
      try { 
        p4Submit0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // No change specified (no support for default change yet....
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.perforce.P4Submit", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      P4Submit p4Submit0 = new P4Submit();
      p4Submit0.setFailonerror(false);
      p4Submit0.setChange("u=");
      // Undeclared exception!
      try { 
        p4Submit0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }
}
