/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:33:09 GMT 2020
 */

package org.apache.tools.ant.types.optional.image;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.types.optional.image.Arc;
import org.apache.tools.ant.types.optional.image.Draw;
import org.apache.tools.ant.types.optional.image.Ellipse;
import org.apache.tools.ant.types.optional.image.Rectangle;
import org.apache.tools.ant.types.optional.image.Rotate;
import org.apache.tools.ant.types.optional.image.Scale;
import org.apache.tools.ant.types.optional.image.Text;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ImageOperation_ESTest extends ImageOperation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Text text0 = new Text();
      text0.addText(text0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      Scale scale0 = new Scale();
      rectangle0.addScale(scale0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Text text0 = new Text();
      Rotate rotate0 = new Rotate();
      text0.addRotate(rotate0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      Ellipse ellipse0 = new Ellipse();
      ellipse0.addRectangle(rectangle0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Text text0 = new Text();
      Draw draw0 = new Draw();
      text0.addDraw(draw0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Text text0 = new Text();
      text0.instructions = null;
      // Undeclared exception!
      try { 
        text0.addText(text0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.optional.image.ImageOperation", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Arc arc0 = new Arc();
      arc0.instructions = null;
      Scale scale0 = new Scale();
      // Undeclared exception!
      try { 
        arc0.addScale(scale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.optional.image.ImageOperation", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Arc arc0 = new Arc();
      Rotate rotate0 = new Rotate();
      arc0.instructions = null;
      // Undeclared exception!
      try { 
        arc0.addRotate(rotate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.optional.image.ImageOperation", e);
      }
  }
}
