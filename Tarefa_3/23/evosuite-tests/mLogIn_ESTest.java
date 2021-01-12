/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 23:38:06 GMT 2021
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
public class mLogIn_ESTest extends mLogIn_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      mLogIn mLogIn0 = new mLogIn();
      SystemInUtil.addInputLine("");
      // Undeclared exception!
      try { 
        mLogIn0.mostrarMenuLogInExtra();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SystemInUtil.addInputLine("~2~oEQWQO_*lWl/&h5");
      mLogIn mLogIn0 = new mLogIn();
      // Undeclared exception!
      try { 
        mLogIn0.mostrarMenuLogInE();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SystemInUtil.addInputLine("No");
      mLogIn mLogIn0 = new mLogIn();
      // Undeclared exception!
      try { 
        mLogIn0.mostrarMenuLogInC();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SystemInUtil.addInputLine("\n1: SEmi");
      mLogIn mLogIn0 = new mLogIn();
      // Undeclared exception!
      try { 
        mLogIn0.escolhaMenuLogIn();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SystemInUtil.addInputLine("5");
      mLogIn mLogIn0 = new mLogIn();
      mLogIn0.escolhaMenuLogIn();
      assertEquals(5, mLogIn0.getOpcao());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SystemInUtil.addInputLine("kx_~78");
      mLogIn mLogIn0 = new mLogIn();
      // Undeclared exception!
      try { 
        mLogIn0.escolhaMenuGERAL();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      mLogIn mLogIn0 = new mLogIn();
      SystemInUtil.addInputLine("5");
      mLogIn0.escolhaMenuGERAL();
      assertEquals(5, mLogIn0.getOpcao());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      mLogIn mLogIn0 = new mLogIn();
      String string0 = mLogIn0.getCodigo();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      mLogIn mLogIn0 = new mLogIn();
      String string0 = mLogIn0.getPassword();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      mLogIn mLogIn0 = new mLogIn();
      String string0 = mLogIn0.getEmail();
      assertEquals("", string0);
  }
}