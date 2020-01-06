/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:28:31 GMT 2020
 */

package org.apache.tools.ant.types.optional.image;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.media.jai.PlanarImage;
import org.apache.tools.ant.types.optional.image.Draw;
import org.apache.tools.ant.types.optional.image.Scale;
import org.apache.tools.ant.types.optional.image.Text;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Scale_ESTest extends Scale_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Scale scale0 = new Scale();
      float float0 = scale0.getWidth();
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Scale scale0 = new Scale();
      float float0 = scale0.getHeight();
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Scale scale0 = new Scale();
      PlanarImage planarImage0 = scale0.executeDrawOperation();
      assertNull(planarImage0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Scale scale0 = new Scale();
      scale0.setKeepproportions(true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Scale scale0 = new Scale();
      scale0.setHeight("x(#I.4knt");
      // Undeclared exception!
      try { 
        scale0.performScale((PlanarImage) null);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Scale scale0 = new Scale();
      scale0.setHeight((String) null);
      // Undeclared exception!
      try { 
        scale0.performScale((PlanarImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.optional.image.Scale", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Scale scale0 = new Scale();
      // Undeclared exception!
      try { 
        scale0.performScale((PlanarImage) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // operation \"Scale\" requires all source objects to be valid input; a null is supplied.
         //
         verifyException("javax.media.jai.JAI", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Scale scale0 = new Scale();
      scale0.setWidth("");
      // Undeclared exception!
      try { 
        scale0.getWidth();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Scale scale0 = new Scale();
      scale0.setWidth((String) null);
      // Undeclared exception!
      try { 
        scale0.getWidth();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.optional.image.Scale", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Scale scale0 = new Scale();
      scale0.setHeight("");
      // Undeclared exception!
      try { 
        scale0.getHeight();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Scale scale0 = new Scale();
      scale0.setHeight((String) null);
      // Undeclared exception!
      try { 
        scale0.getHeight();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.optional.image.Scale", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Scale scale0 = new Scale();
      scale0.setWidth("");
      // Undeclared exception!
      try { 
        scale0.executeTransformOperation((PlanarImage) null);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Scale scale0 = new Scale();
      Draw draw0 = mock(Draw.class, new ViolatedAssumptionAnswer());
      scale0.addDraw(draw0);
      // Undeclared exception!
      try { 
        scale0.executeTransformOperation((PlanarImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.optional.image.Scale", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Scale scale0 = new Scale();
      // Undeclared exception!
      try { 
        scale0.executeTransformOperation((PlanarImage) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // operation \"Scale\" requires all source objects to be valid input; a null is supplied.
         //
         verifyException("javax.media.jai.JAI", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Scale scale0 = new Scale();
      scale0.addScale(scale0);
      scale0.setHeight("");
      // Undeclared exception!
      try { 
        scale0.executeDrawOperation();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Scale scale0 = new Scale();
      Text text0 = mock(Text.class, new ViolatedAssumptionAnswer());
      scale0.setHeight((String) null);
      scale0.addText(text0);
      // Undeclared exception!
      try { 
        scale0.executeDrawOperation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.optional.image.Scale", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Scale scale0 = new Scale();
      Text text0 = mock(Text.class, new ViolatedAssumptionAnswer());
      scale0.addText(text0);
      // Undeclared exception!
      try { 
        scale0.executeDrawOperation();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // operation \"Scale\" requires all source objects to be valid input; a null is supplied.
         //
         verifyException("javax.media.jai.JAI", e);
      }
  }
}
