/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:14:37 GMT 2020
 */

package org.apache.tools.ant.types.selectors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.selectors.AndSelector;
import org.apache.tools.ant.types.selectors.DependSelector;
import org.apache.tools.ant.types.selectors.MajoritySelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MajoritySelector_ESTest extends MajoritySelector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MajoritySelector majoritySelector0 = new MajoritySelector();
      String string0 = majoritySelector0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MajoritySelector majoritySelector0 = new MajoritySelector();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = majoritySelector0.isSelected(file0, "", file0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MajoritySelector majoritySelector0 = new MajoritySelector();
      majoritySelector0.setAllowtie(true);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MajoritySelector majoritySelector0 = new MajoritySelector();
      majoritySelector0.appendSelector(majoritySelector0);
      // Undeclared exception!
      try { 
        majoritySelector0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MajoritySelector majoritySelector0 = new MajoritySelector();
      majoritySelector0.addDepend((DependSelector) null);
      // Undeclared exception!
      try { 
        majoritySelector0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MajoritySelector majoritySelector0 = new MajoritySelector();
      majoritySelector0.setError("If4+1#Rp");
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        majoritySelector0.isSelected(file0, ">N+2uC /1", file0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // If4+1#Rp
         //
         verifyException("org.apache.tools.ant.types.selectors.BaseSelectorContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MajoritySelector majoritySelector0 = new MajoritySelector();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      majoritySelector0.addAnd((AndSelector) null);
      // Undeclared exception!
      try { 
        majoritySelector0.isSelected(file0, ".1!", file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.selectors.MajoritySelector", e);
      }
  }
}