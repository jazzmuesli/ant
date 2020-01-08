/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:13:25 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.vss;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.vss.MSVSSADD;
import org.apache.tools.ant.types.Path;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MSVSSADD_ESTest extends MSVSSADD_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MSVSSADD mSVSSADD0 = new MSVSSADD();
      mSVSSADD0.getStyle();
      mSVSSADD0.setInternalLabel("");
      mSVSSADD0.getProject();
      mSVSSADD0.getLabel();
      mSVSSADD0.setInternalVersion("YB+&RT");
      mSVSSADD0.setRecursive(false);
      mSVSSADD0.getLocalpath();
      mSVSSADD0.setAutoresponse((String) null);
      mSVSSADD0.setRecursive(false);
      mSVSSADD0.getLocalpath();
      mSVSSADD0.setComment((String) null);
      mSVSSADD0.getLocalpath();
      mSVSSADD0.setWritable(false);
      mSVSSADD0.setRecursive(false);
      mSVSSADD0.setAutoresponse("s;}1Uvs");
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(path0).toString();
      mSVSSADD0.setLocalpath(path0);
      // Undeclared exception!
      try { 
        mSVSSADD0.buildCmdLine();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // localPath attribute must be set!
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.vss.MSVSSADD", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MSVSSADD mSVSSADD0 = new MSVSSADD();
      // Undeclared exception!
      try { 
        mSVSSADD0.setLocalpath((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.vss.MSVSSADD", e);
      }
  }
}