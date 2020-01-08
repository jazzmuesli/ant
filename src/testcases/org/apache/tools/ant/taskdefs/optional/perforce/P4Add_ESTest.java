/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:01:28 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.perforce;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Add;
import org.apache.tools.ant.types.FileSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class P4Add_ESTest extends P4Add_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      P4Add p4Add0 = new P4Add();
      p4Add0.setCommandlength(353);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      P4Add p4Add0 = new P4Add();
      p4Add0.setChangelist(353);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      P4Add p4Add0 = new P4Add();
      p4Add0.execute();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      P4Add p4Add0 = new P4Add();
      try { 
        p4Add0.setCommandlength(0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // P4Add: Commandlength should be a positive number
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.perforce.P4Add", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      P4Add p4Add0 = new P4Add();
      try { 
        p4Add0.setChangelist(0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // P4Add: Changelist# should be a positive number
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.perforce.P4Add", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      P4Add p4Add0 = new P4Add();
      FileSet fileSet0 = mock(FileSet.class, new ViolatedAssumptionAnswer());
      doReturn((DirectoryScanner) null).when(fileSet0).getDirectoryScanner(any(org.apache.tools.ant.Project.class));
      p4Add0.addFileset(fileSet0);
      // Undeclared exception!
      try { 
        p4Add0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.perforce.P4Add", e);
      }
  }
}