/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:24:11 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.perforce;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.apache.tools.ant.taskdefs.optional.perforce.FStatP4OutputHandler;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Fstat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FStatP4OutputHandler_ESTest extends FStatP4OutputHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FStatP4OutputHandler fStatP4OutputHandler0 = new FStatP4OutputHandler((P4Fstat) null);
      ArrayList arrayList0 = fStatP4OutputHandler0.getNonExisting();
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FStatP4OutputHandler fStatP4OutputHandler0 = new FStatP4OutputHandler((P4Fstat) null);
      ArrayList arrayList0 = fStatP4OutputHandler0.getExisting();
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FStatP4OutputHandler fStatP4OutputHandler0 = new FStatP4OutputHandler((P4Fstat) null);
      // Undeclared exception!
      try { 
        fStatP4OutputHandler0.process("xDCiCm");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.perforce.FStatP4OutputHandler", e);
      }
  }
}