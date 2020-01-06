/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:25:37 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import org.apache.tools.ant.AntClassLoader;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.JDBCTask;
import org.apache.tools.ant.taskdefs.SQLExec;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.types.Reference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDBCTask_ESTest extends JDBCTask_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setVersion((String) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setUserid("+Q\"%|0M/.r~w<.");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setUrl("zz#;mQ ");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setRdbms("mq5PdG#FAplh\"=~");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setPassword("uhR4|");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setDriver("J%");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      Reference reference0 = mock(Reference.class, new ViolatedAssumptionAnswer());
      sQLExec0.setClasspathRef(reference0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setClasspath((Path) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setCaching(false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.setAutocommit(false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      sQLExec0.isCaching(false);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      boolean boolean0 = sQLExec0.isAutocommit();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      String string0 = sQLExec0.getVersion();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      String string0 = sQLExec0.getUserId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      String string0 = sQLExec0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      String string0 = sQLExec0.getRdbms();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      String string0 = sQLExec0.getPassword();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hashtable hashtable0 = JDBCTask.getLoaderMap();
      assertEquals(0, hashtable0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      AntClassLoader antClassLoader0 = sQLExec0.getLoader();
      assertNull(antClassLoader0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      Path path0 = sQLExec0.getClasspath();
      assertNull(path0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      Path path0 = sQLExec0.createClasspath();
      assertNotNull(path0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SQLExec sQLExec0 = new SQLExec();
      try { 
        sQLExec0.getConnection();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // User Id attribute must be set!
         //
         verifyException("org.apache.tools.ant.taskdefs.JDBCTask", e);
      }
  }
}
