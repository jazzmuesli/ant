/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:19:18 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.depend;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.InputStream;
import org.apache.tools.ant.taskdefs.optional.depend.ClassFile;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassFile_ESTest extends ClassFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      // Undeclared exception!
      try { 
        classFile0.read((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(inputStream0).read();
      try { 
        classFile0.read(inputStream0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
         //
         // No Magic Code Found - probably not a Java class file.
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.depend.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(863, (-1537), 863, 2901).when(inputStream0).read();
      try { 
        classFile0.read(inputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      // Undeclared exception!
      try { 
        classFile0.getFullClassName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.depend.ClassFileUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      // Undeclared exception!
      try { 
        classFile0.getClassRefs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.depend.ClassFile", e);
      }
  }
}
