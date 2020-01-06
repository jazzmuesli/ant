/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:13:51 GMT 2020
 */

package org.apache.tools.ant.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.types.FilterSet;
import org.apache.tools.ant.types.FilterSetCollection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FilterSetCollection_ESTest extends FilterSetCollection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FilterSet filterSet0 = mock(FilterSet.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(filterSet0).replaceTokens(anyString());
      FilterSetCollection filterSetCollection0 = new FilterSetCollection(filterSet0);
      String string0 = filterSetCollection0.replaceTokens("CKVf\"L]=<>7$N7[h3");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FilterSetCollection filterSetCollection0 = new FilterSetCollection();
      boolean boolean0 = filterSetCollection0.hasFilters();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FilterSet filterSet0 = mock(FilterSet.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(filterSet0).replaceTokens(anyString());
      FilterSetCollection filterSetCollection0 = new FilterSetCollection(filterSet0);
      filterSetCollection0.addFilterSet((FilterSet) null);
      // Undeclared exception!
      try { 
        filterSetCollection0.replaceTokens("&Z#");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.FilterSetCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FilterSet filterSet0 = mock(FilterSet.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(filterSet0).hasFilters();
      FilterSetCollection filterSetCollection0 = new FilterSetCollection(filterSet0);
      filterSetCollection0.addFilterSet((FilterSet) null);
      // Undeclared exception!
      try { 
        filterSetCollection0.hasFilters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.FilterSetCollection", e);
      }
  }
}
