/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:55:26 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.perforce;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Integrate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class P4Integrate_ESTest extends P4Integrate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      p4Integrate0.setSimulationMode(false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      p4Integrate0.setReversebranchmappings(false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      p4Integrate0.setRestoreDeletedRevisions(false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      p4Integrate0.setPropagatesourcefiletype(false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      p4Integrate0.setNocopynewtargetfiles(false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      p4Integrate0.setLeaveTargetRevision(false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      p4Integrate0.setFromfile("");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      p4Integrate0.setForceIntegrate(false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      p4Integrate0.setEnableBaselessMerges(false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      p4Integrate0.setChange("");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      boolean boolean0 = p4Integrate0.isSimulationMode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      boolean boolean0 = p4Integrate0.isReversebranchmappings();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      boolean boolean0 = p4Integrate0.isRestoreDeletedRevisions();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      boolean boolean0 = p4Integrate0.isPropagatesourcefiletype();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      boolean boolean0 = p4Integrate0.isNocopynewtargetfiles();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      boolean boolean0 = p4Integrate0.isLeaveTargetRevision();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      boolean boolean0 = p4Integrate0.isForceIntegrate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      boolean boolean0 = p4Integrate0.isEnableBaselessMerges();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      String string0 = p4Integrate0.getTofile();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      String string0 = p4Integrate0.getFromfile();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      String string0 = p4Integrate0.getChange();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      String string0 = p4Integrate0.getBranch();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      try { 
        p4Integrate0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // you need to specify fromfile and tofile, or branch and tofile, or branch and fromfile, or branch and fromfile and tofile 
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.perforce.P4Integrate", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      P4Integrate p4Integrate0 = new P4Integrate();
      p4Integrate0.setBranch("Nrm9]3*fUh>bWQ0G.");
      p4Integrate0.setTofile("P60y+hlnRq+[kb8nL5a");
      p4Integrate0.setFailonerror(false);
      // Undeclared exception!
      try { 
        p4Integrate0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }
}