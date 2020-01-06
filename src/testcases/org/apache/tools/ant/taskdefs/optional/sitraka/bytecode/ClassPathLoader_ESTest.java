/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:37:39 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.sitraka.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.Enumeration;
import org.apache.tools.ant.taskdefs.optional.sitraka.bytecode.ClassPathLoader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassPathLoader_ESTest extends ClassPathLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "9kd5DvS,YG?}!|";
      stringArray0[4] = "";
      stringArray0[5] = "/g)";
      stringArray0[6] = "";
      stringArray0[7] = "";
      ClassPathLoader classPathLoader0 = new ClassPathLoader(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassPathLoader classPathLoader0 = new ClassPathLoader((File[]) null);
      Enumeration enumeration0 = classPathLoader0.loaders();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassPathLoader classPathLoader0 = new ClassPathLoader((File[]) null);
      // Undeclared exception!
      try { 
        classPathLoader0.getClasses();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.sitraka.bytecode.ClassPathLoader$LoaderEnumeration", e);
      }
  }
}
