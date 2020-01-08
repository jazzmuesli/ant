/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:59:47 GMT 2020
 */

package org.apache.tools.ant.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.util.TimeoutObserver;
import org.apache.tools.ant.util.Watchdog;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Watchdog_ESTest extends Watchdog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Watchdog watchdog0 = new Watchdog(1L);
      watchdog0.stop();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Watchdog watchdog0 = new Watchdog(1L);
      watchdog0.start();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Watchdog watchdog0 = new Watchdog(1L);
      watchdog0.run();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Watchdog watchdog0 = new Watchdog(1L);
      TimeoutObserver timeoutObserver0 = mock(TimeoutObserver.class, new ViolatedAssumptionAnswer());
      watchdog0.removeTimeoutObserver(timeoutObserver0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Watchdog watchdog0 = new Watchdog(1L);
      watchdog0.fireTimeoutOccured();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Watchdog watchdog0 = new Watchdog(1L);
      TimeoutObserver timeoutObserver0 = mock(TimeoutObserver.class, new ViolatedAssumptionAnswer());
      watchdog0.addTimeoutObserver(timeoutObserver0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Watchdog watchdog0 = null;
      try {
        watchdog0 = new Watchdog((-1260L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout lesser than 1.
         //
         verifyException("org.apache.tools.ant.util.Watchdog", e);
      }
  }
}