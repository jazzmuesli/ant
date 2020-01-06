/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:57:25 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.PrintStream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.SQLExec;
import org.apache.tools.ant.types.FileSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SQLExec_ESTest extends SQLExec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      SQLExec.DelimiterType sQLExec_DelimiterType0 = new SQLExec.DelimiterType();
      sQLExec0.setDelimiterType(sQLExec_DelimiterType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      sQLExec0.execSQL("", printStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      SQLExec.Transaction sQLExec_Transaction0 = sQLExec0.createTransaction();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      sQLExec_Transaction0.setSrc(file0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      SQLExec.Transaction sQLExec_Transaction0 = sQLExec0.new Transaction();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SQLExec.OnError sQLExec_OnError0 = new SQLExec.OnError();
      String[] stringArray0 = sQLExec_OnError0.getValues();
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SQLExec.DelimiterType sQLExec_DelimiterType0 = new SQLExec.DelimiterType();
      String[] stringArray0 = sQLExec_DelimiterType0.getValues();
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      sQLExec0.setSrc(file0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setShowheaders(true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setPrint(true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      sQLExec0.setOutput(file0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      SQLExec.OnError sQLExec_OnError0 = new SQLExec.OnError();
      sQLExec0.setOnerror(sQLExec_OnError0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setKeepformat(false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setEscapeProcessing(false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setEncoding("");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setDelimiter("");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setAppend(true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      SQLExec.Transaction sQLExec_Transaction0 = sQLExec0.createTransaction();
      sQLExec_Transaction0.addText("");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.addText("a76");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      FileSet fileSet0 = mock(FileSet.class, new ViolatedAssumptionAnswer());
      sQLExec0.addFileset(fileSet0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      // Undeclared exception!
      try { 
        sQLExec0.setDelimiterType((SQLExec.DelimiterType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.SQLExec", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      PrintStream printStream0 = mock(PrintStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        sQLExec0.printResults(printStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.SQLExec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      try { 
        sQLExec0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Source file or fileset, transactions or sql statement must be set!
         //
         verifyException("org.apache.tools.ant.taskdefs.SQLExec", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      // Undeclared exception!
      try { 
        sQLExec0.execSQL((String) null, (PrintStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.SQLExec", e);
      }
  }
}
