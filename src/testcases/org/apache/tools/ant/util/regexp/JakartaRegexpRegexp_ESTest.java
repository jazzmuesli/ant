/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 23:02:56 GMT 2020
 */

package org.apache.tools.ant.util.regexp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.regexp.JakartaRegexpRegexp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JakartaRegexpRegexp_ESTest extends JakartaRegexpRegexp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JakartaRegexpRegexp jakartaRegexpRegexp0 = new JakartaRegexpRegexp();
      jakartaRegexpRegexp0.setPattern("");
      String string0 = jakartaRegexpRegexp0.substitute("", "", (-204));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JakartaRegexpRegexp jakartaRegexpRegexp0 = new JakartaRegexpRegexp();
      int int0 = jakartaRegexpRegexp0.getSubsOptions((-1727));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JakartaRegexpRegexp jakartaRegexpRegexp0 = new JakartaRegexpRegexp();
      jakartaRegexpRegexp0.setPattern(".+756a;&6d;Y[O:yys");
      try { 
        jakartaRegexpRegexp0.substitute(".+756a;&6d;Y[O:yys", "", (-1));
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // org.apache.regexp.RESyntaxException: Syntax error: Unterminated character class
         //
         verifyException("org.apache.tools.ant.util.regexp.JakartaRegexpMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JakartaRegexpRegexp jakartaRegexpRegexp0 = new JakartaRegexpRegexp();
      // Undeclared exception!
      try { 
        jakartaRegexpRegexp0.substitute("", "", 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.regexp.RECompiler", e);
      }
  }
}
