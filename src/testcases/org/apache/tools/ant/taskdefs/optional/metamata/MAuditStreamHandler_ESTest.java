/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:16:33 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.metamata;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.tools.ant.taskdefs.optional.metamata.MAudit;
import org.apache.tools.ant.taskdefs.optional.metamata.MAuditStreamHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MAuditStreamHandler_ESTest extends MAuditStreamHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MAudit mAudit0 = mock(MAudit.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      MAuditStreamHandler mAuditStreamHandler0 = new MAuditStreamHandler(mAudit0, outputStream0);
      BufferedReader bufferedReader0 = mock(BufferedReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(bufferedReader0).readLine();
      mAuditStreamHandler0.parseOutput(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MAudit mAudit0 = mock(MAudit.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      MAuditStreamHandler mAuditStreamHandler0 = new MAuditStreamHandler(mAudit0, outputStream0);
      OutputStream outputStream1 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      mAuditStreamHandler0.setProcessInputStream(outputStream1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MAuditStreamHandler.getDocumentBuilder();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MAudit mAudit0 = mock(MAudit.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      MAuditStreamHandler mAuditStreamHandler0 = new MAuditStreamHandler(mAudit0, outputStream0);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream1 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      mAuditStreamHandler0.createPump(inputStream0, outputStream1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MAudit mAudit0 = mock(MAudit.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      MAuditStreamHandler mAuditStreamHandler0 = new MAuditStreamHandler(mAudit0, outputStream0);
      // Undeclared exception!
      try { 
        mAuditStreamHandler0.stop();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.metamata.MAuditStreamHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MAudit mAudit0 = mock(MAudit.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      MAuditStreamHandler mAuditStreamHandler0 = new MAuditStreamHandler(mAudit0, outputStream0);
      // Undeclared exception!
      try { 
        mAuditStreamHandler0.start();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.metamata.MAuditStreamHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MAudit mAudit0 = mock(MAudit.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      MAuditStreamHandler mAuditStreamHandler0 = new MAuditStreamHandler(mAudit0, outputStream0);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      mAuditStreamHandler0.setProcessOutputStream(inputStream0);
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream1).read(any(byte[].class));
      mAuditStreamHandler0.setProcessErrorStream(inputStream1);
      try { 
        mAuditStreamHandler0.start();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MAudit mAudit0 = mock(MAudit.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      MAuditStreamHandler mAuditStreamHandler0 = new MAuditStreamHandler(mAudit0, outputStream0);
      // Undeclared exception!
      try { 
        mAuditStreamHandler0.setProcessOutputStream((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MAudit mAudit0 = mock(MAudit.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      MAuditStreamHandler mAuditStreamHandler0 = new MAuditStreamHandler(mAudit0, outputStream0);
      // Undeclared exception!
      try { 
        mAuditStreamHandler0.parseOutput((BufferedReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}