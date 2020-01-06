/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:41:24 GMT 2020
 */

package org.apache.tools.ant.taskdefs.condition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.condition.Equals;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Equals_ESTest extends Equals_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Equals equals0 = new Equals();
      equals0.setTrim(false);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Equals equals0 = new Equals();
      equals0.setCasesensitive(true);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Equals equals0 = new Equals();
      equals0.setArg2("eZ7");
      equals0.setArg1("eZ7");
      boolean boolean0 = equals0.eval();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Equals equals0 = new Equals();
      try { 
        equals0.eval();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // both arg1 and arg2 are required in equals
         //
         verifyException("org.apache.tools.ant.taskdefs.condition.Equals", e);
      }
  }
}
