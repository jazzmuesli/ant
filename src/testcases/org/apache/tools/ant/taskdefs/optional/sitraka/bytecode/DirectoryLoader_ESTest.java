/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:00:14 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.sitraka.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FilenameFilter;
import org.apache.tools.ant.taskdefs.optional.sitraka.bytecode.DirectoryLoader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DirectoryLoader_ESTest extends DirectoryLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DirectoryLoader directoryLoader0 = new DirectoryLoader((File) null);
      File file0 = directoryLoader0.getFile();
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FilenameFilter filenameFilter0 = mock(FilenameFilter.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        DirectoryLoader.listFiles((File) null, filenameFilter0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.sitraka.bytecode.DirectoryLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).isDirectory();
      doReturn((String) null).when(file0).toString();
      // Undeclared exception!
      try { 
        DirectoryLoader.listFiles(file0, (FilenameFilter) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not a directory
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.sitraka.bytecode.DirectoryLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DirectoryLoader directoryLoader0 = new DirectoryLoader((File) null);
      // Undeclared exception!
      try { 
        directoryLoader0.getClasses();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.sitraka.bytecode.DirectoryLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).isDirectory();
      doReturn((String) null).when(file0).toString();
      DirectoryLoader directoryLoader0 = new DirectoryLoader(file0);
      // Undeclared exception!
      try { 
        directoryLoader0.getClasses();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not a directory
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.sitraka.bytecode.DirectoryLoader", e);
      }
  }
}