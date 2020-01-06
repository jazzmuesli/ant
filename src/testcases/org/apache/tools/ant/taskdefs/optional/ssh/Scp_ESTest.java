/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:54:44 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.ssh;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.ssh.Scp;
import org.apache.tools.ant.types.FileSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Scp_ESTest extends Scp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Scp scp0 = new Scp();
      scp0.setFile("");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Scp scp0 = new Scp();
      scp0.init();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Scp scp0 = new Scp();
      try { 
        scp0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // The 'todir' attribute is required.
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.ssh.Scp", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Scp scp0 = new Scp();
      scp0.addFileset((FileSet) null);
      scp0.setFailonerror(false);
      scp0.setTodir("'~J{)clyoj1 i(");
      // Undeclared exception!
      try { 
        scp0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }
}
