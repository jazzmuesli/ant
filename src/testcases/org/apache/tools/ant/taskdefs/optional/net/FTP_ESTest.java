/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:47:47 GMT 2020
 */

package org.apache.tools.ant.taskdefs.optional.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedWriter;
import java.io.File;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.taskdefs.optional.net.FTP;
import org.apache.tools.ant.types.FileSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FTP_ESTest extends FTP_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FTP fTP0 = new FTP();
      String string0 = fTP0.resolveFile("*p\"t5MaFq");
      assertEquals("*p\"t5MaFq", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FTP fTP0 = new FTP();
      FTP.FTPDirectoryScanner fTP_FTPDirectoryScanner0 = fTP0.new FTPDirectoryScanner((FTPClient) null);
      // Undeclared exception!
      try { 
        fTP_FTPDirectoryScanner0.scandir("T/Uas", "CqXr3$", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP$FTPDirectoryScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FTP fTP0 = new FTP();
      FTP.FTPDirectoryScanner fTP_FTPDirectoryScanner0 = fTP0.new FTPDirectoryScanner((FTPClient) null);
      // Undeclared exception!
      try { 
        fTP_FTPDirectoryScanner0.scan();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP$FTPDirectoryScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FTP.Action fTP_Action0 = new FTP.Action();
      String[] stringArray0 = fTP_Action0.getValues();
      assertEquals(10, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FTP.Action fTP_Action0 = new FTP.Action();
      // Undeclared exception!
      try { 
        fTP_Action0.getAction();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP$Action", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setVerbose(true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setUserid("@X 1W");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setUmask("4fY[@IYX");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setSkipFailedTransfers(true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setServer("");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setSeparator("hiHbg4H}");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setRemotedir("*p\"t5MaFq");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setPreserveLastModified(false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setPort((-3068));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setPassword("");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setPassive(false);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setNewer(true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setListing((File) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setIgnoreNoncriticalErrors(false);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setDepends(false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setChmod("X3vQ34[O%|_)o6o 4 R");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.setBinary(false);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FTP fTP0 = new FTP();
      fTP0.createParents((FTPClient) null, "k^n4_Pzn-");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FTP fTP0 = new FTP();
      FileSet fileSet0 = mock(FileSet.class, new ViolatedAssumptionAnswer());
      fTP0.addFileset(fileSet0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FTP fTP0 = new FTP();
      DirectoryScanner directoryScanner0 = mock(DirectoryScanner.class, new ViolatedAssumptionAnswer());
      doReturn((File) null).when(directoryScanner0).getBasedir();
      doReturn((String[]) null).when(directoryScanner0).getIncludedFiles();
      FileSet fileSet0 = mock(FileSet.class, new ViolatedAssumptionAnswer());
      doReturn(directoryScanner0).when(fileSet0).getDirectoryScanner(any(org.apache.tools.ant.Project.class));
      try { 
        fTP0.transferFiles((FTPClient) null, fileSet0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // the dir attribute must be set for send and get actions
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FTP fTP0 = new FTP();
      FileSet fileSet0 = mock(FileSet.class, new ViolatedAssumptionAnswer());
      doReturn((DirectoryScanner) null).when(fileSet0).getDirectoryScanner(any(org.apache.tools.ant.Project.class));
      // Undeclared exception!
      try { 
        fTP0.transferFiles((FTPClient) null, fileSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FTP fTP0 = new FTP();
      try { 
        fTP0.transferFiles((FTPClient) null);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // at least one fileset must be specified.
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FTP.Action fTP_Action0 = new FTP.Action();
      FTP fTP0 = new FTP();
      // Undeclared exception!
      try { 
        fTP0.setAction(fTP_Action0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP$Action", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FTP fTP0 = new FTP();
      // Undeclared exception!
      try { 
        fTP0.setAction("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FTP fTP0 = new FTP();
      // Undeclared exception!
      try { 
        fTP0.sendFile((FTPClient) null, " $QB[{wsef", "j[");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FTP fTP0 = new FTP();
      // Undeclared exception!
      try { 
        fTP0.rmDir((FTPClient) null, "4fY[@IYX");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FTP fTP0 = new FTP();
      // Undeclared exception!
      try { 
        fTP0.resolveFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FTP fTP0 = new FTP();
      // Undeclared exception!
      try { 
        fTP0.makeRemoteDir((FTPClient) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FTP fTP0 = new FTP();
      BufferedWriter bufferedWriter0 = mock(BufferedWriter.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fTP0.listFile((FTPClient) null, bufferedWriter0, ".!?#:@o");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FTP fTP0 = new FTP();
      // Undeclared exception!
      try { 
        fTP0.isUpToDate((FTPClient) null, (File) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FTP fTP0 = new FTP();
      // Undeclared exception!
      try { 
        fTP0.getFile((FTPClient) null, "", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FTP fTP0 = new FTP();
      try { 
        fTP0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // server attribute must be set!
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FTP fTP0 = new FTP();
      // Undeclared exception!
      try { 
        fTP0.doSiteCommand((FTPClient) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FTP fTP0 = new FTP();
      // Undeclared exception!
      try { 
        fTP0.delFile((FTPClient) null, "d$:O*NA%j4}7");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FTP fTP0 = new FTP();
      try { 
        fTP0.checkConfiguration();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // server attribute must be set!
         //
         verifyException("org.apache.tools.ant.taskdefs.optional.net.FTP", e);
      }
  }
}