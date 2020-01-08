/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:44:09 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.extension;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.taskdefs.optional.extension.JarLibDisplayTask;
import org.apache.tools.ant.types.FileSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JarLibDisplayTask_ESTest extends JarLibDisplayTask_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JarLibDisplayTask jarLibDisplayTask0 = new JarLibDisplayTask();
      jarLibDisplayTask0.setFile((File) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JarLibDisplayTask jarLibDisplayTask0 = new JarLibDisplayTask();
      try { 
        jarLibDisplayTask0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // File attribute not specified.
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.extension.JarLibDisplayTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JarLibDisplayTask jarLibDisplayTask0 = new JarLibDisplayTask();
      FileSet fileSet0 = mock(FileSet.class, new ViolatedAssumptionAnswer());
      doReturn((DirectoryScanner) null).when(fileSet0).getDirectoryScanner(any(org.apache.tools.ant.Project.class));
      jarLibDisplayTask0.addFileset(fileSet0);
      // Undeclared exception!
      try { 
        jarLibDisplayTask0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.extension.JarLibDisplayTask", e);
      }
  }
}