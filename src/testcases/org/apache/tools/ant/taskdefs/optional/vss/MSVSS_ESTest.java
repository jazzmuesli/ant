/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:55:56 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.vss;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.RuntimeConfigurable;
import org.apache.tools.ant.taskdefs.optional.vss.MSVSSADD;
import org.apache.tools.ant.taskdefs.optional.vss.MSVSSCHECKIN;
import org.apache.tools.ant.taskdefs.optional.vss.MSVSSCHECKOUT;
import org.apache.tools.ant.taskdefs.optional.vss.MSVSSCP;
import org.apache.tools.ant.taskdefs.optional.vss.MSVSSCREATE;
import org.apache.tools.ant.taskdefs.optional.vss.MSVSSGET;
import org.apache.tools.ant.taskdefs.optional.vss.MSVSSHISTORY;
import org.apache.tools.ant.taskdefs.optional.vss.MSVSSLABEL;
import org.apache.tools.ant.types.Path;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MSVSS_ESTest extends MSVSS_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MSVSSCREATE mSVSSCREATE0 = new MSVSSCREATE();
      String string0 = mSVSSCREATE0.getLocalpath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MSVSSLABEL mSVSSLABEL0 = new MSVSSLABEL();
      mSVSSLABEL0.setSsdir("");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MSVSSCREATE mSVSSCREATE0 = new MSVSSCREATE();
      mSVSSCREATE0.setServerpath("");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MSVSSCHECKOUT mSVSSCHECKOUT0 = new MSVSSCHECKOUT();
      mSVSSCHECKOUT0.setLogin((String) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MSVSSCP mSVSSCP0 = new MSVSSCP();
      mSVSSCP0.setInternalWritable(false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MSVSSGET mSVSSGET0 = new MSVSSGET();
      mSVSSGET0.setInternalUser(";a_N_ep8u05NnZ=}Q,W");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MSVSSCHECKOUT mSVSSCHECKOUT0 = new MSVSSCHECKOUT();
      mSVSSCHECKOUT0.setInternalToLabel("");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MSVSSGET mSVSSGET0 = new MSVSSGET();
      mSVSSGET0.setInternalToDate("");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MSVSSADD mSVSSADD0 = new MSVSSADD();
      mSVSSADD0.setInternalStyle("");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MSVSSLABEL mSVSSLABEL0 = new MSVSSLABEL();
      mSVSSLABEL0.setInternalRecursive(true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MSVSSADD mSVSSADD0 = new MSVSSADD();
      mSVSSADD0.setInternalQuiet(true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MSVSSLABEL mSVSSLABEL0 = new MSVSSLABEL();
      mSVSSLABEL0.setInternalOutputFilename("Y13p");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MSVSSLABEL mSVSSLABEL0 = new MSVSSLABEL();
      mSVSSLABEL0.setInternalNumDays(3149);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MSVSSADD mSVSSADD0 = new MSVSSADD();
      mSVSSADD0.setInternalLocalPath("");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MSVSSCHECKOUT mSVSSCHECKOUT0 = new MSVSSCHECKOUT();
      mSVSSCHECKOUT0.setInternalLabel("W(_khzfUM}[lOd?.;=");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MSVSSCHECKIN mSVSSCHECKIN0 = new MSVSSCHECKIN();
      mSVSSCHECKIN0.setInternalFromLabel((String) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MSVSSCHECKOUT mSVSSCHECKOUT0 = new MSVSSCHECKOUT();
      mSVSSCHECKOUT0.setInternalFromDate("");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MSVSSGET mSVSSGET0 = new MSVSSGET();
      mSVSSGET0.setInternalFailOnError(true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MSVSSGET mSVSSGET0 = new MSVSSGET();
      DateFormat dateFormat0 = mock(DateFormat.class, new ViolatedAssumptionAnswer());
      mSVSSGET0.setInternalDateFormat(dateFormat0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MSVSSCHECKOUT mSVSSCHECKOUT0 = new MSVSSCHECKOUT();
      mSVSSCHECKOUT0.setInternalDate("5yc%%=k>");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MSVSSLABEL mSVSSLABEL0 = new MSVSSLABEL();
      mSVSSLABEL0.setInternalComment((String) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MSVSSLABEL mSVSSLABEL0 = new MSVSSLABEL();
      mSVSSLABEL0.setInternalAutoResponse("R");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MSVSSGET mSVSSGET0 = new MSVSSGET();
      String string0 = mSVSSGET0.getWritable();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MSVSSCP mSVSSCP0 = new MSVSSCP();
      String string0 = mSVSSCP0.getVsspath();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MSVSSCHECKIN mSVSSCHECKIN0 = new MSVSSCHECKIN();
      String string0 = mSVSSCHECKIN0.getVersionLabel();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MSVSSADD mSVSSADD0 = new MSVSSADD();
      String string0 = mSVSSADD0.getVersionDate();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MSVSSADD mSVSSADD0 = new MSVSSADD();
      String string0 = mSVSSADD0.getVersion();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MSVSSCREATE mSVSSCREATE0 = new MSVSSCREATE();
      String string0 = mSVSSCREATE0.getUser();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MSVSSCHECKIN mSVSSCHECKIN0 = new MSVSSCHECKIN();
      String string0 = mSVSSCHECKIN0.getStyle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MSVSSHISTORY mSVSSHISTORY0 = new MSVSSHISTORY();
      String string0 = mSVSSHISTORY0.getRecursive();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MSVSSADD mSVSSADD0 = new MSVSSADD();
      String string0 = mSVSSADD0.getQuiet();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MSVSSCHECKIN mSVSSCHECKIN0 = new MSVSSCHECKIN();
      String string0 = mSVSSCHECKIN0.getOutput();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MSVSSLABEL mSVSSLABEL0 = new MSVSSLABEL();
      String string0 = mSVSSLABEL0.getLabel();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MSVSSLABEL mSVSSLABEL0 = new MSVSSLABEL();
      String string0 = mSVSSLABEL0.getComment();
      assertEquals("-C-", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MSVSSCREATE mSVSSCREATE0 = new MSVSSCREATE();
      String string0 = mSVSSCREATE0.getAutoresponse();
      assertEquals("-I-", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MSVSSHISTORY mSVSSHISTORY0 = new MSVSSHISTORY();
      // Undeclared exception!
      try { 
        mSVSSHISTORY0.setVsspath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.vss.MSVSS", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MSVSSCHECKIN mSVSSCHECKIN0 = new MSVSSCHECKIN();
      boolean boolean0 = false;
      String string0 = mSVSSCHECKIN0.getSSCommand();
      mSVSSCHECKIN0.setRuntimeConfigurableWrapper((RuntimeConfigurable) null);
      mSVSSCHECKIN0.setRecursive(false);
      mSVSSCHECKIN0.getDescription();
      mSVSSCHECKIN0.setInternalVersion("");
      mSVSSCHECKIN0.setComment("3-V<V{+DA4xW<#FoA");
      mSVSSCHECKIN0.getLogin();
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(path0).toString();
      mSVSSCHECKIN0.setLocalpath(path0);
      String string1 = mSVSSCHECKIN0.getLocalpath();
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MSVSSHISTORY mSVSSHISTORY0 = new MSVSSHISTORY();
      try { 
        mSVSSHISTORY0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // vsspath attribute must be set!
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.vss.MSVSSHISTORY", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MSVSSCHECKIN mSVSSCHECKIN0 = new MSVSSCHECKIN();
      mSVSSCHECKIN0.setVsspath("LPdif:)aCp");
      // Undeclared exception!
      try { 
        mSVSSCHECKIN0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.vss.MSVSS", e);
      }
  }
}