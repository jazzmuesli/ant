/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:54:01 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.PathConvert;
import org.apache.tools.ant.types.Reference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PathConvert_ESTest extends PathConvert_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PathConvert.TargetOs pathConvert_TargetOs0 = new PathConvert.TargetOs();
      String[] stringArray0 = pathConvert_TargetOs0.getValues();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      PathConvert.MapEntry pathConvert_MapEntry0 = pathConvert0.new MapEntry();
      pathConvert_MapEntry0.setTo("");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      PathConvert.MapEntry pathConvert_MapEntry0 = pathConvert0.new MapEntry();
      pathConvert_MapEntry0.setFrom((String) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      PathConvert.MapEntry pathConvert_MapEntry0 = pathConvert0.new MapEntry();
      // Undeclared exception!
      try { 
        pathConvert_MapEntry0.apply("");
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Both 'from' and 'to' must be set in a map entry
         //
         verifyException("org.apache.tools.ant.taskdefs.PathConvert$MapEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      pathConvert0.setSetonempty(false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      pathConvert0.setProperty("");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      pathConvert0.setPathSep("!Okvnxp]5");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      pathConvert0.setDirSep("");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      boolean boolean0 = pathConvert0.isReference();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      PathConvert.MapEntry pathConvert_MapEntry0 = pathConvert0.createMap();
      pathConvert_MapEntry0.setFrom("8|pWb7Hk9&iw{xnK&*");
      pathConvert_MapEntry0.setTo("");
      String string0 = pathConvert_MapEntry0.apply("LXb");
      assertEquals("LXb", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      PathConvert.TargetOs pathConvert_TargetOs0 = new PathConvert.TargetOs();
      // Undeclared exception!
      try { 
        pathConvert0.setTargetos(pathConvert_TargetOs0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.PathConvert", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      // Undeclared exception!
      try { 
        pathConvert0.setTargetos("");
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         //  is not a legal value for this attribute
         //
         verifyException("org.apache.tools.ant.types.EnumeratedAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      pathConvert0.createPath();
      Reference reference0 = mock(Reference.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        pathConvert0.setRefid(reference0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // You must not specify nested <path> elements when using the refid attribute.
         //
         verifyException("org.apache.tools.ant.taskdefs.PathConvert", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      try { 
        pathConvert0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // You must specify a path to convert
         //
         verifyException("org.apache.tools.ant.taskdefs.PathConvert", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PathConvert pathConvert0 = new PathConvert();
      Reference reference0 = mock(Reference.class, new ViolatedAssumptionAnswer());
      pathConvert0.setRefid(reference0);
      // Undeclared exception!
      try { 
        pathConvert0.createPath();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // You must not specify nested <path> elements when using the refid attribute.
         //
         verifyException("org.apache.tools.ant.taskdefs.PathConvert", e);
      }
  }
}