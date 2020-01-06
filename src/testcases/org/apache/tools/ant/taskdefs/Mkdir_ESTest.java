/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:59:20 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.Mkdir;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Mkdir_ESTest extends Mkdir_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Mkdir mkdir0 = new Mkdir();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(file0).exists();
      doReturn(false).when(file0).isFile();
      mkdir0.setDir(file0);
      mkdir0.execute();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Mkdir mkdir0 = new Mkdir();
      try { 
        mkdir0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // dir attribute is required
         //
         verifyException("org.apache.tools.ant.taskdefs.Mkdir", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Mkdir mkdir0 = new Mkdir();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).exists();
      doReturn("").when(file0).getAbsolutePath();
      doReturn(false).when(file0).isFile();
      doReturn(true).when(file0).mkdirs();
      mkdir0.setDir(file0);
      // Undeclared exception!
      try { 
        mkdir0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }
}
