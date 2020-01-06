/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:10:26 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.perforce;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.tools.ant.taskdefs.optional.perforce.FStatP4OutputHandler;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Base;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Fstat;
import org.apache.tools.ant.taskdefs.optional.perforce.P4HandlerAdapter;
import org.apache.tools.ant.taskdefs.optional.perforce.P4Submit;
import org.apache.tools.ant.taskdefs.optional.perforce.SimpleP4OutputHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class P4HandlerAdapter_ESTest extends P4HandlerAdapter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      P4Fstat p4Fstat0 = mock(P4Fstat.class, new ViolatedAssumptionAnswer());
      FStatP4OutputHandler fStatP4OutputHandler0 = new FStatP4OutputHandler(p4Fstat0);
      P4HandlerAdapter.Reader p4HandlerAdapter_Reader0 = fStatP4OutputHandler0.new Reader((InputStream) null);
      // Undeclared exception!
      try { 
        p4HandlerAdapter_Reader0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      P4Base p4Base0 = mock(P4Base.class, new ViolatedAssumptionAnswer());
      SimpleP4OutputHandler simpleP4OutputHandler0 = new SimpleP4OutputHandler(p4Base0);
      P4HandlerAdapter.Reader p4HandlerAdapter_Reader0 = simpleP4OutputHandler0.new Reader((InputStream) null);
      p4HandlerAdapter_Reader0.setStream((InputStream) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      P4Fstat p4Fstat0 = mock(P4Fstat.class, new ViolatedAssumptionAnswer());
      FStatP4OutputHandler fStatP4OutputHandler0 = new FStatP4OutputHandler(p4Fstat0);
      fStatP4OutputHandler0.stop();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      P4Submit p4Submit0 = mock(P4Submit.class, new ViolatedAssumptionAnswer());
      P4Submit.P4SubmitAdapter p4Submit_P4SubmitAdapter0 = p4Submit0.new P4SubmitAdapter();
      p4Submit_P4SubmitAdapter0.start();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      P4Base p4Base0 = mock(P4Base.class, new ViolatedAssumptionAnswer());
      SimpleP4OutputHandler simpleP4OutputHandler0 = new SimpleP4OutputHandler(p4Base0);
      simpleP4OutputHandler0.setProcessOutputStream((InputStream) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      P4Submit p4Submit0 = mock(P4Submit.class, new ViolatedAssumptionAnswer());
      P4Submit.P4SubmitAdapter p4Submit_P4SubmitAdapter0 = p4Submit0.new P4SubmitAdapter();
      p4Submit_P4SubmitAdapter0.setProcessInputStream((OutputStream) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      P4Base p4Base0 = mock(P4Base.class, new ViolatedAssumptionAnswer());
      SimpleP4OutputHandler simpleP4OutputHandler0 = new SimpleP4OutputHandler(p4Base0);
      simpleP4OutputHandler0.setProcessErrorStream((InputStream) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      P4Fstat p4Fstat0 = mock(P4Fstat.class, new ViolatedAssumptionAnswer());
      FStatP4OutputHandler fStatP4OutputHandler0 = new FStatP4OutputHandler(p4Fstat0);
      fStatP4OutputHandler0.setOutput("@Y.\"<nH~.;N .v");
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      P4Fstat p4Fstat0 = mock(P4Fstat.class, new ViolatedAssumptionAnswer());
      FStatP4OutputHandler fStatP4OutputHandler0 = new FStatP4OutputHandler(p4Fstat0);
      // Undeclared exception!
      try { 
        fStatP4OutputHandler0.process("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.perforce.FStatP4OutputHandler", e);
      }
  }
}
