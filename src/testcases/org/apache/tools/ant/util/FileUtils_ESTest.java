/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:47:51 GMT 2020
 */

package org.apache.tools.ant.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.FilterSetCollection;
import org.apache.tools.ant.util.FileUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtils_ESTest extends FileUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileUtils fileUtils0 = new FileUtils();
      String string0 = fileUtils0.toURI("");
      assertEquals("file:", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileUtils fileUtils0 = new FileUtils();
      Method method0 = fileUtils0.getSetLastModified();
      assertEquals(1, method0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileUtils fileUtils0 = FileUtils.newFileUtils();
      // Undeclared exception!
      try { 
        fileUtils0.normalize("M");
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // M is not an absolute path
         //
         verifyException("org.apache.tools.ant.util.FileUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileUtils fileUtils0 = new FileUtils();
      // Undeclared exception!
      try { 
        fileUtils0.normalize((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.util.FileUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileUtils fileUtils0 = new FileUtils();
      // Undeclared exception!
      try { 
        fileUtils0.fromURI("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only handle file: URIs
         //
         verifyException("org.apache.tools.ant.util.FileUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileUtils fileUtils0 = FileUtils.newFileUtils();
      // Undeclared exception!
      try { 
        fileUtils0.copyFile("file:", "%oiT?UC$I.", (FilterSetCollection) null, true, false, "&.@p^m");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.util.FileUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FileUtils fileUtils0 = FileUtils.newFileUtils();
      // Undeclared exception!
      try { 
        fileUtils0.copyFile("", "", (FilterSetCollection) null, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.util.FileUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FileUtils fileUtils0 = new FileUtils();
      // Undeclared exception!
      try { 
        fileUtils0.copyFile("", "", (FilterSetCollection) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.util.FileUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FileUtils fileUtils0 = FileUtils.newFileUtils();
      FilterSetCollection filterSetCollection0 = mock(FilterSetCollection.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fileUtils0.copyFile("", "", filterSetCollection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.util.FileUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FileUtils fileUtils0 = FileUtils.newFileUtils();
      // Undeclared exception!
      try { 
        fileUtils0.copyFile("\"tV_xl", "\"tV_xl");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.util.FileUtils", e);
      }
  }
}