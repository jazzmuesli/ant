/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:54:29 GMT 2020
 */

package org.apache.tools.ant.loader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import org.apache.tools.ant.loader.AntClassLoader2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AntClassLoader2_ESTest extends AntClassLoader2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AntClassLoader2 antClassLoader2_0 = new AntClassLoader2();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      String string0 = "{A1\\kzy/1\\S\\uU/U";
      antClassLoader2_0.definePackage(file0, string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AntClassLoader2 antClassLoader2_0 = new AntClassLoader2();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(file0).isDirectory();
      antClassLoader2_0.addPathFile(file0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AntClassLoader2 antClassLoader2_0 = new AntClassLoader2();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      Manifest manifest0 = mock(Manifest.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        antClassLoader2_0.definePackage(file0, (String) null, manifest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.loader.AntClassLoader2", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AntClassLoader2 antClassLoader2_0 = new AntClassLoader2();
      Manifest manifest0 = mock(Manifest.class, new ViolatedAssumptionAnswer());
      doReturn((Attributes) null).when(manifest0).getAttributes(anyString());
      doReturn((Attributes) null).when(manifest0).getMainAttributes();
      antClassLoader2_0.definePackage((File) null, "", manifest0);
      Manifest manifest1 = mock(Manifest.class, new ViolatedAssumptionAnswer());
      doReturn((Attributes) null).when(manifest1).getAttributes(anyString());
      doReturn((Attributes) null).when(manifest1).getMainAttributes();
      // Undeclared exception!
      try { 
        antClassLoader2_0.definePackage((File) null, "", manifest1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AntClassLoader2 antClassLoader2_0 = new AntClassLoader2();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        antClassLoader2_0.definePackage(file0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.loader.AntClassLoader2", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AntClassLoader2 antClassLoader2_0 = new AntClassLoader2();
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        antClassLoader2_0.defineClassFromData((File) null, byteArray0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.loader.AntClassLoader2", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AntClassLoader2 antClassLoader2_0 = new AntClassLoader2();
      String string0 = "{A1\\kzy/1\\S\\uU/U";
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        antClassLoader2_0.defineClassFromData(file0, byteArray0, string0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AntClassLoader2 antClassLoader2_0 = new AntClassLoader2();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        antClassLoader2_0.defineClassFromData(file0, byteArray0, "+*MDkABl\"Z2x%)$B<RE");
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AntClassLoader2 antClassLoader2_0 = new AntClassLoader2();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn("").when(file0).getPath();
      doReturn(false).when(file0).isDirectory();
      doReturn(0L).when(file0).lastModified();
      try { 
        antClassLoader2_0.defineClassFromData(file0, (byte[]) null, "D$.e*");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         //  (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AntClassLoader2 antClassLoader2_0 = new AntClassLoader2();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).getPath();
      doReturn(false).when(file0).isDirectory();
      // Undeclared exception!
      try { 
        antClassLoader2_0.addPathFile(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name can't be null
         //
         verifyException("java.io.FilePermission", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AntClassLoader2 antClassLoader2_0 = new AntClassLoader2();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn("").when(file0).getPath();
      doReturn(false).when(file0).isDirectory();
      doReturn(0L).when(file0).lastModified();
      try { 
        antClassLoader2_0.addPathFile(file0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         //  (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }
}