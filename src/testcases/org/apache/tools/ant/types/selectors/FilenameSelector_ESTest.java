/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:07:11 GMT 2020
 */

package org.apache.tools.ant.types.selectors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.Parameter;
import org.apache.tools.ant.types.selectors.FilenameSelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FilenameSelector_ESTest extends FilenameSelector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FilenameSelector filenameSelector0 = new FilenameSelector();
      filenameSelector0.setParameters((Parameter[]) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FilenameSelector filenameSelector0 = new FilenameSelector();
      filenameSelector0.setName("-nH");
      MockFile mockFile0 = new MockFile("-nH", "");
      boolean boolean0 = filenameSelector0.isSelected(mockFile0, " R}w{W)jVuukd4^X", mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FilenameSelector filenameSelector0 = new FilenameSelector();
      filenameSelector0.verifySettings();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FilenameSelector filenameSelector0 = new FilenameSelector();
      String string0 = filenameSelector0.toString();
      assertEquals("{filenameselector name: null negate: false casesensitive: true}", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FilenameSelector filenameSelector0 = new FilenameSelector();
      filenameSelector0.setNegate(true);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FilenameSelector filenameSelector0 = new FilenameSelector();
      filenameSelector0.setCasesensitive(true);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FilenameSelector filenameSelector0 = new FilenameSelector();
      Parameter[] parameterArray0 = new Parameter[2];
      // Undeclared exception!
      try { 
        filenameSelector0.setParameters(parameterArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.selectors.FilenameSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FilenameSelector filenameSelector0 = new FilenameSelector();
      // Undeclared exception!
      try { 
        filenameSelector0.setName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.selectors.FilenameSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FilenameSelector filenameSelector0 = new FilenameSelector();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        filenameSelector0.isSelected(file0, "", file0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // The name attribute is required
         //
         verifyException("org.apache.tools.ant.types.selectors.BaseSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FilenameSelector filenameSelector0 = new FilenameSelector();
      filenameSelector0.setName("");
      File file0 = MockFile.createTempFile("Ytq++FO>8(", "W");
      // Undeclared exception!
      try { 
        filenameSelector0.isSelected(file0, (String) null, file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.selectors.SelectorUtils", e);
      }
  }
}