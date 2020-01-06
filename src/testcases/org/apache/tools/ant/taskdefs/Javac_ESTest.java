/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 05 21:58:17 GMT 2020
 */

package org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Location;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.RuntimeConfigurable;
import org.apache.tools.ant.taskdefs.Javac;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.types.Reference;
import org.apache.tools.ant.types.selectors.AndSelector;
import org.apache.tools.ant.types.selectors.ContainsRegexpSelector;
import org.apache.tools.ant.types.selectors.ContainsSelector;
import org.apache.tools.ant.types.selectors.NoneSelector;
import org.apache.tools.ant.types.selectors.NotSelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Javac_ESTest extends Javac_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.createInclude();
      javac0.setSource("");
      javac0.setMemoryInitialSize("`s~v|?0/~vG[(lb{B");
      javac0.setFork(true);
      Javac.ImplementationSpecificArgument javac_ImplementationSpecificArgument0 = javac0.createCompilerArg();
      javac_ImplementationSpecificArgument0.getProject();
      javac_ImplementationSpecificArgument0.setCompiler("9;ee\"HA4q#");
      javac_ImplementationSpecificArgument0.setValue("");
      javac_ImplementationSpecificArgument0.getParts("`s~v|?0/~vG[(lb{B");
      javac0.setSource("2HH'{jFNFb%aAa");
      javac_ImplementationSpecificArgument0.getParts();
      javac_ImplementationSpecificArgument0.setCompiler("");
      javac0.getJavacExecutable();
      // Undeclared exception!
      try { 
        javac0.getCompiler();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.getVerbose();
      javac0.getSrcdir();
      javac0.getMemoryInitialSize();
      javac0.setIncludeantruntime(true);
      Reference reference0 = mock(Reference.class, new ViolatedAssumptionAnswer());
      javac0.setSourcepathRef(reference0);
      javac0.getBootclasspath();
      javac0.setSourcepathRef((Reference) null);
      Javac javac1 = new Javac();
      javac1.getDestdir();
      String[] stringArray0 = new String[0];
      javac0.scanDir((File) null, (File) null, stringArray0);
      assertFalse(javac0.equals((Object)javac1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Javac javac0 = new Javac();
      Reference reference0 = mock(Reference.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(reference0).getRefId();
      doReturn((Object) null, (Object) null).when(reference0).getReferencedObject(any(org.apache.tools.ant.Project.class));
      javac0.setClasspathRef(reference0);
      NoneSelector noneSelector0 = mock(NoneSelector.class, new ViolatedAssumptionAnswer());
      javac0.addNone(noneSelector0);
      Path path0 = javac0.getClasspath();
      javac0.setNowarn(true);
      javac0.setFork(true);
      javac0.setIncludeantruntime(true);
      javac0.getIncludeantruntime();
      javac0.getSystemJavac();
      javac0.getMemoryInitialSize();
      javac0.getSource();
      // Undeclared exception!
      try { 
        javac0.setClasspath(path0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // null doesn't denote a path null
         //
         verifyException("org.apache.tools.ant.types.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Javac javac0 = new Javac();
      RuntimeConfigurable runtimeConfigurable0 = javac0.getRuntimeConfigurableWrapper();
      javac0.setRuntimeConfigurableWrapper(runtimeConfigurable0);
      Javac.ImplementationSpecificArgument javac_ImplementationSpecificArgument0 = javac0.new ImplementationSpecificArgument();
      boolean boolean0 = true;
      javac0.setDebug(true);
      javac0.setListfiles(true);
      // Undeclared exception!
      try { 
        javac0.getCompilerVersion();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.getRuntimeConfigurableWrapper();
      javac0.setVerbose(false);
      javac0.getSourcepath();
      javac0.createIncludesFile();
      javac0.setFork(true);
      javac0.getOwningTarget();
      javac0.getTaskName();
      javac0.setDeprecation(true);
      javac0.setCaseSensitive(true);
      javac0.setTaskName("bv)NoT@WhMb?`7wSYri");
      javac0.getDebugLevel();
      javac0.setMemoryInitialSize((String) null);
      javac0.getSelectors((Project) null);
      Path path0 = javac0.createBootclasspath();
      javac0.isForkedJavac();
      javac0.getDebug();
      javac0.createBootclasspath();
      javac0.getSystemJavac();
      javac0.setSourcepath(path0);
      javac0.getIncludeantruntime();
      Reference reference0 = mock(Reference.class, new ViolatedAssumptionAnswer());
      javac0.setClasspathRef(reference0);
      javac0.setDepend(true);
      javac0.setNowarn(false);
      String string0 = javac0.getMemoryMaximumSize();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.getExtdirs();
      javac0.getDeprecation();
      javac0.setClasspath((Path) null);
      boolean boolean0 = false;
      javac0.setIncludejavaruntime(false);
      String string0 = "r6:G^\\n";
      javac0.setMemoryMaximumSize("r6:G^\n");
      Javac javac1 = new Javac();
      javac1.getDestdir();
      // Undeclared exception!
      try { 
        javac0.setExcludesfile((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.PatternSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.setFork(false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.getEncoding();
      javac0.getTarget();
      javac0.maybeConfigure();
      javac0.getDestdir();
      javac0.setDestdir((File) null);
      javac0.getDeprecation();
      // Undeclared exception!
      try { 
        javac0.isForkedJavac();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.hasSelectors();
      Path path0 = javac0.createClasspath();
      javac0.getOptimize();
      javac0.setClasspath(path0);
      javac0.getSourcepath();
      javac0.getIncludejavaruntime();
      javac0.getBootclasspath();
      javac0.setExtdirs((Path) null);
      javac0.getDestdir();
      // Undeclared exception!
      try { 
        javac0.setExcludesfile((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.types.PatternSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.createCompilerArg();
      javac0.getDestdir();
      String[] stringArray0 = new String[3];
      stringArray0[1] = "c@}";
      stringArray0[2] = "";
      javac0.createSourcepath();
      javac0.setCompiler("<LmObN9~");
      javac0.setMemoryMaximumSize(stringArray0[0]);
      javac0.setSourcepathRef((Reference) null);
      javac0.getNowarn();
      Path path0 = javac0.getBootclasspath();
      assertNull(path0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.getSrcdir();
      javac0.setClasspath((Path) null);
      javac0.setFailonerror(true);
      javac0.createExtdirs();
      javac0.getDestdir();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "^[W{-;GV5jDL8JPkt";
      // Undeclared exception!
      try { 
        javac0.scanDir((File) null, (File) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.selectorCount();
      // Undeclared exception!
      try { 
        javac0.getCompiler();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Javac javac0 = new Javac();
      boolean boolean0 = true;
      javac0.setCaseSensitive(false);
      javac0.getFileList();
      javac0.setProceed(true);
      AndSelector andSelector0 = mock(AndSelector.class, new ViolatedAssumptionAnswer());
      javac0.addAnd(andSelector0);
      try { 
        javac0.checkParameters();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // srcdir attribute must be set!
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.getDescription();
      javac0.getFailonerror();
      javac0.getSrcdir();
      javac0.setTaskType((String) null);
      javac0.getVerbose();
      javac0.hasSelectors();
      javac0.setProceed(true);
      javac0.createCompilerArg();
      Path path0 = javac0.createBootclasspath();
      Path path1 = javac0.getBootclasspath();
      assertFalse(path1.equals((Object)path0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.getSystemJavac();
      javac0.getDebugLevel();
      boolean boolean0 = true;
      javac0.failOnError = true;
      javac0.getClasspath();
      javac0.setExtdirs((Path) null);
      javac0.getDestdir();
      javac0.getClasspath();
      Reference reference0 = mock(Reference.class, new ViolatedAssumptionAnswer());
      javac0.setClasspathRef(reference0);
      // Undeclared exception!
      try { 
        javac0.XsetItems("/usr/lib/jvm/java-8-openjdk-amd64/bin/javac");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.getDebugLevel();
      javac0.getFileList();
      javac0.setTarget((String) null);
      javac0.getVerbose();
      Javac.ImplementationSpecificArgument javac_ImplementationSpecificArgument0 = javac0.createCompilerArg();
      javac_ImplementationSpecificArgument0.setLine("");
      javac_ImplementationSpecificArgument0.setCompiler((String) null);
      javac0.getExtdirs();
      javac0.setSrcdir((Path) null);
      javac0.getListfiles();
      javac0.getFailonerror();
      javac0.getVerbose();
      javac0.getTarget();
      Path path0 = javac0.recreateSrc();
      assertNotNull(path0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.setSource("};XFOfQAN9");
      Location location0 = javac0.getLocation();
      javac0.setLocation(location0);
      javac0.getEncoding();
      javac0.setCompiler((String) null);
      javac0.setListfiles(false);
      javac0.listFiles = false;
      Reference reference0 = mock(Reference.class, new ViolatedAssumptionAnswer());
      javac0.setBootClasspathRef(reference0);
      javac0.setSource((String) null);
      javac0.setProceed(false);
      javac0.getDebug();
      javac0.createSourcepath();
      javac0.createSrc();
      javac0.getExtdirs();
      javac0.setProceed(true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.getMemoryInitialSize();
      javac0.setTaskName("");
      javac0.setTarget("uKyQgY+%zO:r");
      javac0.getIncludejavaruntime();
      javac0.setExcludes("YDEi~ocF6z");
      Location location0 = javac0.getLocation();
      javac0.setLocation(location0);
      javac0.createSourcepath();
      javac0.getFileList();
      javac0.setFollowSymlinks(false);
      javac0.setDebugLevel((String) null);
      javac0.setVerbose(true);
      javac0.setExecutable("C3GUmFmF");
      // Undeclared exception!
      try { 
        javac0.getCurrentCompilerArgs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Javac javac0 = new Javac();
      // Undeclared exception!
      try { 
        javac0.getJavacExecutable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.setDebugLevel("SCG<o<Hc");
      javac0.getDebug();
      javac0.setDeprecation(true);
      javac0.setExecutable("SCG<o<Hc");
      javac0.getSourcepath();
      javac0.setExtdirs((Path) null);
      javac0.getProject();
      javac0.getSelectors((Project) null);
      javac0.setDebug(true);
      javac0.createExtdirs();
      javac0.setListfiles(false);
      javac0.setVerbose(true);
      javac0.setEncoding("");
      javac0.isJdkCompiler("1)?VG");
      javac0.getDeprecation();
      javac0.setEncoding("1)?VG");
      // Undeclared exception!
      try { 
        javac0.getJavacExecutable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Javac javac0 = new Javac();
      NotSelector notSelector0 = mock(NotSelector.class, new ViolatedAssumptionAnswer());
      javac0.addNot(notSelector0);
      javac0.getIncludeantruntime();
      javac0.getVerbose();
      javac0.setSource("n[&");
      javac0.getEncoding();
      javac0.setNowarn(true);
      javac0.setSource("");
      javac0.createBootclasspath();
      javac0.setSource("");
      // Undeclared exception!
      try { 
        javac0.getCurrentCompilerArgs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.getSource();
      javac0.setIncludeantruntime(true);
      javac0.setListfiles(true);
      javac0.setMemoryMaximumSize("");
      javac0.getDepend();
      javac0.setProceed(true);
      javac0.getExtdirs();
      Javac.ImplementationSpecificArgument javac_ImplementationSpecificArgument0 = javac0.createCompilerArg();
      assertNotNull(javac_ImplementationSpecificArgument0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Javac javac0 = new Javac();
      Javac javac1 = new Javac();
      Path path0 = javac1.createExtdirs();
      javac1.getNowarn();
      String string0 = null;
      javac0.setTaskType((String) null);
      javac0.getVerbose();
      javac0.setSourcepath(path0);
      javac0.setOptimize(false);
      javac0.setDeprecation(false);
      javac0.setBootclasspath(path0);
      javac1.setProceed(false);
      // Undeclared exception!
      try { 
        javac0.compile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Javac javac0 = new Javac();
      Path path0 = javac0.createClasspath();
      javac0.setBootclasspath(path0);
      Path path1 = javac0.createExtdirs();
      javac0.setSourcepath(path1);
      javac0.setSource("");
      // Undeclared exception!
      try { 
        javac0.isForkedJavac();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Javac javac0 = new Javac();
      Path path0 = javac0.getBootclasspath();
      assertNull(path0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.getMemoryMaximumSize();
      javac0.setDefaultexcludes(false);
      javac0.setIncludes("");
      javac0.setIncludes("");
      javac0.getDestdir();
      javac0.createSrc();
      javac0.hasSelectors();
      javac0.getClasspath();
      javac0.createCompilerArg();
      javac0.setSrcdir((Path) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.setExcludes((String) null);
      // Undeclared exception!
      try { 
        javac0.getCompilerVersion();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Javac javac0 = new Javac();
      Javac javac1 = new Javac();
      javac1.getDestdir();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "~qZ[EGz";
      stringArray0[2] = "j_TSF;Q=cJ";
      stringArray0[3] = "";
      // Undeclared exception!
      try { 
        javac0.scanDir((File) null, (File) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.Task", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.setNowarn(false);
      javac0.getDebug();
      try { 
        javac0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // srcdir attribute must be set!
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Javac javac0 = new Javac();
      javac0.init();
      boolean boolean0 = true;
      javac0.setDepend(true);
      javac0.resetFileLists();
      javac0.createInclude();
      javac0.setMemoryInitialSize("");
      javac0.getMemoryInitialSize();
      String string0 = "";
      // Undeclared exception!
      try { 
        javac0.compile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Javac javac0 = new Javac();
      Path path0 = javac0.createBootclasspath();
      javac0.setClasspath(path0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Javac javac0 = new Javac();
      Path path0 = javac0.recreateSrc();
      javac0.setSourcepath(path0);
      javac0.setSource("");
      // Undeclared exception!
      try { 
        javac0.isForkedJavac();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tools.ant.taskdefs.Javac", e);
      }
  }
}
