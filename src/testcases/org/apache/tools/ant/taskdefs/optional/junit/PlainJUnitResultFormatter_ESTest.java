/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:30:10 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.junit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.OutputStream;
import org.apache.tools.ant.taskdefs.optional.junit.JUnitTest;
import org.apache.tools.ant.taskdefs.optional.junit.PlainJUnitResultFormatter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlainJUnitResultFormatter_ESTest extends PlainJUnitResultFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlainJUnitResultFormatter plainJUnitResultFormatter0 = new PlainJUnitResultFormatter();
      JUnitTest jUnitTest0 = mock(JUnitTest.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(jUnitTest0).errorCount();
      doReturn(0L).when(jUnitTest0).failureCount();
      doReturn((String) null).when(jUnitTest0).getName();
      doReturn(0L).when(jUnitTest0).getRunTime();
      doReturn(0L).when(jUnitTest0).runCount();
      plainJUnitResultFormatter0.endTestSuite(jUnitTest0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlainJUnitResultFormatter plainJUnitResultFormatter0 = new PlainJUnitResultFormatter();
      JUnitTest jUnitTest0 = mock(JUnitTest.class, new ViolatedAssumptionAnswer());
      plainJUnitResultFormatter0.startTestSuite(jUnitTest0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PlainJUnitResultFormatter plainJUnitResultFormatter0 = new PlainJUnitResultFormatter();
      plainJUnitResultFormatter0.setSystemOutput((String) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PlainJUnitResultFormatter plainJUnitResultFormatter0 = new PlainJUnitResultFormatter();
      plainJUnitResultFormatter0.setSystemError("");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PlainJUnitResultFormatter plainJUnitResultFormatter0 = new PlainJUnitResultFormatter();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      plainJUnitResultFormatter0.setOutput(outputStream0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PlainJUnitResultFormatter plainJUnitResultFormatter0 = new PlainJUnitResultFormatter();
      // Undeclared exception!
      try { 
        plainJUnitResultFormatter0.endTestSuite((JUnitTest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.junit.PlainJUnitResultFormatter", e);
      }
  }
}
