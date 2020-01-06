/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 23:02:03 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.perforce;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Change;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Fstat;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Handler;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Reopen;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Resolve;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class P4Base_ESTest extends P4Base_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      P4Fstat p4Fstat0 = new P4Fstat();
      p4Fstat0.setView("$G\"-_.%0GzJj`nS");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      P4Reopen p4Reopen0 = new P4Reopen();
      p4Reopen0.setUser(";|5");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      P4Resolve p4Resolve0 = new P4Resolve();
      p4Resolve0.setPort("k!u&xQcXC");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      P4Change p4Change0 = new P4Change();
      p4Change0.setGlobalopts("$G\"-_.%0GzJj`nS");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      P4Fstat p4Fstat0 = new P4Fstat();
      p4Fstat0.setCmdopts("X,sqxyp-Ob *WBOS");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      P4Reopen p4Reopen0 = new P4Reopen();
      p4Reopen0.setClient("");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      P4Fstat p4Fstat0 = new P4Fstat();
      // Undeclared exception!
      try { 
        p4Fstat0.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.perforce.P4Base", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      P4Resolve p4Resolve0 = new P4Resolve();
      try { 
        p4Resolve0.execP4Command("#An|15", (P4Handler) null);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Problem exec'ing P4 command: null
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.perforce.P4Base", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      P4Fstat p4Fstat0 = new P4Fstat();
      p4Fstat0.setFailonerror(false);
      // Undeclared exception!
      try { 
        p4Fstat0.execP4Command("#%5xS%`~V&=`z7", (P4Handler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      P4Resolve p4Resolve0 = new P4Resolve();
      try { 
        p4Resolve0.execP4Command("k!u&xQcXC");
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Problem exec'ing P4 command: null
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.perforce.P4Base", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      P4Resolve p4Resolve0 = new P4Resolve();
      p4Resolve0.setFailonerror(false);
      // Undeclared exception!
      try { 
        p4Resolve0.execP4Command("KDoC+%%^G_y{vY");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }
}
