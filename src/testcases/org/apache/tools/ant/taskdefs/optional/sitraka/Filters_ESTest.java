/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:49:55 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.sitraka;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.taskdefs.optional.sitraka.Filters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Filters_ESTest extends Filters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Filters filters0 = new Filters();
      String string0 = filters0.toString();
      assertEquals("*.*():E", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Filters filters0 = new Filters();
      Filters.Include filters_Include0 = new Filters.Include();
      filters0.addInclude(filters_Include0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Filters filters0 = new Filters();
      Filters.Exclude filters_Exclude0 = new Filters.Exclude();
      filters0.addExclude(filters_Exclude0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Filters.Include filters_Include0 = new Filters.Include();
      String string0 = filters_Include0.toString();
      assertEquals("null.*():I", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Filters.Exclude filters_Exclude0 = new Filters.Exclude();
      String string0 = filters_Exclude0.toString();
      assertEquals("null.*():E", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Filters.Exclude filters_Exclude0 = new Filters.Exclude();
      filters_Exclude0.setName("*.*():E");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Filters.Exclude filters_Exclude0 = new Filters.Exclude();
      filters_Exclude0.setMethod("");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Filters.Include filters_Include0 = new Filters.Include();
      filters_Include0.setEnabled(true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Filters.Exclude filters_Exclude0 = new Filters.Exclude();
      filters_Exclude0.setClass("");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Filters.Exclude filters_Exclude0 = new Filters.Exclude();
      String string0 = filters_Exclude0.toString();
      assertEquals("null.*():E", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Filters filters0 = new Filters();
      filters0.setDefaultExclude(true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Filters filters0 = new Filters();
      filters0.filters = null;
      // Undeclared exception!
      try { 
        filters0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.sitraka.Filters", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Filters.Include filters_Include0 = new Filters.Include();
      Filters filters0 = new Filters();
      filters0.filters = null;
      // Undeclared exception!
      try { 
        filters0.addInclude(filters_Include0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.sitraka.Filters", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Filters filters0 = new Filters();
      filters0.filters = null;
      Filters.Exclude filters_Exclude0 = new Filters.Exclude();
      // Undeclared exception!
      try { 
        filters0.addExclude(filters_Exclude0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.sitraka.Filters", e);
      }
  }
}
