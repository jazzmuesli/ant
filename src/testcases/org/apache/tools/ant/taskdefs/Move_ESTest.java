/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:51:09 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.taskdefs.Move;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Move_ESTest extends Move_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Move move0 = new Move();
      boolean boolean0 = move0.renameFile((File) null, (File) null, true, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Move move0 = new Move();
      move0.doFileOperations();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Move move0 = new Move();
      // Undeclared exception!
      try { 
        move0.renameFile((File) null, (File) null, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Move", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Move move0 = new Move();
      // Undeclared exception!
      try { 
        move0.okToDelete((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Move", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Move move0 = new Move();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "SBp4eDV.AC-O1r/%/F";
      move0.scan((File) null, (File) null, stringArray0, stringArray0);
      // Undeclared exception!
      try { 
        move0.doFileOperations();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Move", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Move move0 = new Move();
      // Undeclared exception!
      try { 
        move0.deleteDir((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Move", e);
      }
  }
}
