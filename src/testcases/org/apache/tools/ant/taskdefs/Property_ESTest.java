/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:51:52 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.Properties;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Property;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.types.Reference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Property_ESTest extends Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Property property0 = new Property();
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      property0.setProject(project0);
      property0.setUserProperty(true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Property property0 = new Property();
      property0.setPrefix("I~T^wW`r9");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Property property0 = new Property(false);
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(project0).replaceProperties(anyString());
      property0.setProject(project0);
      property0.loadResource("");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Property property0 = new Property();
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      property0.setProject(project0);
      property0.loadEnvironment("");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Property property0 = new Property(false, project0);
      Project project1 = mock(Project.class, new ViolatedAssumptionAnswer());
      property0.setProject(project1);
      property0.addProperty("", "");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Property property0 = new Property(false, (Project) null);
      String string0 = property0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Property property0 = new Property(false, (Project) null);
      property0.setValue((String) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Property property0 = new Property(false, (Project) null);
      property0.setResource((String) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Property property0 = new Property();
      property0.setRefid((Reference) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Property property0 = new Property(false, project0);
      property0.setName("");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Property property0 = new Property(false, (Project) null);
      property0.setFile((File) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Property property0 = new Property();
      property0.setEnvironment("");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Property property0 = new Property(false);
      property0.setClasspathRef((Reference) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Property property0 = new Property();
      property0.setClasspath((Path) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Property property0 = new Property(false, project0);
      String string0 = property0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Property property0 = new Property(true);
      String string0 = property0.getResource();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Property property0 = new Property(true);
      Reference reference0 = property0.getRefid();
      assertNull(reference0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Property property0 = new Property(true);
      String string0 = property0.getPrefix();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Property property0 = new Property(false, (Project) null);
      String string0 = property0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Property property0 = new Property(true);
      File file0 = property0.getFile();
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Property property0 = new Property(true);
      String string0 = property0.getEnvironment();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Property property0 = new Property();
      Path path0 = property0.getClasspath();
      assertNull(path0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Property property0 = new Property();
      Path path0 = property0.createClasspath();
      assertNotNull(path0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Property property0 = new Property(false);
      // Undeclared exception!
      try { 
        property0.setUserProperty(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Property property0 = new Property(false, project0);
      // Undeclared exception!
      try { 
        property0.setPrefix((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Property property0 = new Property(false, (Project) null);
      // Undeclared exception!
      try { 
        property0.setLocation((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Property property0 = new Property();
      // Undeclared exception!
      try { 
        property0.loadResource("b");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Property property0 = new Property(true);
      // Undeclared exception!
      try { 
        property0.loadFile((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Property property0 = new Property(true);
      // Undeclared exception!
      try { 
        property0.loadEnvironment("`;HL");
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
      Property property0 = new Property(false);
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      property0.setProject(project0);
      try { 
        property0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // You must specify file, resource or environment when not using the name attribute
         //
         verifyException("org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Property property0 = new Property(false);
      // Undeclared exception!
      try { 
        property0.execute();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // project has not been set
         //
         verifyException("org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Property property0 = new Property();
      // Undeclared exception!
      try { 
        property0.addProperty("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Property property0 = new Property(false, project0);
      // Undeclared exception!
      try { 
        property0.addProperties((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Property", e);
      }
  }
}