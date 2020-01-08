/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:48:39 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.NetRexxC;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NetRexxC_ESTest extends NetRexxC_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      NetRexxC.VerboseAttr netRexxC_VerboseAttr0 = new NetRexxC.VerboseAttr();
      netRexxC0.setVerbose(netRexxC_VerboseAttr0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      NetRexxC.TraceAttr netRexxC_TraceAttr0 = new NetRexxC.TraceAttr();
      netRexxC0.setTrace(netRexxC_TraceAttr0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NetRexxC.VerboseAttr netRexxC_VerboseAttr0 = new NetRexxC.VerboseAttr();
      String[] stringArray0 = netRexxC_VerboseAttr0.getValues();
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NetRexxC.TraceAttr netRexxC_TraceAttr0 = new NetRexxC.TraceAttr();
      String[] stringArray0 = netRexxC_TraceAttr0.getValues();
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setUtf8(false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setTime(true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setSymbols(false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setSuppressVariableNotUsed(true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setSuppressPrivatePropertyNotUsed(true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setSuppressMethodArgumentNotUsed(true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setSuppressExceptionNotSignalled(false);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setSuppressDeprecation(false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setStrictsignal(true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setStrictprops(false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setStrictimport(true);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setStrictcase(true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setStrictassign(false);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setStrictargs(true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setSrcDir((File) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setSourcedir(true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setSavelog(true);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setReplace(true);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setLogo(true);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setKeep(false);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setFormat(true);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setExplicit(true);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setDiag(false);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      netRexxC0.setDestDir(file0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setDecimal(true);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setCrossref(false);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setConsole(true);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setCompile(true);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setCompact(true);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setComments(false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setClasspath("YHI&X}kVkO5,(Q(");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      netRexxC0.setBinary(true);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      // Undeclared exception!
      try { 
        netRexxC0.setVerbose((NetRexxC.VerboseAttr) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.NetRexxC", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      // Undeclared exception!
      try { 
        netRexxC0.setVerbose("");
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         //  is not a legal value for this attribute
         //
         verifyException("org.apache.tools.ant.types.EnumeratedAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      // Undeclared exception!
      try { 
        netRexxC0.setTrace((NetRexxC.TraceAttr) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.NetRexxC", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      // Undeclared exception!
      try { 
        netRexxC0.setTrace((String) null);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // null is not a legal value for this attribute
         //
         verifyException("org.apache.tools.ant.types.EnumeratedAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      // Undeclared exception!
      try { 
        netRexxC0.setJava(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      // Undeclared exception!
      try { 
        netRexxC0.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.NetRexxC", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NetRexxC netRexxC0 = new NetRexxC();
      try { 
        netRexxC0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // srcDir and destDir attributes must be set!
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.NetRexxC", e);
      }
  }
}