/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:46:21 GMT 2020
 */

package org.apache.tools.ant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.PrintStream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Diagnostics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Diagnostics_ESTest extends Diagnostics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Diagnostics.validateVersion();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File[] fileArray0 = Diagnostics.listLibraries();
      assertNull(fileArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = Diagnostics.isOptionalAvailable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        Diagnostics.main(stringArray0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Could not load the version information.
         //
         verifyException("org.apache.tools.ant.Main", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Diagnostics.doReport(printStream0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Could not load the version information.
         //
         verifyException("org.apache.tools.ant.Main", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        Diagnostics.doReport((PrintStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Diagnostics", e);
      }
  }
}