/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:52:46 GMT 2020
 */

package org.apache.tools.ant.taskdefs.cvslib;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Vector;
import org.apache.tools.ant.taskdefs.cvslib.CVSEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CVSEntry_ESTest extends CVSEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      CVSEntry cVSEntry0 = new CVSEntry(date0, "Q>CI", "Q>CI");
      cVSEntry0.addFile("Q>CI", "|E>", "]j6K");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      CVSEntry cVSEntry0 = new CVSEntry(date0, "Q>CI", "Q>CI");
      cVSEntry0.addFile((String) null, "pNn},Mqq");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(date0).toString();
      CVSEntry cVSEntry0 = new CVSEntry(date0, "Q>CI", "Q>CI");
      String string0 = cVSEntry0.toString();
      assertEquals("Q>CI\nnull\n[]\nQ>CI", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      CVSEntry cVSEntry0 = new CVSEntry(date0, "Q>CI", "Q>CI");
      cVSEntry0.setAuthor("wR6//|9~!Ayq#-O[9C");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      CVSEntry cVSEntry0 = new CVSEntry(date0, "Q>CI", "Q>CI");
      Vector vector0 = cVSEntry0.getFiles();
      assertEquals("[]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      CVSEntry cVSEntry0 = new CVSEntry(date0, "Q>CI", "Q>CI");
      Date date1 = cVSEntry0.getDate();
      assertSame(date1, date0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      CVSEntry cVSEntry0 = new CVSEntry(date0, "Q>CI", "Q>CI");
      String string0 = cVSEntry0.getComment();
      assertEquals("Q>CI", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      CVSEntry cVSEntry0 = new CVSEntry(date0, (String) null, (String) null);
      String string0 = cVSEntry0.getAuthor();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      CVSEntry cVSEntry0 = new CVSEntry(date0, (String) null, (String) null);
      // Undeclared exception!
      try { 
        cVSEntry0.addFile((String) null, (String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.cvslib.RCSFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      CVSEntry cVSEntry0 = new CVSEntry(date0, "Lfj'$Hl@k<Vl", "Lfj'$Hl@k<Vl");
      // Undeclared exception!
      try { 
        cVSEntry0.addFile("_-4=Z", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.cvslib.RCSFile", e);
      }
  }
}
