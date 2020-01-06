/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:56:09 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.ANTLR;
import org.apache.tools.ant.types.Commandline;
import org.apache.tools.ant.types.Path;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ANTLR_ESTest extends ANTLR_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      aNTLR0.setTraceTreeWalker(false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      aNTLR0.setTraceParser(false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      aNTLR0.setTraceLexer(true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      aNTLR0.setTrace(false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      aNTLR0.setHtml(false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      aNTLR0.setGlib(")^`Adz'lfB`EI]7e54");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      aNTLR0.setFork(true);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      aNTLR0.setDir(file0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      aNTLR0.setDiagnostic(false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      Commandline.Argument commandline_Argument0 = aNTLR0.createJvmarg();
      assertNotNull(commandline_Argument0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      Path path0 = aNTLR0.createClasspath();
      assertNotNull(path0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).toString();
      // Undeclared exception!
      try { 
        aNTLR0.setTarget(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).toString();
      // Undeclared exception!
      try { 
        aNTLR0.setOutputdirectory(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      // Undeclared exception!
      try { 
        aNTLR0.setDebug(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      // Undeclared exception!
      try { 
        aNTLR0.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      try { 
        aNTLR0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Invalid target: null
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.ANTLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ANTLR aNTLR0 = new ANTLR();
      // Undeclared exception!
      try { 
        aNTLR0.addClasspathEntry("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }
}
