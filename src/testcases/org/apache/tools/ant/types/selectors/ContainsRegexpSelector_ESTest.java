/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:26:16 GMT 2020
 */

package org.apache.tools.ant.types.selectors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.Parameter;
import org.apache.tools.ant.types.selectors.ContainsRegexpSelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContainsRegexpSelector_ESTest extends ContainsRegexpSelector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContainsRegexpSelector containsRegexpSelector0 = new ContainsRegexpSelector();
      Parameter[] parameterArray0 = new Parameter[1];
      Parameter parameter0 = new Parameter();
      parameterArray0[0] = parameter0;
      containsRegexpSelector0.setParameters(parameterArray0);
      assertEquals(1, parameterArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContainsRegexpSelector containsRegexpSelector0 = new ContainsRegexpSelector();
      containsRegexpSelector0.setExpression("y^!Vwe7f@J<D-*'[H");
      MockFile mockFile0 = new MockFile("Couldn't get a file list from filespec", "");
      File file0 = MockFile.createTempFile("8b02?;8]tf<2EO<", (String) null, (File) mockFile0);
      boolean boolean0 = containsRegexpSelector0.isSelected(file0, "", mockFile0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContainsRegexpSelector containsRegexpSelector0 = new ContainsRegexpSelector();
      containsRegexpSelector0.verifySettings();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContainsRegexpSelector containsRegexpSelector0 = new ContainsRegexpSelector();
      String string0 = containsRegexpSelector0.toString();
      assertEquals("{containsregexpselector expression: null}", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContainsRegexpSelector containsRegexpSelector0 = new ContainsRegexpSelector();
      Parameter[] parameterArray0 = new Parameter[8];
      // Undeclared exception!
      try { 
        containsRegexpSelector0.setParameters(parameterArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.selectors.ContainsRegexpSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ContainsRegexpSelector containsRegexpSelector0 = new ContainsRegexpSelector();
      // Undeclared exception!
      try { 
        containsRegexpSelector0.isSelected((File) null, "", (File) null);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // The expression attribute is required
         //
         verifyException("org.apache.tools.ant.types.selectors.BaseSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ContainsRegexpSelector containsRegexpSelector0 = new ContainsRegexpSelector();
      containsRegexpSelector0.setExpression("");
      // Undeclared exception!
      try { 
        containsRegexpSelector0.isSelected((File) null, "", (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.selectors.ContainsRegexpSelector", e);
      }
  }
}
