/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:07:27 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.jsp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.jsp.WLJspc;
import org.apache.tools.ant.types.Path;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WLJspc_ESTest extends WLJspc_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WLJspc wLJspc0 = new WLJspc();
      String[] stringArray0 = new String[0];
      wLJspc0.scanDir(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WLJspc wLJspc0 = new WLJspc();
      String string0 = wLJspc0.replaceString("+G/S`5^wQwJ8}$0", "+G/S`5^wQwJ8}$0", "+G/S`5^wQwJ8}$0");
      assertEquals("+G/S`5^wQwJ8}$0", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WLJspc wLJspc0 = new WLJspc();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      wLJspc0.setSrc(file0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WLJspc wLJspc0 = new WLJspc();
      wLJspc0.setPackage("pIB)KRkM=@Pv=9&+XB");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WLJspc wLJspc0 = new WLJspc();
      Path path0 = wLJspc0.createClasspath();
      wLJspc0.setClasspath(path0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WLJspc wLJspc0 = new WLJspc();
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        wLJspc0.scanDir(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WLJspc wLJspc0 = new WLJspc();
      // Undeclared exception!
      try { 
        wLJspc0.replaceString((String) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      WLJspc wLJspc0 = new WLJspc();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).getPath();
      doReturn(false).when(file0).isDirectory();
      wLJspc0.setDest(file0);
      try { 
        wLJspc0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // destination directory null is not valid
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.jsp.WLJspc", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      WLJspc wLJspc0 = new WLJspc();
      // Undeclared exception!
      try { 
        wLJspc0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.jsp.WLJspc", e);
      }
  }
}