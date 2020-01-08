/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:51:41 GMT 2020
 */

package org.apache.tools.ant.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.types.Reference;
import org.apache.tools.ant.types.ResourceLocation;
import org.apache.tools.ant.types.XMLCatalog;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XMLCatalog_ESTest extends XMLCatalog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XMLCatalog xMLCatalog0 = new XMLCatalog();
      xMLCatalog0.addConfiguredXMLCatalog(xMLCatalog0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XMLCatalog xMLCatalog0 = new XMLCatalog();
      xMLCatalog0.setClasspathRef((Reference) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XMLCatalog xMLCatalog0 = new XMLCatalog();
      xMLCatalog0.setCatalogPathRef((Reference) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XMLCatalog xMLCatalog0 = new XMLCatalog();
      Path path0 = xMLCatalog0.getCatalogPath();
      assertNull(path0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XMLCatalog xMLCatalog0 = new XMLCatalog();
      Path path0 = xMLCatalog0.createClasspath();
      assertNotNull(path0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XMLCatalog xMLCatalog0 = new XMLCatalog();
      Path path0 = xMLCatalog0.createCatalogPath();
      xMLCatalog0.setClasspath(path0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XMLCatalog xMLCatalog0 = new XMLCatalog();
      ResourceLocation resourceLocation0 = mock(ResourceLocation.class, new ViolatedAssumptionAnswer());
      xMLCatalog0.addDTD(resourceLocation0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLCatalog xMLCatalog0 = new XMLCatalog();
      ResourceLocation resourceLocation0 = mock(ResourceLocation.class, new ViolatedAssumptionAnswer());
      xMLCatalog0.addEntity(resourceLocation0);
      try { 
        xMLCatalog0.setRefid((Reference) null);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // You must not specify more than one attribute when using refid
         //
         verifyException("org.apache.tools.ant.types.DataType", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XMLCatalog xMLCatalog0 = new XMLCatalog();
      // Undeclared exception!
      try { 
        xMLCatalog0.setRefid((Reference) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.XMLCatalog", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XMLCatalog xMLCatalog0 = new XMLCatalog();
      // Undeclared exception!
      try { 
        xMLCatalog0.resolveEntity("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.XMLCatalog", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XMLCatalog xMLCatalog0 = new XMLCatalog();
      // Undeclared exception!
      try { 
        xMLCatalog0.resolve("", "*8iSZQD8.Iln");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.XMLCatalog", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XMLCatalog xMLCatalog0 = new XMLCatalog();
      // Undeclared exception!
      try { 
        xMLCatalog0.addConfiguredXMLCatalog((XMLCatalog) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}