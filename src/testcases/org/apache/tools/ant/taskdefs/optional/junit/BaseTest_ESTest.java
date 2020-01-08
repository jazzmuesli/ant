/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:59:18 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.junit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.optional.junit.BatchTest;
import org.apache.tools.ant.taskdefs.optional.junit.FormatterElement;
import org.apache.tools.ant.taskdefs.optional.junit.JUnitTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseTest_ESTest extends BaseTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JUnitTest jUnitTest0 = new JUnitTest((String) null);
      FormatterElement formatterElement0 = mock(FormatterElement.class, new ViolatedAssumptionAnswer());
      jUnitTest0.addFormatter(formatterElement0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JUnitTest jUnitTest0 = new JUnitTest();
      jUnitTest0.setUnless((String) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JUnitTest jUnitTest0 = new JUnitTest((String) null);
      jUnitTest0.setTodir((File) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      BatchTest batchTest0 = new BatchTest(project0);
      batchTest0.setIf("");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JUnitTest jUnitTest0 = new JUnitTest();
      jUnitTest0.setHaltonfailure(false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JUnitTest jUnitTest0 = new JUnitTest();
      jUnitTest0.setHaltonerror(true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BatchTest batchTest0 = new BatchTest((Project) null);
      batchTest0.setFork(false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      BatchTest batchTest0 = new BatchTest(project0);
      batchTest0.setFiltertrace(false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      BatchTest batchTest0 = new BatchTest(project0);
      batchTest0.setFailureProperty((String) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BatchTest batchTest0 = new BatchTest((Project) null);
      batchTest0.setErrorProperty("");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BatchTest batchTest0 = new BatchTest((Project) null);
      String string0 = batchTest0.getTodir();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BatchTest batchTest0 = new BatchTest((Project) null);
      boolean boolean0 = batchTest0.getHaltonfailure();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JUnitTest jUnitTest0 = new JUnitTest((String) null);
      boolean boolean0 = jUnitTest0.getHaltonerror();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BatchTest batchTest0 = new BatchTest((Project) null);
      boolean boolean0 = batchTest0.getFork();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BatchTest batchTest0 = new BatchTest((Project) null);
      boolean boolean0 = batchTest0.getFiltertrace();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BatchTest batchTest0 = new BatchTest((Project) null);
      String string0 = batchTest0.getFailureProperty();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JUnitTest jUnitTest0 = new JUnitTest();
      String string0 = jUnitTest0.getErrorProperty();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      BatchTest batchTest0 = new BatchTest(project0);
      batchTest0.formatters = null;
      FormatterElement formatterElement0 = mock(FormatterElement.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        batchTest0.addFormatter(formatterElement0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.junit.BaseTest", e);
      }
  }
}