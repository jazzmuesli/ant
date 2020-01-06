/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:37:03 GMT 2020
 */

package org.apache.tools.ant.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Vector;
import org.apache.tools.ant.util.CollectionUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CollectionUtils_ESTest extends CollectionUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Enumeration<String> enumeration0 = (Enumeration<String>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      Dictionary<String, Object> dictionary0 = (Dictionary<String, Object>) mock(Dictionary.class, new ViolatedAssumptionAnswer());
      doReturn(enumeration0).when(dictionary0).keys();
      CollectionUtils.putAll(dictionary0, dictionary0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Dictionary<Object, Object> dictionary0 = (Dictionary<Object, Object>) mock(Dictionary.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = CollectionUtils.equals(dictionary0, dictionary0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = CollectionUtils.equals((Vector) null, (Vector) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CollectionUtils collectionUtils0 = new CollectionUtils();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        CollectionUtils.putAll((Dictionary) null, (Dictionary) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.util.CollectionUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Dictionary<String, String> dictionary0 = (Dictionary<String, String>) mock(Dictionary.class, new ViolatedAssumptionAnswer());
      doReturn((Enumeration) null).when(dictionary0).keys();
      doReturn(0).when(dictionary0).size();
      Dictionary<Object, Integer> dictionary1 = (Dictionary<Object, Integer>) mock(Dictionary.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dictionary1).size();
      // Undeclared exception!
      try { 
        CollectionUtils.equals(dictionary0, dictionary1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.util.CollectionUtils", e);
      }
  }
}
