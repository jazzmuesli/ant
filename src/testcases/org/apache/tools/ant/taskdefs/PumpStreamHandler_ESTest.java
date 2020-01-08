/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:21:08 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.tools.ant.taskdefs.PumpStreamHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PumpStreamHandler_ESTest extends PumpStreamHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      PumpStreamHandler pumpStreamHandler0 = new PumpStreamHandler(outputStream0);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = true;
      pumpStreamHandler0.createPump(inputStream1, (OutputStream) null, true);
      InputStream inputStream2 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createPump(inputStream2, (OutputStream) null, true);
      OutputStream outputStream1 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createPump(inputStream0, outputStream1);
      InputStream inputStream3 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream3).read(any(byte[].class));
      InputStream inputStream4 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.setProcessErrorStream(inputStream4);
      pumpStreamHandler0.setProcessErrorStream(inputStream3);
      InputStream inputStream5 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createProcessOutputPump(inputStream5, (OutputStream) null);
      InputStream inputStream6 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream6).read(any(byte[].class));
      pumpStreamHandler0.setProcessOutputStream(inputStream6);
      pumpStreamHandler0.start();
      // Undeclared exception!
      try { 
        pumpStreamHandler0.start();
        fail("Expecting exception: IllegalThreadStateException");
      
      } catch(IllegalThreadStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputStream outputStream0 = null;
      PumpStreamHandler pumpStreamHandler0 = new PumpStreamHandler((OutputStream) null);
      // Undeclared exception!
      try { 
        pumpStreamHandler0.setProcessInputStream((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.PumpStreamHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      PumpStreamHandler pumpStreamHandler0 = new PumpStreamHandler(outputStream0, outputStream0);
      // Undeclared exception!
      try { 
        pumpStreamHandler0.start();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.PumpStreamHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputStream outputStream0 = null;
      PumpStreamHandler pumpStreamHandler0 = new PumpStreamHandler((OutputStream) null, (OutputStream) null);
      // Undeclared exception!
      try { 
        pumpStreamHandler0.stop();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.PumpStreamHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      PumpStreamHandler pumpStreamHandler0 = new PumpStreamHandler(outputStream0);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read(any(byte[].class));
      OutputStream outputStream1 = pumpStreamHandler0.getOut();
      pumpStreamHandler0.setProcessOutputStream(inputStream0);
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream1).read(any(byte[].class));
      InputStream inputStream2 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createProcessErrorPump(inputStream2, outputStream1);
      OutputStream outputStream2 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createProcessErrorPump(inputStream1, outputStream2);
      InputStream inputStream3 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.start();
      OutputStream outputStream3 = null;
      InputStream inputStream4 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream4).read(any(byte[].class));
      pumpStreamHandler0.setProcessOutputStream(inputStream4);
      InputStream inputStream5 = null;
      // Undeclared exception!
      try { 
        pumpStreamHandler0.start();
        fail("Expecting exception: IllegalThreadStateException");
      
      } catch(IllegalThreadStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      PumpStreamHandler pumpStreamHandler0 = new PumpStreamHandler(outputStream0, outputStream0, inputStream0);
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream1 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createProcessOutputPump(inputStream1, outputStream1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      PumpStreamHandler pumpStreamHandler0 = new PumpStreamHandler(outputStream0);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.setProcessOutputStream(inputStream0);
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream1 = null;
      pumpStreamHandler0.getErr();
      InputStream inputStream2 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.setProcessOutputStream(inputStream2);
      pumpStreamHandler0.createProcessErrorPump(inputStream1, (OutputStream) null);
      InputStream inputStream3 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream3).read(any(byte[].class));
      pumpStreamHandler0.setProcessErrorStream(inputStream3);
      InputStream inputStream4 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.setProcessOutputStream(inputStream4);
      OutputStream outputStream2 = pumpStreamHandler0.getOut();
      pumpStreamHandler0.stop();
      InputStream inputStream5 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream5).read(any(byte[].class));
      pumpStreamHandler0.createProcessOutputPump(inputStream5, outputStream2);
      pumpStreamHandler0.start();
      // Undeclared exception!
      try { 
        pumpStreamHandler0.start();
        fail("Expecting exception: IllegalThreadStateException");
      
      } catch(IllegalThreadStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PumpStreamHandler pumpStreamHandler0 = new PumpStreamHandler();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.setProcessOutputStream(inputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      PumpStreamHandler pumpStreamHandler0 = new PumpStreamHandler(outputStream0, outputStream0);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.setProcessErrorStream(inputStream0);
      OutputStream outputStream1 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.setProcessInputStream(outputStream1);
      OutputStream outputStream2 = pumpStreamHandler0.getErr();
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.setProcessOutputStream(inputStream1);
      pumpStreamHandler0.createProcessErrorPump((InputStream) null, outputStream2);
      pumpStreamHandler0.createProcessOutputPump((InputStream) null, outputStream2);
      pumpStreamHandler0.stop();
      InputStream inputStream2 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createProcessOutputPump(inputStream2, outputStream2);
      InputStream inputStream3 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createProcessErrorPump(inputStream3, outputStream2);
      pumpStreamHandler0.setProcessErrorStream((InputStream) null);
      pumpStreamHandler0.createPump((InputStream) null, outputStream2);
      pumpStreamHandler0.setProcessErrorStream((InputStream) null);
      pumpStreamHandler0.setProcessOutputStream((InputStream) null);
      pumpStreamHandler0.setProcessOutputStream((InputStream) null);
      pumpStreamHandler0.start();
      pumpStreamHandler0.setProcessErrorStream((InputStream) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PumpStreamHandler pumpStreamHandler0 = new PumpStreamHandler();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createPump(inputStream0, outputStream0, true);
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream1 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createPump(inputStream1, outputStream1);
      InputStream inputStream2 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.setProcessErrorStream(inputStream2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      PumpStreamHandler pumpStreamHandler0 = new PumpStreamHandler(outputStream0, outputStream0);
      OutputStream outputStream1 = pumpStreamHandler0.getOut();
      pumpStreamHandler0.setProcessInputStream(outputStream1);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createPump(inputStream0, outputStream1, false);
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createProcessErrorPump(inputStream1, outputStream1);
      InputStream inputStream2 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      InputStream inputStream3 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream3).read(any(byte[].class));
      pumpStreamHandler0.setProcessErrorStream(inputStream3);
      pumpStreamHandler0.createPump(inputStream2, outputStream1);
      pumpStreamHandler0.getErr();
      InputStream inputStream4 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream4).read(any(byte[].class));
      pumpStreamHandler0.setProcessOutputStream(inputStream4);
      pumpStreamHandler0.getOut();
      pumpStreamHandler0.stop();
      pumpStreamHandler0.start();
      InputStream inputStream5 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.setProcessErrorStream(inputStream5);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PumpStreamHandler pumpStreamHandler0 = new PumpStreamHandler();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      InputStream inputStream1 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createProcessErrorPump(inputStream1, outputStream0);
      OutputStream outputStream1 = null;
      pumpStreamHandler0.createProcessErrorPump(inputStream0, (OutputStream) null);
      InputStream inputStream2 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      pumpStreamHandler0.createPump(inputStream2, (OutputStream) null);
      // Undeclared exception!
      try { 
        pumpStreamHandler0.stop();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.PumpStreamHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      PumpStreamHandler pumpStreamHandler0 = new PumpStreamHandler(outputStream0);
      // Undeclared exception!
      try { 
        pumpStreamHandler0.start();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.PumpStreamHandler", e);
      }
  }
}