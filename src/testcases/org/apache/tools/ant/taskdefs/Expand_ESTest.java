/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:57:23 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.InputStream;
import java.util.Date;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.taskdefs.Expand;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.PatternSet;
import org.apache.tools.ant.util.FileUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Expand_ESTest extends Expand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expand expand0 = new Expand();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "U^;";
      stringArray0[3] = "";
      stringArray0[4] = "";
      PatternSet patternSet0 = mock(PatternSet.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(patternSet0).getIncludePatterns(any(org.apache.tools.ant.Project.class));
      expand0.addPatternset(patternSet0);
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      expand0.extractFile((FileUtils) null, file0, file0, inputStream0, "7-HO)#^P%p4@", date0, false);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expand expand0 = new Expand();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      expand0.setSrc(file0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expand expand0 = new Expand();
      expand0.setOverwrite(false);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expand expand0 = new Expand();
      FileUtils fileUtils0 = mock(FileUtils.class, new ViolatedAssumptionAnswer());
      doReturn((File) null).when(fileUtils0).resolveFile(any(java.io.File.class) , anyString());
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        expand0.extractFile(fileUtils0, file0, file0, inputStream0, "2vJZxhZt6d_[", date0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expand expand0 = new Expand();
      FileUtils fileUtils0 = mock(FileUtils.class, new ViolatedAssumptionAnswer());
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(file0).toString();
      // Undeclared exception!
      try { 
        expand0.expandFile(fileUtils0, file0, file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Expand expand0 = new Expand();
      try { 
        expand0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // src attribute and/or filesets must be specified
         //
         verifyException("org.apache.tools.ant.taskdefs.Expand", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expand expand0 = new Expand();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).exists();
      expand0.setDest(file0);
      FileSet fileSet0 = mock(FileSet.class, new ViolatedAssumptionAnswer());
      doReturn((File) null).when(fileSet0).getDir(any(org.apache.tools.ant.Project.class));
      doReturn((DirectoryScanner) null).when(fileSet0).getDirectoryScanner(any(org.apache.tools.ant.Project.class));
      expand0.addFileset(fileSet0);
      // Undeclared exception!
      try { 
        expand0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Expand", e);
      }
  }
}