/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:00:33 GMT 2020
 */

package org.apache.tools.ant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.DummyTaskPackage;
import org.apache.tools.ant.DummyTaskWithoutDefaultConstructor;
import org.apache.tools.ant.DummyTaskWithoutPublicConstructor;
import org.apache.tools.ant.Project;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProjectComponent_ESTest extends ProjectComponent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DummyTaskWithoutDefaultConstructor dummyTaskWithoutDefaultConstructor0 = new DummyTaskWithoutDefaultConstructor((-1));
      dummyTaskWithoutDefaultConstructor0.setProject((Project) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DummyTaskPackage dummyTaskPackage0 = new DummyTaskPackage();
      Project project0 = dummyTaskPackage0.getProject();
      assertNull(project0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DummyTaskWithoutDefaultConstructor dummyTaskWithoutDefaultConstructor0 = new DummyTaskWithoutDefaultConstructor((-3612));
      // Undeclared exception!
      try { 
        dummyTaskWithoutDefaultConstructor0.log("", (-2760));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DummyTaskWithoutPublicConstructor dummyTaskWithoutPublicConstructor0 = new DummyTaskWithoutPublicConstructor();
      // Undeclared exception!
      try { 
        dummyTaskWithoutPublicConstructor0.log("Lr$KKh(G,");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }
}
