/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:39:58 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.junit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.taskdefs.optional.junit.Xalan1Executor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Xalan1Executor_ESTest extends Xalan1Executor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Xalan1Executor xalan1Executor0 = new Xalan1Executor();
      // Undeclared exception!
      try { 
        xalan1Executor0.execute();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }
}