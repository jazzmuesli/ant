/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:39:07 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.sos;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.sos.SOSCheckout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SOSCheckout_ESTest extends SOSCheckout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SOSCheckout sOSCheckout0 = new SOSCheckout();
      sOSCheckout0.setRecursive(true);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SOSCheckout sOSCheckout0 = new SOSCheckout();
      sOSCheckout0.setFile("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SOSCheckout sOSCheckout0 = new SOSCheckout();
      // Undeclared exception!
      try { 
        sOSCheckout0.buildCmdLine();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // sosserverpath attribute must be set!
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.sos.SOS", e);
      }
  }
}