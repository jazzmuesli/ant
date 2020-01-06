/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 22:35:36 GMT 2020
 */

package org.apache.tools.ant.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.apache.tools.ant.RuntimeConfigurable;
import org.apache.tools.ant.Target;
import org.apache.tools.ant.helper.AntXMLContext;
import org.apache.tools.ant.helper.ProjectHelper2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xml.sax.AttributeList;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXParseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProjectHelper2_ESTest extends ProjectHelper2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      doReturn((Locator) null).when(antXMLContext0).getLocator();
      ProjectHelper2.MainHandler projectHelper2_MainHandler0 = new ProjectHelper2.MainHandler();
      try { 
        projectHelper2_MainHandler0.onStartChild("Couldn't get a file list from filespec", "Couldn't get a file list from filespec", "sT/$QL<4*", (Attributes) null, antXMLContext0);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Unexpected element \"sT/$QL<4*\" Couldn't get a file list from filespec
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2$MainHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      ProjectHelper2 projectHelper2_0 = new ProjectHelper2();
      Project project0 = new Project();
      AntXMLContext antXMLContext1 = new AntXMLContext(project0);
      Project project1 = antXMLContext1.getProject();
      // Undeclared exception!
      try { 
        projectHelper2_0.parse(project1, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ProjectHelper2.ProjectHandler projectHelper2_ProjectHandler0 = new ProjectHelper2.ProjectHandler();
      projectHelper2_ProjectHandler0.checkNamespace("");
      projectHelper2_ProjectHandler0.checkNamespace("[]u{e= F5f");
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_ProjectHandler0.onEndChild("[]u{e= F5f", "!G;~W<", "!G;~W<", antXMLContext0);
      ProjectHelper2.ElementHandler projectHelper2_ElementHandler0 = new ProjectHelper2.ElementHandler();
      char[] charArray0 = new char[8];
      charArray0[0] = 'x';
      charArray0[5] = '*';
      charArray0[2] = 'G';
      charArray0[3] = 'h';
      charArray0[4] = '~';
      charArray0[5] = '';
      AntXMLContext antXMLContext1 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_ElementHandler0.onEndElement("", "[]u{e= F5f", antXMLContext1);
      charArray0[6] = 'K';
      charArray0[7] = '!';
      RuntimeConfigurable runtimeConfigurable0 = mock(RuntimeConfigurable.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext2 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      doReturn(runtimeConfigurable0).when(antXMLContext2).currentWrapper();
      ProjectHelper2 projectHelper2_0 = new ProjectHelper2();
      projectHelper2_ElementHandler0.characters(charArray0, (-848), (-848), antXMLContext2);
      assertArrayEquals(new char[] {'x', '\u0000', 'G', 'h', '~', '', 'K', '!'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ProjectHelper2.TargetHandler projectHelper2_TargetHandler0 = new ProjectHelper2.TargetHandler();
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      Target target0 = mock(Target.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      doReturn(target0).when(antXMLContext0).getImplicitTarget();
      projectHelper2_TargetHandler0.onEndElement("BB<=3@}'RAgM9htJ9", "BB<=3@}'RAgM9htJ9", antXMLContext0);
      AntXMLContext antXMLContext1 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_TargetHandler0.onStartChild("BB<=3@}'RAgM9htJ9", "BB<=3@}'RAgM9htJ9", "BB<=3@}'RAgM9htJ9", attributes0, antXMLContext1);
      Target target1 = mock(Target.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext2 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      doReturn(target1).when(antXMLContext2).getImplicitTarget();
      projectHelper2_TargetHandler0.onEndElement("BB<=3@}'RAgM9htJ9", "BB<=3@}'RAgM9htJ9", antXMLContext2);
      ProjectHelper2 projectHelper2_0 = new ProjectHelper2();
      projectHelper2_0.getImportStack();
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      doReturn("BB<=3@}'RAgM9htJ9").when(project0).getReference(anyString());
      // Undeclared exception!
      try { 
        projectHelper2_0.parse(project0, (Object) "BB<=3@}'RAgM9htJ9");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.tools.ant.helper.AntXMLContext
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProjectHelper2.MainHandler projectHelper2_MainHandler0 = new ProjectHelper2.MainHandler();
      ProjectHelper2.ElementHandler projectHelper2_ElementHandler0 = new ProjectHelper2.ElementHandler();
      ProjectHelper2.TargetHandler projectHelper2_TargetHandler0 = new ProjectHelper2.TargetHandler();
      String string0 = "";
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_TargetHandler0.onStartChild("", "", "", attributes0, antXMLContext0);
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext1 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      doReturn(project0).when(antXMLContext1).getProject();
      ProjectHelper2.RootHandler projectHelper2_RootHandler0 = new ProjectHelper2.RootHandler(antXMLContext1);
      char[] charArray0 = new char[7];
      charArray0[0] = '[';
      charArray0[1] = ']';
      charArray0[2] = 'R';
      charArray0[3] = 'n';
      charArray0[4] = '{';
      charArray0[5] = '\"';
      charArray0[6] = ')';
      projectHelper2_RootHandler0.characters(charArray0, 0, 0);
      projectHelper2_RootHandler0.resolveEntity("", "");
      ProjectHelper2 projectHelper2_0 = new ProjectHelper2();
      Project project1 = mock(Project.class, new ViolatedAssumptionAnswer());
      try { 
        projectHelper2_0.parse(project1, (Object) projectHelper2_RootHandler0, projectHelper2_RootHandler0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Source org.apache.tools.ant.helper.ProjectHelper2$RootHandler not supported by this plugin
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      doReturn((Project) null).when(antXMLContext0).getProject();
      ProjectHelper2.RootHandler projectHelper2_RootHandler0 = new ProjectHelper2.RootHandler(antXMLContext0);
      // Undeclared exception!
      try { 
        projectHelper2_RootHandler0.resolveEntity((String) null, "-!r'uLg");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2$RootHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      ProjectHelper2.RootHandler projectHelper2_RootHandler0 = new ProjectHelper2.RootHandler(antXMLContext0);
      projectHelper2_RootHandler0.notationDecl("h:;'`0j<~i#]", "Ec,eU?L", "Ec,eU?L");
      projectHelper2_RootHandler0.endElement("~VZ", "~VZ", "~VZ");
      ProjectHelper2.ProjectHandler projectHelper2_ProjectHandler0 = new ProjectHelper2.ProjectHandler();
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        projectHelper2_ProjectHandler0.onStartElement("~VZ", "", "h:;'`0j<~i#]", attributes0, (AntXMLContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2$ProjectHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ProjectHelper2.TargetHandler projectHelper2_TargetHandler0 = new ProjectHelper2.TargetHandler();
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_TargetHandler0.onEndChild("n~", "n~", "n~", antXMLContext0);
      char[] charArray0 = new char[3];
      charArray0[0] = 'X';
      charArray0[1] = '.';
      charArray0[2] = '>';
      AntXMLContext antXMLContext1 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_TargetHandler0.characters(charArray0, 0, 0, antXMLContext1);
      projectHelper2_TargetHandler0.checkNamespace("");
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(attributes0).getLength();
      AntXMLContext antXMLContext2 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      doReturn((Locator) null).when(antXMLContext2).getLocator();
      doReturn((Project) null).when(antXMLContext2).getProject();
      try { 
        projectHelper2_TargetHandler0.onStartElement("HL~3D", "", "", attributes0, antXMLContext2);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // target element appears without a name attribute
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2$TargetHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ProjectHelper2.AntHandler projectHelper2_AntHandler0 = new ProjectHelper2.AntHandler();
      String string0 = "D-^Y@3_DH9y^0E('x*";
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      char[] charArray0 = new char[7];
      charArray0[0] = 'L';
      charArray0[1] = 'z';
      charArray0[2] = '@';
      charArray0[3] = ')';
      charArray0[4] = '}';
      charArray0[5] = '&';
      charArray0[6] = '!';
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        projectHelper2_AntHandler0.characters(charArray0, 0, 1184, antXMLContext0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ProjectHelper2.AntHandler projectHelper2_AntHandler0 = new ProjectHelper2.AntHandler();
      projectHelper2_AntHandler0.checkNamespace("h~l-b^");
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_AntHandler0.onStartElement("", "", "", attributes0, antXMLContext0);
      AntXMLContext antXMLContext1 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_AntHandler0.onEndElement("v2]uM=`Gro|", "\"B/agSKP", antXMLContext1);
      Attributes attributes1 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext2 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_AntHandler0.onStartElement("", "98)t,FL", "", attributes1, antXMLContext2);
      projectHelper2_AntHandler0.checkNamespace("(_#Ihv^;8");
      AntXMLContext antXMLContext3 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_AntHandler0.onEndChild("", "GXZd}Eb^#.$Z&=o", "", antXMLContext3);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProjectHelper2.ElementHandler projectHelper2_ElementHandler0 = new ProjectHelper2.ElementHandler();
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      ProjectHelper2.AntHandler projectHelper2_AntHandler0 = projectHelper2_ElementHandler0.onStartChild((String) null, ";(P6eGLiV", "/?sK;9vJ[yx*R!9R;90", attributes0, antXMLContext0);
      Attributes attributes1 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext1 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_ElementHandler0.onEndChild("", "", ";(P6eGLiV", antXMLContext1);
      AntXMLContext antXMLContext2 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      ProjectHelper2.AntHandler projectHelper2_AntHandler1 = projectHelper2_ElementHandler0.onStartChild(";(P6eGLiV", ";(P6eGLiV", (String) null, attributes1, antXMLContext2);
      assertSame(projectHelper2_AntHandler1, projectHelper2_AntHandler0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ProjectHelper2 projectHelper2_0 = new ProjectHelper2();
      AttributeList attributeList0 = mock(AttributeList.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(attributeList0).getLength();
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      ProjectHelper.configure(projectHelper2_0, attributeList0, project0);
      Project project1 = mock(Project.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      ProjectHelper2.RootHandler projectHelper2_RootHandler0 = new ProjectHelper2.RootHandler(antXMLContext0);
      char[] charArray0 = new char[3];
      charArray0[0] = '\'';
      charArray0[1] = '=';
      charArray0[2] = 'a';
      projectHelper2_RootHandler0.characters(charArray0, 0, 0);
      char[] charArray1 = new char[2];
      charArray1[0] = 'P';
      charArray1[1] = 'Y';
      projectHelper2_RootHandler0.ignorableWhitespace(charArray1, 1, 0);
      try { 
        projectHelper2_0.parse(project1, (Object) project1, projectHelper2_RootHandler0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Source org.apache.tools.ant.Project$MockitoMock$451916143 not supported by this plugin
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ProjectHelper2.ProjectHandler projectHelper2_ProjectHandler0 = new ProjectHelper2.ProjectHandler();
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_ProjectHandler0.onEndElement("", "", antXMLContext0);
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      projectHelper2_ProjectHandler0.onStartChild("", "", "", attributes0, (AntXMLContext) null);
      projectHelper2_ProjectHandler0.onEndChild("", "", "", (AntXMLContext) null);
      ProjectHelper2.ElementHandler projectHelper2_ElementHandler0 = new ProjectHelper2.ElementHandler();
      char[] charArray0 = new char[9];
      charArray0[0] = '%';
      charArray0[1] = 'V';
      charArray0[2] = 'J';
      charArray0[3] = 'E';
      charArray0[4] = '_';
      charArray0[5] = '@';
      charArray0[6] = '@';
      charArray0[7] = 'B';
      charArray0[8] = 'R';
      // Undeclared exception!
      try { 
        projectHelper2_ElementHandler0.characters(charArray0, 0, 0, (AntXMLContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2$ElementHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProjectHelper2.ElementHandler projectHelper2_ElementHandler0 = new ProjectHelper2.ElementHandler();
      char[] charArray0 = new char[5];
      charArray0[0] = ']';
      charArray0[1] = '=';
      charArray0[2] = 'J';
      charArray0[3] = 'O';
      charArray0[4] = 'i';
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      doReturn((RuntimeConfigurable) null).when(antXMLContext0).currentWrapper();
      // Undeclared exception!
      try { 
        projectHelper2_ElementHandler0.characters(charArray0, 4187, 4187, antXMLContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2$ElementHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ProjectHelper2.ElementHandler projectHelper2_ElementHandler0 = new ProjectHelper2.ElementHandler();
      String string0 = ",zqm8_$";
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_ElementHandler0.onEndElement("", ",zqm8_$", antXMLContext0);
      AntXMLContext antXMLContext1 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      doReturn((RuntimeConfigurable) null).when(antXMLContext1).currentWrapper();
      doReturn((Locator) null).when(antXMLContext1).getLocator();
      doReturn((Project) null).when(antXMLContext1).getProject();
      // Undeclared exception!
      try { 
        projectHelper2_ElementHandler0.onStartElement(",zqm8_$", "", "", attributes0, antXMLContext1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2$ElementHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ProjectHelper2.AntHandler projectHelper2_AntHandler0 = new ProjectHelper2.AntHandler();
      ProjectHelper2.MainHandler projectHelper2_MainHandler0 = new ProjectHelper2.MainHandler();
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      doReturn((Locator) null).when(antXMLContext0).getLocator();
      try { 
        projectHelper2_MainHandler0.onStartChild("q^ngK`|ocIj7U06kl", "q^ngK`|ocIj7U06kl", "q^ngK`|ocIj7U06kl", attributes0, antXMLContext0);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Unexpected element \"q^ngK`|ocIj7U06kl\" q^ngK`|ocIj7U06kl
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2$MainHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ProjectHelper2 projectHelper2_0 = new ProjectHelper2();
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      Project project1 = mock(Project.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(project1).getReference(anyString());
      String string0 = "NFE) 5Lg";
      try { 
        projectHelper2_0.parse(project1, (Object) "NFE) 5Lg");
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // Source java.lang.String not supported by this plugin
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      ProjectHelper2.RootHandler projectHelper2_RootHandler0 = new ProjectHelper2.RootHandler(antXMLContext0);
      Locator locator0 = mock(Locator.class, new ViolatedAssumptionAnswer());
      projectHelper2_RootHandler0.setDocumentLocator(locator0);
      ProjectHelper2.TargetHandler projectHelper2_TargetHandler0 = new ProjectHelper2.TargetHandler();
      AntXMLContext antXMLContext1 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      doReturn((Target) null).when(antXMLContext1).getImplicitTarget();
      projectHelper2_TargetHandler0.onEndElement("", "", antXMLContext1);
      ProjectHelper2.ElementHandler projectHelper2_ElementHandler0 = new ProjectHelper2.ElementHandler();
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext2 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      ProjectHelper2.AntHandler projectHelper2_AntHandler0 = projectHelper2_ElementHandler0.onStartChild("", "", "jQ7?fF92+O", attributes0, antXMLContext2);
      assertNotSame(projectHelper2_ElementHandler0, projectHelper2_AntHandler0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ProjectHelper2.ElementHandler projectHelper2_ElementHandler0 = new ProjectHelper2.ElementHandler();
      String string0 = "evw;Q/";
      String string1 = "r\\%D{~$Q1XDRi%;V{";
      AntXMLContext antXMLContext0 = null;
      // Undeclared exception!
      try { 
        projectHelper2_ElementHandler0.onEndElement("evw;Q/", "r%D{~$Q1XDRi%;V{", (AntXMLContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2$ElementHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ProjectHelper2.ProjectHandler projectHelper2_ProjectHandler0 = new ProjectHelper2.ProjectHandler();
      ProjectHelper2.ElementHandler projectHelper2_ElementHandler0 = new ProjectHelper2.ElementHandler();
      ProjectHelper2.RootHandler projectHelper2_RootHandler0 = new ProjectHelper2.RootHandler((AntXMLContext) null);
      char[] charArray0 = new char[7];
      charArray0[0] = 'k';
      charArray0[1] = 'R';
      charArray0[2] = 'J';
      charArray0[3] = '8';
      charArray0[4] = 'h';
      charArray0[5] = 't';
      charArray0[6] = ' ';
      projectHelper2_RootHandler0.characters(charArray0, 0, 0);
      assertEquals(7, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ProjectHelper2.TargetHandler projectHelper2_TargetHandler0 = new ProjectHelper2.TargetHandler();
      String string0 = "";
      String string1 = "";
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      Attributes attributes1 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_TargetHandler0.onStartChild("", "", "=;%&", attributes1, antXMLContext0);
      String string2 = "";
      AntXMLContext antXMLContext1 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        projectHelper2_TargetHandler0.onEndElement("", "", (AntXMLContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2$TargetHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ProjectHelper2.MainHandler projectHelper2_MainHandler0 = new ProjectHelper2.MainHandler();
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      projectHelper2_MainHandler0.onStartElement("Whk}", "Whk}", "", attributes0, antXMLContext0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AntXMLContext antXMLContext0 = null;
      ProjectHelper2.RootHandler projectHelper2_RootHandler0 = new ProjectHelper2.RootHandler((AntXMLContext) null);
      String string0 = "";
      String string1 = "";
      projectHelper2_RootHandler0.endElement("", "", "");
      projectHelper2_RootHandler0.endDocument();
      String string2 = "F.$\"TU_%$:B}G,&^L";
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        projectHelper2_RootHandler0.startElement("F.$\"TU_%$:B}G,&^L", "", "", attributes0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2$MainHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ProjectHelper2.RootHandler projectHelper2_RootHandler0 = new ProjectHelper2.RootHandler((AntXMLContext) null);
      char[] charArray0 = new char[3];
      charArray0[0] = ',';
      charArray0[1] = 'e';
      charArray0[2] = '=';
      // Undeclared exception!
      try { 
        projectHelper2_RootHandler0.characters(charArray0, (-2795), (-826));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ProjectHelper2.TargetHandler projectHelper2_TargetHandler0 = new ProjectHelper2.TargetHandler();
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(attributes0).getLength();
      AntXMLContext antXMLContext0 = mock(AntXMLContext.class, new ViolatedAssumptionAnswer());
      doReturn((Locator) null).when(antXMLContext0).getLocator();
      doReturn((Project) null).when(antXMLContext0).getProject();
      try { 
        projectHelper2_TargetHandler0.onStartElement("", "", "", attributes0, antXMLContext0);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // target element appears without a name attribute
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2$TargetHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ProjectHelper2 projectHelper2_0 = new ProjectHelper2();
      Project project0 = mock(Project.class, new ViolatedAssumptionAnswer());
      ProjectHelper2.RootHandler projectHelper2_RootHandler0 = null;
      // Undeclared exception!
      try { 
        projectHelper2_0.parse(project0, (Object) project0, (ProjectHelper2.RootHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.helper.ProjectHelper2$RootHandler", e);
      }
  }
}
