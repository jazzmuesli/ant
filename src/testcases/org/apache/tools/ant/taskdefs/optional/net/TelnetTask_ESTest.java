/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:43:03 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.net.TelnetTask;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TelnetTask_ESTest extends TelnetTask_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      TelnetTask.TelnetWrite telnetTask_TelnetWrite0 = telnetTask0.new TelnetWrite();
      telnetTask_TelnetWrite0.setEcho(true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      TelnetTask.TelnetWrite telnetTask_TelnetWrite0 = telnetTask0.new TelnetWrite();
      TelnetTask.AntTelnetClient telnetTask_AntTelnetClient0 = telnetTask0.new AntTelnetClient();
      try { 
        telnetTask_TelnetWrite0.execute(telnetTask_AntTelnetClient0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.TelnetTask$AntTelnetClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      TelnetTask.TelnetWrite telnetTask_TelnetWrite0 = telnetTask0.new TelnetWrite();
      telnetTask_TelnetWrite0.setString("");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      TelnetTask.TelnetWrite telnetTask_TelnetWrite0 = telnetTask0.new TelnetWrite();
      TelnetTask.AntTelnetClient telnetTask_AntTelnetClient0 = telnetTask0.new AntTelnetClient();
      try { 
        telnetTask_TelnetWrite0.execute(telnetTask_AntTelnetClient0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.TelnetTask$AntTelnetClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      TelnetTask.TelnetSubTask telnetTask_TelnetSubTask0 = telnetTask0.new TelnetSubTask();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      TelnetTask.TelnetRead telnetTask_TelnetRead0 = telnetTask0.new TelnetRead();
      Integer integer0 = new Integer((-2097));
      telnetTask_TelnetRead0.setTimeout(integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      Integer integer0 = new Integer(1986);
      TelnetTask.TelnetRead telnetTask_TelnetRead0 = telnetTask0.new TelnetRead();
      telnetTask_TelnetRead0.setDefaultTimeout(integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      TelnetTask.TelnetRead telnetTask_TelnetRead0 = telnetTask0.new TelnetRead();
      // Undeclared exception!
      try { 
        telnetTask_TelnetRead0.execute((TelnetTask.AntTelnetClient) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.TelnetTask$TelnetRead", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      TelnetTask.AntTelnetClient telnetTask_AntTelnetClient0 = telnetTask0.new AntTelnetClient();
      Integer integer0 = new Integer((-567));
      // Undeclared exception!
      try { 
        telnetTask_AntTelnetClient0.waitForString("", integer0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.TelnetTask$AntTelnetClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      TelnetTask.AntTelnetClient telnetTask_AntTelnetClient0 = telnetTask0.new AntTelnetClient();
      // Undeclared exception!
      try { 
        telnetTask_AntTelnetClient0.waitForString((String) null);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.TelnetTask$AntTelnetClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      TelnetTask.AntTelnetClient telnetTask_AntTelnetClient0 = telnetTask0.new AntTelnetClient();
      // Undeclared exception!
      try { 
        telnetTask_AntTelnetClient0.sendString("kTpbx<v.A", false);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.TelnetTask$AntTelnetClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      telnetTask0.setUserid((String) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      Integer integer0 = new Integer(1986);
      telnetTask0.setTimeout(integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      telnetTask0.setPort(1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      telnetTask0.setPassword("r$7{nD6/[Dm?");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      telnetTask0.setInitialCR(true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      TelnetTask.TelnetSubTask telnetTask_TelnetSubTask0 = telnetTask0.createWrite();
      // Undeclared exception!
      try { 
        telnetTask_TelnetSubTask0.addText("org.apache.commons.net.DefaultSocketFactory");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.TelnetTask$TelnetSubTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      TelnetTask.TelnetSubTask telnetTask_TelnetSubTask0 = telnetTask0.createRead();
      assertNotNull(telnetTask_TelnetSubTask0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      try { 
        telnetTask0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // No Server Specified
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.TelnetTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TelnetTask telnetTask0 = new TelnetTask();
      telnetTask0.setServer("h(2Zy*\u0003");
      // Undeclared exception!
      try { 
        telnetTask0.execute();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid host wildcard specification
         //
         verifyException("java.net.SocketPermission", e);
      }
  }
}
