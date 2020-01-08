/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:41:27 GMT 2020
 */

package org.apache.tools.ant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.TaskAdapter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TaskAdapter_ESTest extends TaskAdapter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TaskAdapter taskAdapter0 = new TaskAdapter();
      taskAdapter0.setProxy((Object) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TaskAdapter taskAdapter0 = new TaskAdapter();
      Object object0 = taskAdapter0.getProxy();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TaskAdapter taskAdapter0 = new TaskAdapter();
      // Undeclared exception!
      try { 
        taskAdapter0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.TaskAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<BuildException> class0 = BuildException.class;
      // Undeclared exception!
      try { 
        TaskAdapter.checkTaskClass(class0, (Project) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.TaskAdapter", e);
      }
  }
}