/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:01:24 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.jsp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.taskdefs.optional.jsp.JspNameMangler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JspNameMangler_ESTest extends JspNameMangler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JspNameMangler jspNameMangler0 = new JspNameMangler();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn("").when(file0).getName();
      String string0 = jspNameMangler0.mapJspToJavaName(file0);
      assertEquals("_00025.java", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JspNameMangler jspNameMangler0 = new JspNameMangler();
      String string0 = jspNameMangler0.mapPath((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JspNameMangler jspNameMangler0 = new JspNameMangler();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).getName();
      // Undeclared exception!
      try { 
        jspNameMangler0.mapJspToJavaName(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.jsp.JspNameMangler", e);
      }
  }
}