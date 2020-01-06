/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:45:59 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.OutputStream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.BZip2;
import org.apache.tools.ant.taskdefs.GZip;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Pack_ESTest extends Pack_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BZip2 bZip2_0 = new BZip2();
      bZip2_0.setZipfile((File) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GZip gZip0 = new GZip();
      gZip0.setSrc((File) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BZip2 bZip2_0 = new BZip2();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        bZip2_0.zipFile((File) null, outputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name can't be null
         //
         verifyException("java.io.FilePermission", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BZip2 bZip2_0 = new BZip2();
      try { 
        bZip2_0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // zipfile attribute is required
         //
         verifyException("org.apache.tools.ant.taskdefs.Pack", e);
      }
  }
}
