/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:55:26 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.dotnet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.dotnet.DotnetResource;
import org.apache.tools.ant.taskdefs.optional.dotnet.JSharp;
import org.apache.tools.ant.taskdefs.optional.dotnet.NetCommand;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSharp_ESTest extends JSharp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JSharp jSharp0 = new JSharp();
      DotnetResource dotnetResource0 = mock(DotnetResource.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dotnetResource0).getCSharpStyleParameter();
      String string0 = jSharp0.createResourceParameter(dotnetResource0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSharp jSharp0 = new JSharp();
      jSharp0.setSecureScoping(false);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSharp jSharp0 = new JSharp();
      jSharp0.setPureJava(false);
      jSharp0.addCompilerSpecificOptions((NetCommand) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JSharp jSharp0 = new JSharp();
      jSharp0.setBaseAddress("");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JSharp jSharp0 = new JSharp();
      String string0 = jSharp0.getReferenceDelimiter();
      assertEquals(";", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JSharp jSharp0 = new JSharp();
      String string0 = jSharp0.getFileExtension();
      assertEquals(".jsl", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JSharp jSharp0 = new JSharp();
      String string0 = jSharp0.getCompilerExeName();
      assertEquals("vjc", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JSharp jSharp0 = new JSharp();
      try { 
        jSharp0.validate();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // DestFile was not specified
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.dotnet.JSharp", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JSharp jSharp0 = new JSharp();
      // Undeclared exception!
      try { 
        jSharp0.createResourceParameter((DotnetResource) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.dotnet.JSharp", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      JSharp jSharp0 = new JSharp();
      // Undeclared exception!
      try { 
        jSharp0.addCompilerSpecificOptions((NetCommand) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.dotnet.JSharp", e);
      }
  }
}
