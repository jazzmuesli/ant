/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:59:50 GMT 2020
 */

package org.apache.tools.ant.filters;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tools.ant.filters.PrefixLines;
import org.apache.tools.ant.filters.StripLineBreaks;
import org.apache.tools.ant.filters.TailFilter;
import org.apache.tools.ant.types.Parameter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseParamFilterReader_ESTest extends BaseParamFilterReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TailFilter tailFilter0 = new TailFilter();
      Parameter[] parameterArray0 = new Parameter[6];
      tailFilter0.setParameters(parameterArray0);
      assertEquals(6, parameterArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrefixLines prefixLines0 = new PrefixLines();
      StripLineBreaks stripLineBreaks0 = new StripLineBreaks(prefixLines0);
      Parameter[] parameterArray0 = stripLineBreaks0.getParameters();
      assertNull(parameterArray0);
  }
}
