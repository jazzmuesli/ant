/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:07:07 GMT 2020
 */

package org.apache.tools.bzip2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.bzip2.CRC;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CRC_ESTest extends CRC_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CRC cRC0 = new CRC();
      cRC0.updateCRC((-1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CRC cRC0 = new CRC();
      cRC0.initialiseCRC();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CRC cRC0 = new CRC();
      cRC0.globalCrc = 1;
      cRC0.globalCrc = 0;
      int int0 = cRC0.getGlobalCRC();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CRC cRC0 = new CRC();
      cRC0.globalCrc = 1;
      int int0 = cRC0.getGlobalCRC();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CRC cRC0 = new CRC();
      cRC0.setGlobalCRC((-3416));
      int int0 = cRC0.getFinalCRC();
      assertEquals(3415, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CRC cRC0 = new CRC();
      cRC0.globalCrc = 0;
      int int0 = cRC0.getFinalCRC();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CRC cRC0 = new CRC();
      CRC.crc32Table = null;
      // Undeclared exception!
      try { 
        cRC0.updateCRC((-632));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.bzip2.CRC", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CRC cRC0 = new CRC();
      // Undeclared exception!
      try { 
        cRC0.updateCRC(3415);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3160
         //
         verifyException("org.apache.tools.bzip2.CRC", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CRC cRC0 = new CRC();
      cRC0.updateCRC(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CRC cRC0 = new CRC();
      int int0 = cRC0.getGlobalCRC();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CRC cRC0 = new CRC();
      int int0 = cRC0.getFinalCRC();
      assertEquals(0, int0);
  }
}
