/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:09:26 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.ssh;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jcraft.jsch.Session;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.tools.ant.taskdefs.optional.ssh.LogListener;
import org.apache.tools.ant.taskdefs.optional.ssh.ScpFromMessage;
import org.apache.tools.ant.taskdefs.optional.ssh.ScpToMessage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractSshMessage_ESTest extends AbstractSshMessage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      ScpToMessage scpToMessage0 = new ScpToMessage((Session) null, file0, (String) null);
      File file1 = scpToMessage0.getLocalFile();
      ScpFromMessage scpFromMessage0 = new ScpFromMessage((Session) null, (String) null, file1, false);
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      scpFromMessage0.sendAck(outputStream0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      ScpFromMessage scpFromMessage0 = new ScpFromMessage((Session) null, "z_p#Yi", file0, true);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read();
      scpFromMessage0.waitForAck(inputStream0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      ScpFromMessage scpFromMessage0 = new ScpFromMessage((Session) null, "BNrINSH'.s\"=R~", file0, false);
      scpFromMessage0.setLogListener((LogListener) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      ScpFromMessage scpFromMessage0 = new ScpFromMessage((Session) null, "z_p#Yi", file0, true);
      scpFromMessage0.logStats(0L, 0L, (-414));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      ScpToMessage scpToMessage0 = new ScpToMessage((Session) null, file0, "BGrYJ)}X};;ZH");
      scpToMessage0.log("D-");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ScpFromMessage scpFromMessage0 = new ScpFromMessage((Session) null, "7{[ F!FPjg", (File) null, true);
      // Undeclared exception!
      try { 
        scpFromMessage0.sendAck((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.ssh.AbstractSshMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      ScpFromMessage scpFromMessage0 = new ScpFromMessage((Session) null, "com.jcraft.jsch.ChannelExec", file0, true);
      // Undeclared exception!
      try { 
        scpFromMessage0.openExecChannel("com.jcraft.jsch.ChannelExec");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.ssh.AbstractSshMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      ScpToMessage scpToMessage0 = new ScpToMessage((Session) null, file0, "");
      // Undeclared exception!
      try { 
        scpToMessage0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.ssh.AbstractSshMessage", e);
      }
  }
}
