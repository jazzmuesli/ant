/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:58:44 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.taskdefs.Execute;
import org.apache.tools.ant.taskdefs.ExecuteStreamHandler;
import org.apache.tools.ant.taskdefs.ExecuteWatchdog;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Execute_ESTest extends Execute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = mock(ByteArrayOutputStream.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(byteArrayOutputStream0).toString();
      String string0 = Execute.toString(byteArrayOutputStream0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExecuteStreamHandler executeStreamHandler0 = mock(ExecuteStreamHandler.class, new ViolatedAssumptionAnswer());
      Execute execute0 = new Execute(executeStreamHandler0);
      execute0.setWorkingDirectory((File) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Execute execute0 = new Execute();
      execute0.setNewenvironment(true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExecuteStreamHandler executeStreamHandler0 = mock(ExecuteStreamHandler.class, new ViolatedAssumptionAnswer());
      Execute execute0 = new Execute(executeStreamHandler0);
      execute0.setExitValue((-1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Execute execute0 = new Execute();
      execute0.setEnvironment((String[]) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExecuteStreamHandler executeStreamHandler0 = mock(ExecuteStreamHandler.class, new ViolatedAssumptionAnswer());
      Execute execute0 = new Execute(executeStreamHandler0);
      execute0.setCommandline((String[]) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExecuteStreamHandler executeStreamHandler0 = mock(ExecuteStreamHandler.class, new ViolatedAssumptionAnswer());
      Execute execute0 = new Execute(executeStreamHandler0);
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      execute0.setAntRun(project0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExecuteStreamHandler executeStreamHandler0 = mock(ExecuteStreamHandler.class, new ViolatedAssumptionAnswer());
      Execute execute0 = new Execute(executeStreamHandler0);
      boolean boolean0 = execute0.killedProcess();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector vector0 = Execute.getProcEnvironment();
      assertEquals(10, vector0.capacity());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Execute execute0 = new Execute();
      int int0 = execute0.getExitValue();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Execute execute0 = new Execute();
      String[] stringArray0 = execute0.getEnvironment();
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Execute execute0 = new Execute();
      String[] stringArray0 = execute0.getCommandline();
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExecuteStreamHandler executeStreamHandler0 = mock(ExecuteStreamHandler.class, new ViolatedAssumptionAnswer());
      Execute execute0 = new Execute(executeStreamHandler0);
      // Undeclared exception!
      try { 
        execute0.waitFor((Process) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Execute", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Execute.toString((ByteArrayOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Execute", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Execute execute0 = new Execute();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).getAbsolutePath();
      // Undeclared exception!
      try { 
        execute0.setWorkingDirectory(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Execute", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      doReturn((Project) null).when(task0).getProject();
      String[] stringArray0 = new String[1];
      try { 
        Execute.runCommand(task0, stringArray0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Unable to execute command
         //
         verifyException("org.apache.tools.ant.taskdefs.Execute$Java13CommandLauncher", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        Execute.runCommand((Task) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Execute", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[1];
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Execute.launch(project0, stringArray0, stringArray0, file0, true);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Unable to execute command
         //
         verifyException("org.apache.tools.ant.taskdefs.Execute$Java13CommandLauncher", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      doReturn("/9+\r&Q@.V^\"}49").when(project0).getProperty(anyString());
      doReturn((File) null).when(project0).resolveFile(anyString());
      String[] stringArray1 = new String[5];
      // Undeclared exception!
      try { 
        Execute.launch(project0, stringArray1, stringArray0, (File) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Execute$ScriptCommandLauncher", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(project0).getProperty(anyString());
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      try { 
        Execute.launch(project0, (String[]) null, (String[]) null, file0, false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot locate antRun script: Property 'ant.home' not found
         //
         verifyException("org.apache.tools.ant.taskdefs.Execute$ScriptCommandLauncher", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExecuteStreamHandler executeStreamHandler0 = mock(ExecuteStreamHandler.class, new ViolatedAssumptionAnswer());
      ExecuteWatchdog executeWatchdog0 = mock(ExecuteWatchdog.class, new ViolatedAssumptionAnswer());
      Execute execute0 = new Execute(executeStreamHandler0, executeWatchdog0);
      // Undeclared exception!
      try { 
        execute0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Unable to execute command
         //
         verifyException("org.apache.tools.ant.taskdefs.Execute$Java13CommandLauncher", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Execute execute0 = new Execute();
      execute0.setVMLauncher(false);
      // Undeclared exception!
      try { 
        execute0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.ProcessBuilder", e);
      }
  }
}
