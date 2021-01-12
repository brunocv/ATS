/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 23:40:19 GMT 2021
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class mPrincipal_ESTest extends mPrincipal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMinuto(59);
      boolean boolean0 = mPrincipal0.verificaHora();
      assertEquals(59, mPrincipal0.getMinuto());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setDia(23);
      mPrincipal0.setMes(2);
      mPrincipal0.setHora(23);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(23, mPrincipal0.getHora());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setDia(1206);
      mPrincipal0.setMes(4);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(4, mPrincipal0.getMes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setDia((-1454302773));
      mPrincipal0.setMes(2);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals((-1454302773), mPrincipal0.getDia());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setDia(Integer.MAX_VALUE);
      mPrincipal0.setMes(1);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(Integer.MAX_VALUE, mPrincipal0.getDia());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setDia((-3010));
      mPrincipal0.setMes(8);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals((-3010), mPrincipal0.getDia());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMes(3195);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(3195, mPrincipal0.getMes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SystemInUtil.addInputLine("No");
      mPrincipal mPrincipal0 = new mPrincipal();
      int int0 = mPrincipal0.leOpcao();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SystemInUtil.addInputLine("No");
      mPrincipal mPrincipal0 = new mPrincipal();
      int int0 = mPrincipal0.leInt();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SystemInUtil.addInputLine("null");
      mPrincipal mPrincipal0 = new mPrincipal();
      double double0 = mPrincipal0.leDouble();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SystemInUtil.addInputLine("No");
      mPrincipal mPrincipal0 = new mPrincipal();
      String string0 = mPrincipal0.leString();
      assertEquals("No", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SystemInUtil.addInputLine("");
      mPrincipal mPrincipal0 = new mPrincipal();
      String string0 = mPrincipal0.leString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      SystemInUtil.addInputLine("7");
      int int0 = mPrincipal0.leOpcao();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SystemInUtil.addInputLine("4");
      mPrincipal mPrincipal0 = new mPrincipal();
      int int0 = mPrincipal0.leInt();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SystemInUtil.addInputLine("0");
      mPrincipal mPrincipal0 = new mPrincipal((-2864), (-3840), (-3840), (-2864), 1430, 6, (LocalDateTime) null, (LocalDateTime) null);
      float float0 = mPrincipal0.leFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SystemInUtil.addInputLine("BL<*]iC&");
      mPrincipal mPrincipal0 = new mPrincipal();
      float float0 = mPrincipal0.leFloat();
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      SystemInUtil.addInputLine("7");
      double double0 = mPrincipal0.leDouble();
      assertEquals(7.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setOpcao(32);
      int int0 = mPrincipal0.getOpcao();
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setOpcao((-717));
      int int0 = mPrincipal0.getOpcao();
      assertEquals((-717), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMinuto((-790));
      int int0 = mPrincipal0.getMinuto();
      assertEquals((-790), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMes(32);
      int int0 = mPrincipal0.getMes();
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMes((-1815));
      int int0 = mPrincipal0.getMes();
      assertEquals((-1815), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setHora(2197);
      int int0 = mPrincipal0.getHora();
      assertEquals(2197, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setHora((-1));
      int int0 = mPrincipal0.getHora();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setDia(730);
      int int0 = mPrincipal0.getDia();
      assertEquals(730, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setDia((-1071));
      int int0 = mPrincipal0.getDia();
      assertEquals((-1071), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal(0, 0, 218, (-1), (-1797), 0, (LocalDateTime) null, (LocalDateTime) null);
      LocalDateTime localDateTime0 = mPrincipal0.getDataI();
      assertNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setAno(59);
      int int0 = mPrincipal0.getAno();
      assertEquals(59, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      mPrincipal mPrincipal0 = null;
      try {
        mPrincipal0 = new mPrincipal((mPrincipal) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("mPrincipal", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMinuto(1520);
      boolean boolean0 = mPrincipal0.verificaHora();
      assertEquals(1520, mPrincipal0.getMinuto());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMinuto((-1));
      boolean boolean0 = mPrincipal0.verificaHora();
      assertEquals((-1), mPrincipal0.getMinuto());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setHora(59);
      boolean boolean0 = mPrincipal0.verificaHora();
      assertEquals(59, mPrincipal0.getHora());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      LocalDateTime localDateTime0 = mPrincipal0.getDataI();
      assertNotNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      // Undeclared exception!
      try { 
        mPrincipal0.leString();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      LocalDateTime localDateTime0 = mPrincipal0.getDataF();
      assertNotNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      int int0 = mPrincipal0.getDia();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      int int0 = mPrincipal0.getAno();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      int int0 = mPrincipal0.getHora();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      int int0 = mPrincipal0.getOpcao();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      int int0 = mPrincipal0.getMes();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      int int0 = mPrincipal0.getMinuto();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setHora((-1615452652));
      boolean boolean0 = mPrincipal0.verificaHora();
      assertEquals((-1615452652), mPrincipal0.getHora());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMinuto((-3149));
      mPrincipal0.setDia(23);
      mPrincipal0.setMes(11);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(23, mPrincipal0.getDia());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setDia(23);
      mPrincipal0.setMes(11);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(11, mPrincipal0.getMes());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setDia(31);
      mPrincipal0.setMes(11);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(31, mPrincipal0.getDia());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMes(11);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(11, mPrincipal0.getMes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal(9, 9, 9, (-4359), (-4359), 7, (LocalDateTime) null, (LocalDateTime) null);
      boolean boolean0 = mPrincipal0.verificaData();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMes(6);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(6, mPrincipal0.getMes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setHora(3200);
      mPrincipal0.setDia(23);
      mPrincipal0.setMes(2);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(23, mPrincipal0.getDia());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setDia(39);
      mPrincipal0.setMes(2);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(2, mPrincipal0.getMes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMinuto(1752);
      mPrincipal0.setDia(10);
      mPrincipal0.setMes(10);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(1752, mPrincipal0.getMinuto());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setDia(32);
      mPrincipal0.setMes(1);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(32, mPrincipal0.getDia());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMes(12);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(12, mPrincipal0.getMes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMes(7);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(7, mPrincipal0.getMes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMes(5);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(5, mPrincipal0.getMes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMes(3);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(3, mPrincipal0.getMes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SystemInUtil.addInputLine("No");
      mPrincipal mPrincipal0 = new mPrincipal();
      String string0 = mPrincipal0.leYesOrNo();
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      SystemInUtil.addInputLine("Yes");
      String string0 = mPrincipal0.leYesOrNo();
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      SystemInUtil.addInputLine("NQ");
      String string0 = mPrincipal0.leYesOrNo();
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setAno((-1));
      int int0 = mPrincipal0.getAno();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setDataI((LocalDateTime) null);
      assertEquals(0, mPrincipal0.getDia());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      // Undeclared exception!
      try { 
        mPrincipal0.leDouble();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal(10, 10, 10, 10, 10, 10, (LocalDateTime) null, (LocalDateTime) null);
      boolean boolean0 = mPrincipal0.verificaData();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMinuto(59);
      int int0 = mPrincipal0.getMinuto();
      assertEquals(59, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.clearScreen();
      assertTrue(mPrincipal0.verificaHora());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      // Undeclared exception!
      try { 
        mPrincipal0.leYesOrNo();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setMes(2);
      boolean boolean0 = mPrincipal0.verificaData();
      assertEquals(2, mPrincipal0.getMes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      // Undeclared exception!
      try { 
        mPrincipal0.leOpcao();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      // Undeclared exception!
      try { 
        mPrincipal0.leInt();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal0.setDataF((LocalDateTime) null);
      LocalDateTime localDateTime0 = mPrincipal0.getDataF();
      assertNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      // Undeclared exception!
      try { 
        mPrincipal0.leFloat();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      mPrincipal mPrincipal0 = new mPrincipal();
      mPrincipal mPrincipal1 = new mPrincipal(mPrincipal0);
      assertTrue(mPrincipal1.verificaHora());
      assertEquals(0, mPrincipal1.getMes());
      assertEquals(0, mPrincipal1.getDia());
      assertEquals(0, mPrincipal1.getHora());
      assertEquals(0, mPrincipal1.getAno());
      assertEquals(0, mPrincipal1.getMinuto());
      assertEquals(0, mPrincipal1.getOpcao());
  }
}