/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:47:34 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.vss;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.vss.MSVSSLABEL;
import org.apache.tools.ant.types.Commandline;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MSVSSLABEL_ESTest extends MSVSSLABEL_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MSVSSLABEL mSVSSLABEL0 = new MSVSSLABEL();
      mSVSSLABEL0.setVsspath("E[1QsUIJ,XFjj");
      mSVSSLABEL0.setLabel("4-</A2b TgcC,_");
      Commandline commandline0 = mSVSSLABEL0.buildCmdLine();
      assertNotNull(commandline0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MSVSSLABEL mSVSSLABEL0 = new MSVSSLABEL();
      mSVSSLABEL0.setVersion("4-</A2b TgcC,_");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MSVSSLABEL mSVSSLABEL0 = new MSVSSLABEL();
      mSVSSLABEL0.setComment("E[1QsUIJ,XFjj");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MSVSSLABEL mSVSSLABEL0 = new MSVSSLABEL();
      mSVSSLABEL0.setAutoresponse("ckL!&442I;X\"/T");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MSVSSLABEL mSVSSLABEL0 = new MSVSSLABEL();
      // Undeclared exception!
      try { 
        mSVSSLABEL0.buildCmdLine();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // vsspath attribute must be set!
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.vss.MSVSSLABEL", e);
      }
  }
}
