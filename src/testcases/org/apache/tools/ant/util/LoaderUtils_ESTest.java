/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:59:48 GMT 2020
 */

package org.apache.tools.ant.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.util.LoaderUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LoaderUtils_ESTest extends LoaderUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = LoaderUtils.getResourceSource((ClassLoader) null, "aAv");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LoaderUtils.setContextClassLoader((ClassLoader) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = LoaderUtils.isContextLoaderAvailable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassLoader classLoader0 = LoaderUtils.getContextClassLoader();
      assertNotNull(classLoader0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Object> class0 = Object.class;
      File file0 = LoaderUtils.getClassSource(class0);
      assertEquals(1563475968000L, file0.lastModified());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LoaderUtils loaderUtils0 = new LoaderUtils();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        LoaderUtils.getResourceSource((ClassLoader) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        LoaderUtils.getResourceSource((ClassLoader) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only handle file: URIs
         //
         verifyException("org.apache.tools.ant.util.FileUtils", e);
      }
  }
}
