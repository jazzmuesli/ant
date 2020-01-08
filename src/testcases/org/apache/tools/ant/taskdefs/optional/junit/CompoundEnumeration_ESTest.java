/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:00:02 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.junit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import org.apache.tools.ant.taskdefs.optional.junit.CompoundEnumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CompoundEnumeration_ESTest extends CompoundEnumeration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Enumeration<Object>[] enumerationArray0 = (Enumeration<Object>[]) Array.newInstance(Enumeration.class, 5);
      Enumeration<Object> enumeration0 = (Enumeration<Object>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, true).when(enumeration0).hasMoreElements();
      doReturn((Object) null).when(enumeration0).nextElement();
      enumerationArray0[0] = enumeration0;
      enumerationArray0[1] = enumeration0;
      enumerationArray0[2] = enumeration0;
      enumerationArray0[3] = enumeration0;
      enumerationArray0[4] = enumeration0;
      CompoundEnumeration compoundEnumeration0 = new CompoundEnumeration(enumerationArray0);
      Object object0 = compoundEnumeration0.nextElement();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CompoundEnumeration compoundEnumeration0 = new CompoundEnumeration((Enumeration[]) null);
      // Undeclared exception!
      try { 
        compoundEnumeration0.nextElement();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Enumeration<Object>[] enumerationArray0 = (Enumeration<Object>[]) Array.newInstance(Enumeration.class, 6);
      CompoundEnumeration compoundEnumeration0 = new CompoundEnumeration(enumerationArray0);
      enumerationArray0[0] = (Enumeration<Object>) compoundEnumeration0;
      CompoundEnumeration compoundEnumeration1 = new CompoundEnumeration(enumerationArray0);
      enumerationArray0[1] = (Enumeration<Object>) compoundEnumeration1;
      CompoundEnumeration compoundEnumeration2 = new CompoundEnumeration(enumerationArray0);
      enumerationArray0[2] = (Enumeration<Object>) compoundEnumeration2;
      CompoundEnumeration compoundEnumeration3 = new CompoundEnumeration(enumerationArray0);
      enumerationArray0[3] = (Enumeration<Object>) compoundEnumeration3;
      CompoundEnumeration compoundEnumeration4 = new CompoundEnumeration(enumerationArray0);
      enumerationArray0[4] = (Enumeration<Object>) compoundEnumeration4;
      CompoundEnumeration compoundEnumeration5 = new CompoundEnumeration(enumerationArray0);
      enumerationArray0[5] = (Enumeration<Object>) compoundEnumeration5;
      // Undeclared exception!
      try { 
        compoundEnumeration2.hasMoreElements();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Enumeration<Object>[] enumerationArray0 = (Enumeration<Object>[]) Array.newInstance(Enumeration.class, 0);
      CompoundEnumeration compoundEnumeration0 = new CompoundEnumeration(enumerationArray0);
      compoundEnumeration0.hasMoreElements();
      compoundEnumeration0.hasMoreElements();
      try { 
        compoundEnumeration0.nextElement();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.junit.CompoundEnumeration", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Enumeration<String>[] enumerationArray0 = (Enumeration<String>[]) Array.newInstance(Enumeration.class, 9);
      CompoundEnumeration compoundEnumeration0 = new CompoundEnumeration(enumerationArray0);
      enumerationArray0[0] = (Enumeration<String>) compoundEnumeration0;
      CompoundEnumeration compoundEnumeration1 = new CompoundEnumeration(enumerationArray0);
      enumerationArray0[1] = (Enumeration<String>) compoundEnumeration1;
      CompoundEnumeration compoundEnumeration2 = new CompoundEnumeration(enumerationArray0);
      enumerationArray0[2] = (Enumeration<String>) compoundEnumeration2;
      CompoundEnumeration compoundEnumeration3 = new CompoundEnumeration(enumerationArray0);
      enumerationArray0[3] = (Enumeration<String>) compoundEnumeration3;
      CompoundEnumeration compoundEnumeration4 = new CompoundEnumeration(enumerationArray0);
      enumerationArray0[4] = (Enumeration<String>) compoundEnumeration4;
      CompoundEnumeration compoundEnumeration5 = new CompoundEnumeration(enumerationArray0);
      enumerationArray0[5] = (Enumeration<String>) compoundEnumeration5;
      // Undeclared exception!
      try { 
        compoundEnumeration3.nextElement();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CompoundEnumeration compoundEnumeration0 = new CompoundEnumeration((Enumeration[]) null);
      // Undeclared exception!
      try { 
        compoundEnumeration0.hasMoreElements();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Enumeration<Object>[] enumerationArray0 = (Enumeration<Object>[]) Array.newInstance(Enumeration.class, 9);
      Enumeration<Object> enumeration0 = (Enumeration<Object>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(enumeration0).hasMoreElements();
      enumerationArray0[0] = enumeration0;
      enumerationArray0[1] = enumeration0;
      enumerationArray0[2] = enumeration0;
      enumerationArray0[3] = enumeration0;
      enumerationArray0[4] = enumeration0;
      enumerationArray0[5] = enumeration0;
      enumerationArray0[6] = enumeration0;
      enumerationArray0[7] = enumeration0;
      enumerationArray0[8] = enumeration0;
      CompoundEnumeration compoundEnumeration0 = new CompoundEnumeration(enumerationArray0);
      try { 
        compoundEnumeration0.nextElement();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.junit.CompoundEnumeration", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Enumeration<Integer>[] enumerationArray0 = (Enumeration<Integer>[]) Array.newInstance(Enumeration.class, 2);
      Enumeration<Integer> enumeration0 = (Enumeration<Integer>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      enumerationArray0[0] = enumeration0;
      enumerationArray0[1] = enumeration0;
  }
}