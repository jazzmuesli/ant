/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:50:15 GMT 2020
 */

package org.apache.tools.ant.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.types.Resource;
import org.apache.tools.ant.types.ZipScanner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZipScanner_ESTest extends ZipScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZipScanner zipScanner0 = new ZipScanner();
      Resource resource0 = zipScanner0.getResource("/Y;qD[>'UGX-x");
      assertNotNull(resource0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ZipScanner zipScanner0 = new ZipScanner();
      zipScanner0.setSrc((File) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZipScanner zipScanner0 = new ZipScanner();
      zipScanner0.init();
      boolean boolean0 = zipScanner0.match("oxLS:Sw<!F");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ZipScanner zipScanner0 = new ZipScanner();
      // Undeclared exception!
      try { 
        zipScanner0.match("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.DirectoryScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ZipScanner zipScanner0 = new ZipScanner();
      // Undeclared exception!
      try { 
        zipScanner0.getResource((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.util.FileUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ZipScanner zipScanner0 = new ZipScanner();
      // Undeclared exception!
      try { 
        zipScanner0.getIncludedFiles();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.DirectoryScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ZipScanner zipScanner0 = new ZipScanner();
      // Undeclared exception!
      try { 
        zipScanner0.getIncludedDirectories();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.DirectoryScanner", e);
      }
  }
}
