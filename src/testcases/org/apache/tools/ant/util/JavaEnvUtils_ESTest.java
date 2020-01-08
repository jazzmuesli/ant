/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:59:16 GMT 2020
 */

package org.apache.tools.ant.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Vector;
import org.apache.tools.ant.util.JavaEnvUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaEnvUtils_ESTest extends JavaEnvUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = JavaEnvUtils.isJavaVersion("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = JavaEnvUtils.getJrePackages();
      assertEquals("[org.apache.crimson, org.apache.xalan, org.apache.xml, org.apache.xpath, org.ietf.jgss, org.w3c.dom, org.xml.sax, org.omg, com.sun.corba, com.sun.jndi, com.sun.media, com.sun.naming, com.sun.org.omg, com.sun.rmi, sunw.io, sunw.util, com.sun.java, com.sun.image, sun, java, javax]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = JavaEnvUtils.getJrePackageTestCases();
      assertFalse(vector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = JavaEnvUtils.getJreExecutable(" _`C|40Z:zc#Gp");
      assertEquals(" _`C|40Z:zc#Gp", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = JavaEnvUtils.getJdkExecutable("1.4");
      assertEquals("1.4", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = JavaEnvUtils.getJavaVersion();
      assertEquals("1.4", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JavaEnvUtils javaEnvUtils0 = new JavaEnvUtils();
  }
}