/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:04:35 GMT 2020
 */

package org.apache.tools.ant.util.facade;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tools.ant.util.facade.ImplementationSpecificArgument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ImplementationSpecificArgument_ESTest extends ImplementationSpecificArgument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImplementationSpecificArgument implementationSpecificArgument0 = new ImplementationSpecificArgument();
      implementationSpecificArgument0.setImplementation("");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ImplementationSpecificArgument implementationSpecificArgument0 = new ImplementationSpecificArgument();
      String[] stringArray0 = implementationSpecificArgument0.getParts("");
      assertNull(stringArray0);
  }
}
