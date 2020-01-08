/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:16:09 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.metamata;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.ExecuteStreamHandler;
import org.apache.tools.ant.taskdefs.optional.metamata.MMetrics;
import org.apache.tools.ant.types.Path;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MMetrics_ESTest extends MMetrics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MMetrics mMetrics0 = new MMetrics();
      MMetrics.GranularityAttribute mMetrics_GranularityAttribute0 = new MMetrics.GranularityAttribute();
      mMetrics0.setGranularity(mMetrics_GranularityAttribute0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MMetrics.GranularityAttribute mMetrics_GranularityAttribute0 = new MMetrics.GranularityAttribute();
      String[] stringArray0 = mMetrics_GranularityAttribute0.getValues();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MMetrics mMetrics0 = new MMetrics();
      mMetrics0.setTofile((File) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MMetrics mMetrics0 = new MMetrics();
      Path path0 = mMetrics0.createPath();
      assertNotNull(path0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MMetrics mMetrics0 = new MMetrics();
      mMetrics0.cleanUp();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MMetrics mMetrics0 = new MMetrics();
      // Undeclared exception!
      try { 
        mMetrics0.transformFile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name can't be null
         //
         verifyException("java.io.FilePermission", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MMetrics mMetrics0 = new MMetrics();
      // Undeclared exception!
      try { 
        mMetrics0.setGranularity((MMetrics.GranularityAttribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.metamata.MMetrics", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MMetrics mMetrics0 = new MMetrics();
      // Undeclared exception!
      try { 
        mMetrics0.getOptions();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.metamata.MMetrics", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MMetrics mMetrics0 = new MMetrics();
      ExecuteStreamHandler executeStreamHandler0 = mMetrics0.createStreamHandler();
      // Undeclared exception!
      try { 
        mMetrics0.execute0(executeStreamHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MMetrics mMetrics0 = new MMetrics();
      try { 
        mMetrics0.checkOptions();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // 'home' must point to Metamata home directory.
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.metamata.AbstractMetamataTask", e);
      }
  }
}