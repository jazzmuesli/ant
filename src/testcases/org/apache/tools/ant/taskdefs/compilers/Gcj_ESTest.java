/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:54:28 GMT 2020
 */

package org.apache.tools.ant.taskdefs.compilers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.taskdefs.compilers.Gcj;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Gcj_ESTest extends Gcj_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Gcj gcj0 = new Gcj();
      // Undeclared exception!
      try { 
        gcj0.setupGCJCommand();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Gcj gcj0 = new Gcj();
      // Undeclared exception!
      try { 
        gcj0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.compilers.Gcj", e);
      }
  }
}
