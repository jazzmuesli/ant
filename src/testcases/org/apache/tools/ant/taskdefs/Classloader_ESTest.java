/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:08:48 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.taskdefs.Classloader;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.types.Reference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Classloader_ESTest extends Classloader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Classloader classloader0 = new Classloader();
      Reference reference0 = mock(Reference.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(reference0).getReferencedObject(any(org.apache.tools.ant.Project.class));
      classloader0.setClasspathRef(reference0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Classloader classloader0 = new Classloader();
      classloader0.setReverse(true);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Classloader classloader0 = new Classloader();
      classloader0.setReset(false);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Classloader classloader0 = new Classloader();
      classloader0.setParentName("");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Classloader classloader0 = new Classloader();
      classloader0.setParentFirst(true);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Classloader classloader0 = new Classloader();
      classloader0.setName("");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Classloader classloader0 = new Classloader();
      classloader0.execute();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Classloader classloader0 = new Classloader();
      Path path0 = classloader0.createClasspath();
      classloader0.setClasspath(path0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Classloader classloader0 = new Classloader();
      // Undeclared exception!
      try { 
        classloader0.setClasspathRef((Reference) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Classloader", e);
      }
  }
}
