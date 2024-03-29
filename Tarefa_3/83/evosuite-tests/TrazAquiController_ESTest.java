/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 23:39:57 GMT 2021
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TrazAquiController_ESTest extends TrazAquiController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TrazAquiController trazAquiController0 = new TrazAquiController();
      // Undeclared exception!
      try { 
        trazAquiController0.readFlow();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TrazAquiController", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TrazAquiController trazAquiController0 = new TrazAquiController();
      // Undeclared exception!
      try { 
        trazAquiController0.mainFlow();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TrazAquiController", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SystemInUtil.addInputLine("9");
      TrazAquiView trazAquiView0 = new TrazAquiView();
      TrazAquiController trazAquiController0 = new TrazAquiController();
      trazAquiController0.setView(trazAquiView0);
      // Undeclared exception!
      try { 
        trazAquiController0.mainFlow();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SystemInUtil.addInputLine("4");
      TrazAquiView trazAquiView0 = new TrazAquiView();
      TrazAquiController trazAquiController0 = new TrazAquiController();
      trazAquiController0.setView(trazAquiView0);
      // Undeclared exception!
      try { 
        trazAquiController0.mainFlow();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SystemInUtil.addInputLine("3");
      TrazAquiView trazAquiView0 = new TrazAquiView();
      TrazAquiController trazAquiController0 = new TrazAquiController();
      trazAquiController0.setView(trazAquiView0);
      // Undeclared exception!
      try { 
        trazAquiController0.mainFlow();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SystemInUtil.addInputLine("2");
      TrazAquiView trazAquiView0 = new TrazAquiView();
      TrazAquiController trazAquiController0 = new TrazAquiController();
      trazAquiController0.setView(trazAquiView0);
      // Undeclared exception!
      try { 
        trazAquiController0.mainFlow();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TrazAquiController trazAquiController0 = new TrazAquiController();
      SystemInUtil.addInputLine("0");
      TrazAquiView trazAquiView0 = new TrazAquiView();
      trazAquiController0.setView(trazAquiView0);
      // Undeclared exception!
      try { 
        trazAquiController0.mainFlow();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SystemInUtil.addInputLine("2");
      TrazAquiView trazAquiView0 = new TrazAquiView();
      TrazAquiController trazAquiController0 = new TrazAquiController();
      trazAquiController0.setView(trazAquiView0);
      // Undeclared exception!
      try { 
        trazAquiController0.readFlow();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SystemInUtil.addInputLine("0");
      TrazAquiView trazAquiView0 = new TrazAquiView();
      TrazAquiController trazAquiController0 = new TrazAquiController();
      trazAquiController0.setView(trazAquiView0);
      // Undeclared exception!
      try { 
        trazAquiController0.readFlow();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SystemInUtil.addInputLine("1");
      TrazAquiView trazAquiView0 = new TrazAquiView();
      TrazAquiController trazAquiController0 = new TrazAquiController();
      trazAquiController0.setView(trazAquiView0);
      BDGeral bDGeral0 = trazAquiController0.readFlow();
      assertNotNull(bDGeral0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SystemInUtil.addInputLine("1");
      TrazAquiView trazAquiView0 = new TrazAquiView();
      TrazAquiController trazAquiController0 = new TrazAquiController();
      trazAquiController0.setView(trazAquiView0);
      // Undeclared exception!
      try { 
        trazAquiController0.mainFlow();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TrazAquiController trazAquiController0 = new TrazAquiController();
      trazAquiController0.setBd((BDGeral) null);
  }
}
