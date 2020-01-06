/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:57:04 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.junit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.OutputStream;
import org.apache.tools.ant.taskdefs.optional.junit.JUnitTest;
import org.apache.tools.ant.taskdefs.optional.junit.SummaryJUnitResultFormatter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SummaryJUnitResultFormatter_ESTest extends SummaryJUnitResultFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SummaryJUnitResultFormatter summaryJUnitResultFormatter0 = new SummaryJUnitResultFormatter();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      summaryJUnitResultFormatter0.setOutput(outputStream0);
      JUnitTest jUnitTest0 = mock(JUnitTest.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(jUnitTest0).errorCount();
      doReturn(0L).when(jUnitTest0).failureCount();
      doReturn(0L).when(jUnitTest0).getRunTime();
      doReturn(0L).when(jUnitTest0).runCount();
      summaryJUnitResultFormatter0.endTestSuite(jUnitTest0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SummaryJUnitResultFormatter summaryJUnitResultFormatter0 = new SummaryJUnitResultFormatter();
      JUnitTest jUnitTest0 = mock(JUnitTest.class, new ViolatedAssumptionAnswer());
      summaryJUnitResultFormatter0.startTestSuite(jUnitTest0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SummaryJUnitResultFormatter summaryJUnitResultFormatter0 = new SummaryJUnitResultFormatter();
      summaryJUnitResultFormatter0.setWithOutAndErr(false);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SummaryJUnitResultFormatter summaryJUnitResultFormatter0 = new SummaryJUnitResultFormatter();
      summaryJUnitResultFormatter0.setSystemOutput("");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SummaryJUnitResultFormatter summaryJUnitResultFormatter0 = new SummaryJUnitResultFormatter();
      summaryJUnitResultFormatter0.setSystemError((String) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SummaryJUnitResultFormatter summaryJUnitResultFormatter0 = new SummaryJUnitResultFormatter();
      JUnitTest jUnitTest0 = mock(JUnitTest.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(jUnitTest0).errorCount();
      doReturn(0L).when(jUnitTest0).failureCount();
      doReturn(0L).when(jUnitTest0).getRunTime();
      doReturn(0L).when(jUnitTest0).runCount();
      // Undeclared exception!
      try { 
        summaryJUnitResultFormatter0.endTestSuite(jUnitTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.junit.SummaryJUnitResultFormatter", e);
      }
  }
}
