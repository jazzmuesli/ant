/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:59:43 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.vss;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.vss.MSVSSCHECKOUT;
import org.apache.tools.ant.types.Commandline;
import org.apache.tools.ant.types.Path;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MSVSSCHECKOUT_ESTest extends MSVSSCHECKOUT_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MSVSSCHECKOUT mSVSSCHECKOUT0 = new MSVSSCHECKOUT();
      mSVSSCHECKOUT0.setVsspath("V$2w)Sno");
      Commandline commandline0 = mSVSSCHECKOUT0.buildCmdLine();
      assertNotNull(commandline0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MSVSSCHECKOUT mSVSSCHECKOUT0 = new MSVSSCHECKOUT();
      mSVSSCHECKOUT0.setVersion("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MSVSSCHECKOUT mSVSSCHECKOUT0 = new MSVSSCHECKOUT();
      mSVSSCHECKOUT0.setRecursive(false);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MSVSSCHECKOUT mSVSSCHECKOUT0 = new MSVSSCHECKOUT();
      mSVSSCHECKOUT0.setLabel("");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MSVSSCHECKOUT mSVSSCHECKOUT0 = new MSVSSCHECKOUT();
      mSVSSCHECKOUT0.setAutoresponse("");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MSVSSCHECKOUT mSVSSCHECKOUT0 = new MSVSSCHECKOUT();
      // Undeclared exception!
      try { 
        mSVSSCHECKOUT0.setLocalpath((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.vss.MSVSSCHECKOUT", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MSVSSCHECKOUT mSVSSCHECKOUT0 = new MSVSSCHECKOUT();
      // Undeclared exception!
      try { 
        mSVSSCHECKOUT0.buildCmdLine();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // vsspath attribute must be set!
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.vss.MSVSSCHECKOUT", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MSVSSCHECKOUT mSVSSCHECKOUT0 = new MSVSSCHECKOUT();
      mSVSSCHECKOUT0.getRuntimeConfigurableWrapper();
      mSVSSCHECKOUT0.maybeConfigure();
      mSVSSCHECKOUT0.setDate("Kg<");
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(path0).toString();
      mSVSSCHECKOUT0.setLocalpath(path0);
      mSVSSCHECKOUT0.setVsspath("");
      Commandline commandline0 = mSVSSCHECKOUT0.buildCmdLine();
      assertNotNull(commandline0);
  }
}
