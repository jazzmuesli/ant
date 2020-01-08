/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:56:39 GMT 2020
 */

package org.apache.tools.ant.taskdefs.cvslib;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.taskdefs.cvslib.RCSFile;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RCSFile_ESTest extends RCSFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RCSFile rCSFile0 = new RCSFile("nx;Njp:\rZS", "");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RCSFile rCSFile0 = new RCSFile("", "~dhv7EU3$~M\\COK~IT", "");
      String string0 = rCSFile0.getRevision();
      assertEquals("~dhv7EU3$~M\\COK~IT", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RCSFile rCSFile0 = new RCSFile("", "~dhv7EU3$~M\\COK~IT", "");
      String string0 = rCSFile0.getPreviousRevision();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RCSFile rCSFile0 = new RCSFile("", "~dhv7EU3$~M\\COK~IT", "");
      String string0 = rCSFile0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RCSFile rCSFile0 = null;
      try {
        rCSFile0 = new RCSFile("", (String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.cvslib.RCSFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RCSFile rCSFile0 = null;
      try {
        rCSFile0 = new RCSFile((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.cvslib.RCSFile", e);
      }
  }
}