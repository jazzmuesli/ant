/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:06:32 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.dotnet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.Hashtable;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.taskdefs.optional.dotnet.NetCommand;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NetCommand_ESTest extends NetCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Project project1 = mock(Project.class, new ViolatedAssumptionAnswer());
      doReturn((File) null).when(project1).getBaseDir();
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      doReturn(project0, project1, project1).when(task0).getProject();
      NetCommand netCommand0 = new NetCommand(task0, "", "");
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      DirectoryScanner directoryScanner0 = mock(DirectoryScanner.class, new ViolatedAssumptionAnswer());
      doReturn(file0).when(directoryScanner0).getBasedir();
      doReturn(stringArray0).when(directoryScanner0).getIncludedFiles();
      int int0 = netCommand0.scanOneFileset(directoryScanner0, (Hashtable) null, 1L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      doReturn(project0, (Project) null).when(task0).getProject();
      NetCommand netCommand0 = null;
      try {
        netCommand0 = new NetCommand(task0, "V*]", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.dotnet.NetCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      doReturn(project0, (Project) null).when(task0).getProject();
      NetCommand netCommand0 = null;
      try {
        netCommand0 = new NetCommand(task0, "lK1UeNe@)ATCP1mw", "\"y)H^~q+Ad>J6T$;1t");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.dotnet.NetCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      doReturn(project0, (Project) null).when(task0).getProject();
      NetCommand netCommand0 = null;
      try {
        netCommand0 = new NetCommand(task0, (String) null, "V;#^f,X+Qr");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.dotnet.NetCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      doReturn(project0, (Project) null).when(task0).getProject();
      NetCommand netCommand0 = null;
      try {
        netCommand0 = new NetCommand(task0, "L4d(]3*'B?9[jDMv", "L4d(]3*'B?9[jDMv");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.dotnet.NetCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      doReturn(project0, (Project) null).when(task0).getProject();
      NetCommand netCommand0 = null;
      try {
        netCommand0 = new NetCommand(task0, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.dotnet.NetCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      doReturn(project0, (Project) null).when(task0).getProject();
      NetCommand netCommand0 = null;
      try {
        netCommand0 = new NetCommand(task0, (String) null, "V;#^f,X+Qr");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.dotnet.NetCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      doReturn(project0, (Project) null).when(task0).getProject();
      NetCommand netCommand0 = null;
      try {
        netCommand0 = new NetCommand(task0, "`G{(4A^ _Cc]90I/", "`G{(4A^ _Cc]90I/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.dotnet.NetCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      doReturn(project0, (Project) null).when(task0).getProject();
      NetCommand netCommand0 = null;
      try {
        netCommand0 = new NetCommand(task0, "L4d(]3*'B?9[jDMv", "L4d(]3*'B?9[jDMv");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.dotnet.NetCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Task task0 = mock(Task.class, new ViolatedAssumptionAnswer());
      doReturn((Project) null).when(task0).getProject();
      NetCommand netCommand0 = null;
      try {
        netCommand0 = new NetCommand(task0, "1Q", "I{^1IU';PdMx");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Owner has no project
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.dotnet.NetCommand", e);
      }
  }
}
