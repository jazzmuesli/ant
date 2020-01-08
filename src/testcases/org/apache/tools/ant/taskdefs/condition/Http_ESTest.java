/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:17:25 GMT 2020
 */

package org.apache.tools.ant.taskdefs.condition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.condition.Http;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Http_ESTest extends Http_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Http http0 = new Http();
      http0.setUrl("l?v<adR|S>,5Q^T");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Http http0 = new Http();
      http0.setErrorsBeginAt(1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Http http0 = new Http();
      try { 
        http0.eval();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // No url specified in http condition
         //
         verifyException("org.apache.tools.ant.taskdefs.condition.Http", e);
      }
  }
}