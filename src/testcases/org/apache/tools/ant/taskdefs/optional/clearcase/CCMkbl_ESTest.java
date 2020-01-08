/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:12:16 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.clearcase;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.taskdefs.optional.clearcase.CCMkbl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CCMkbl_ESTest extends CCMkbl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      cCMkbl0.setNoWarn(false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      cCMkbl0.setNlabel(true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      cCMkbl0.setIdentical(true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      cCMkbl0.setFull(true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      cCMkbl0.setCommentFile("");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      cCMkbl0.setComment("");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      cCMkbl0.setBaselineRootName("");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      boolean boolean0 = cCMkbl0.getNoWarn();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      boolean boolean0 = cCMkbl0.getNlabel();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      boolean boolean0 = cCMkbl0.getIdentical();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      boolean boolean0 = cCMkbl0.getFull();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      String string0 = cCMkbl0.getCommentFile();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      String string0 = cCMkbl0.getComment();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      String string0 = cCMkbl0.getBaselineRootName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CCMkbl cCMkbl0 = new CCMkbl();
      // Undeclared exception!
      try { 
        cCMkbl0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.clearcase.CCMkbl", e);
      }
  }
}