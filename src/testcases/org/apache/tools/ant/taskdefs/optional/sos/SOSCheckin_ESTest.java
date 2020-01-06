/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:24:07 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.sos;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.sos.SOSCheckin;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SOSCheckin_ESTest extends SOSCheckin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SOSCheckin sOSCheckin0 = new SOSCheckin();
      sOSCheckin0.setRecursive(false);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SOSCheckin sOSCheckin0 = new SOSCheckin();
      sOSCheckin0.setFile("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SOSCheckin sOSCheckin0 = new SOSCheckin();
      sOSCheckin0.setComment((String) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SOSCheckin sOSCheckin0 = new SOSCheckin();
      // Undeclared exception!
      try { 
        sOSCheckin0.buildCmdLine();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // sosserverpath attribute must be set!
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.sos.SOS", e);
      }
  }
}
