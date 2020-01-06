/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:25:31 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.Ear;
import org.apache.tools.ant.types.ZipFileSet;
import org.apache.tools.zip.ZipOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Ear_ESTest extends Ear_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Ear ear0 = new Ear();
      ZipFileSet zipFileSet0 = mock(ZipFileSet.class, new ViolatedAssumptionAnswer());
      ear0.addArchives(zipFileSet0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Ear ear0 = new Ear();
      ear0.setEarfile((File) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Ear ear0 = new Ear();
      ear0.cleanUp();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Ear ear0 = new Ear();
      // Undeclared exception!
      try { 
        ear0.zipFile((File) null, (ZipOutputStream) null, "", 294);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Zip", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Ear ear0 = new Ear();
      // Undeclared exception!
      try { 
        ear0.setAppxml((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Ear", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Ear ear0 = new Ear();
      try { 
        ear0.initZipOutputStream((ZipOutputStream) null);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // appxml attribute is required
         //
         verifyException("org.apache.tools.ant.taskdefs.Ear", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Ear ear0 = new Ear();
      // Undeclared exception!
      try { 
        ear0.addArchives((ZipFileSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Ear", e);
      }
  }
}
