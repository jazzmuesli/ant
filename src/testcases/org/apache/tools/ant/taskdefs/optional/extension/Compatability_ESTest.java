/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:26:02 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.extension;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tools.ant.taskdefs.optional.extension.Compatability;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Compatability_ESTest extends Compatability_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compatability compatability0 = new Compatability("");
      String string0 = compatability0.toString();
      assertEquals("", string0);
  }
}
