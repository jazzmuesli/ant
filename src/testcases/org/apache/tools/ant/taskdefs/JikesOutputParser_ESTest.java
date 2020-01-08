/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:15:27 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.taskdefs.JikesOutputParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JikesOutputParser_ESTest extends JikesOutputParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      JikesOutputParser jikesOutputParser0 = new JikesOutputParser(task0, false);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      jikesOutputParser0.setProcessOutputStream(inputStream0);
      BufferedReader bufferedReader0 = jikesOutputParser0.br;
      jikesOutputParser0.parseOutput(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      JikesOutputParser jikesOutputParser0 = new JikesOutputParser(task0, true);
      jikesOutputParser0.stop();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      JikesOutputParser jikesOutputParser0 = new JikesOutputParser(task0, true);
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      jikesOutputParser0.setProcessInputStream(outputStream0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      JikesOutputParser jikesOutputParser0 = new JikesOutputParser(task0, true);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      jikesOutputParser0.setProcessErrorStream(inputStream0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      JikesOutputParser jikesOutputParser0 = new JikesOutputParser(task0, true);
      boolean boolean0 = jikesOutputParser0.getErrorFlag();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      JikesOutputParser jikesOutputParser0 = new JikesOutputParser(task0, false);
      // Undeclared exception!
      try { 
        jikesOutputParser0.start();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.JikesOutputParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      JikesOutputParser jikesOutputParser0 = new JikesOutputParser(task0, true);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      jikesOutputParser0.setProcessOutputStream(inputStream0);
      try { 
        jikesOutputParser0.start();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      JikesOutputParser jikesOutputParser0 = new JikesOutputParser(task0, false);
      // Undeclared exception!
      try { 
        jikesOutputParser0.setProcessOutputStream((InputStream) null);
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
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      JikesOutputParser jikesOutputParser0 = new JikesOutputParser(task0, true);
      // Undeclared exception!
      try { 
        jikesOutputParser0.parseOutput((BufferedReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.JikesOutputParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      JikesOutputParser jikesOutputParser0 = new JikesOutputParser(task0, true);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      jikesOutputParser0.setProcessOutputStream(inputStream0);
      BufferedReader bufferedReader0 = jikesOutputParser0.br;
      try { 
        jikesOutputParser0.parseOutput(bufferedReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }
}