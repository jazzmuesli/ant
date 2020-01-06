/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:56:39 GMT 2020
 */

package org.apache.tools.ant.listener;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.PrintStream;
import org.apache.tools.ant.listener.AnsiColorLogger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnsiColorLogger_ESTest extends AnsiColorLogger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AnsiColorLogger ansiColorLogger0 = new AnsiColorLogger();
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      ansiColorLogger0.printMessage("", printStream0, (-2231));
  }
}
