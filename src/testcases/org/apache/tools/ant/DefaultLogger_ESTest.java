/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:23:10 GMT 2020
 */

package org.apache.tools.ant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintStream;
import org.apache.tools.ant.BuildEvent;
import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Target;
import org.apache.tools.ant.Task;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultLogger_ESTest extends DefaultLogger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      BuildEvent buildEvent0 = mock(BuildEvent.class, new ViolatedAssumptionAnswer());
      defaultLogger0.targetStarted(buildEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      defaultLogger0.msgOutputLevel = (-332);
      BuildEvent buildEvent0 = mock(BuildEvent.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(buildEvent0).getPriority();
      defaultLogger0.messageLogged(buildEvent0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      BuildEvent buildEvent0 = mock(BuildEvent.class, new ViolatedAssumptionAnswer());
      defaultLogger0.taskStarted(buildEvent0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      defaultLogger0.taskFinished((BuildEvent) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      defaultLogger0.targetFinished((BuildEvent) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      defaultLogger0.setEmacsMode(false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      defaultLogger0.log("");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = DefaultLogger.formatTime(0L);
      assertEquals("0 seconds", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      defaultLogger0.buildStarted((BuildEvent) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      defaultLogger0.setMessageOutputLevel(2183);
      BuildEvent buildEvent0 = mock(BuildEvent.class, new ViolatedAssumptionAnswer());
      doReturn((Target) null).when(buildEvent0).getTarget();
      // Undeclared exception!
      try { 
        defaultLogger0.targetStarted(buildEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.DefaultLogger", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      // Undeclared exception!
      try { 
        defaultLogger0.setOutputPrintStream((PrintStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Null output stream
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      // Undeclared exception!
      try { 
        defaultLogger0.setErrorPrintStream((PrintStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Null output stream
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      // Undeclared exception!
      try { 
        defaultLogger0.printMessage("", (PrintStream) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.DefaultLogger", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      BuildEvent buildEvent0 = mock(BuildEvent.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(buildEvent0).getMessage();
      doReturn(0).when(buildEvent0).getPriority();
      doReturn((Task) null).when(buildEvent0).getTask();
      // Undeclared exception!
      try { 
        defaultLogger0.messageLogged(buildEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.DefaultLogger", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger();
      BuildEvent buildEvent0 = mock(BuildEvent.class, new ViolatedAssumptionAnswer());
      doReturn((Throwable) null).when(buildEvent0).getException();
      // Undeclared exception!
      try { 
        defaultLogger0.buildFinished(buildEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.DefaultLogger", e);
      }
  }
}