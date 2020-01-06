/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:50:41 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.jdepend;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.ExecuteWatchdog;
import org.apache.tools.ant.taskdefs.optional.jdepend.JDependTask;
import org.apache.tools.ant.types.Commandline;
import org.apache.tools.ant.types.CommandlineJava;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.types.PatternSet;
import org.apache.tools.ant.types.Reference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDependTask_ESTest extends JDependTask_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      JDependTask.FormatAttribute jDependTask_FormatAttribute0 = new JDependTask.FormatAttribute();
      jDependTask0.setFormat(jDependTask_FormatAttribute0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      jDependTask0.createClassespath();
      jDependTask0.execute();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      CommandlineJava commandlineJava0 = mock(CommandlineJava.class, new ViolatedAssumptionAnswer());
      doReturn((Commandline.Argument) null).when(commandlineJava0).createVmArgument();
      Commandline.Argument commandline_Argument0 = jDependTask0.createJvmarg(commandlineJava0);
      assertNull(commandline_Argument0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDependTask.FormatAttribute jDependTask_FormatAttribute0 = new JDependTask.FormatAttribute();
      String[] stringArray0 = jDependTask_FormatAttribute0.getValues();
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      jDependTask0.setOutputFile((File) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      jDependTask0.setJvm("Tb;x2G");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      jDependTask0.setHaltonerror(true);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      jDependTask0.setDir((File) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      Path path0 = jDependTask0.getSourcespath();
      assertNull(path0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      File file0 = jDependTask0.getOutputFile();
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      boolean boolean0 = jDependTask0.getHaltonerror();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      boolean boolean0 = jDependTask0.getFork();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      PatternSet patternSet0 = jDependTask0.getExcludes();
      assertNotNull(patternSet0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      File file0 = jDependTask0.getDir();
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      Path path0 = jDependTask0.getClasspath();
      assertNull(path0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      Path path0 = jDependTask0.getClassespath();
      assertNull(path0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      CommandlineJava commandlineJava0 = mock(CommandlineJava.class, new ViolatedAssumptionAnswer());
      int int0 = jDependTask0.executeInVM(commandlineJava0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      ExecuteWatchdog executeWatchdog0 = jDependTask0.createWatchdog();
      assertNull(executeWatchdog0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      Path path0 = jDependTask0.createSourcespath();
      jDependTask0.setClasspath(path0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      PatternSet.NameEntry patternSet_NameEntry0 = jDependTask0.createExclude();
      assertNotNull(patternSet_NameEntry0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      Path path0 = jDependTask0.createClasspath();
      assertNotNull(path0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      // Undeclared exception!
      try { 
        jDependTask0.setFormat((JDependTask.FormatAttribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.jdepend.JDependTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      Reference reference0 = mock(Reference.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(reference0).getRefId();
      doReturn((Object) null, (Object) null).when(reference0).getReferencedObject(any(org.apache.tools.ant.Project.class));
      jDependTask0.setClasspathRef(reference0);
      CommandlineJava commandlineJava0 = mock(CommandlineJava.class, new ViolatedAssumptionAnswer());
      try { 
        jDependTask0.executeAsForked(commandlineJava0, (ExecuteWatchdog) null);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // null doesn't denote a path null
         //
         verifyException("org.apache.tools.ant.types.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      CommandlineJava commandlineJava0 = mock(CommandlineJava.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        jDependTask0.executeAsForked(commandlineJava0, (ExecuteWatchdog) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.jdepend.JDependTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      try { 
        jDependTask0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Missing classespath required argument
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.jdepend.JDependTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      jDependTask0.setFork(true);
      jDependTask0.createClassespath();
      // Undeclared exception!
      try { 
        jDependTask0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.jdepend.JDependTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JDependTask jDependTask0 = new JDependTask();
      // Undeclared exception!
      try { 
        jDependTask0.createJvmarg((CommandlineJava) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.jdepend.JDependTask", e);
      }
  }
}
