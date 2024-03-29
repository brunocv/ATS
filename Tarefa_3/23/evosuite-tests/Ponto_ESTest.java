/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 23:28:30 GMT 2021
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Ponto_ESTest extends Ponto_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      Ponto ponto1 = new Ponto(0.0F, 1316.8F);
      boolean boolean0 = ponto0.equals(ponto1);
      assertEquals(0.0F, ponto0.getY(), 0.01F);
      assertEquals(0.0F, ponto0.getX(), 0.01F);
      assertEquals(1316.8F, ponto1.getY(), 0.01F);
      assertFalse(ponto1.equals((Object)ponto0));
      assertFalse(boolean0);
      assertEquals(0.0F, ponto1.getX(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ponto ponto0 = new Ponto(0.0F, 0.0F);
      Ponto ponto1 = ponto0.clone();
      ponto0.setX((-3598.0F));
      boolean boolean0 = ponto1.equals(ponto0);
      assertEquals((-3598.0F), ponto0.getX(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      float float0 = ponto0.getY();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, ponto0.getX(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ponto ponto0 = new Ponto(0.0F, 0.0F);
      ponto0.setY(894.1426F);
      float float0 = ponto0.getY();
      assertEquals(894.1426F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ponto ponto0 = new Ponto((-3447.0F), (-3447.0F));
      ponto0.setX(0.0F);
      float float0 = ponto0.getX();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      ponto0.setX(1337.0F);
      float float0 = ponto0.getX();
      assertEquals(1337.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      assertEquals(0.0F, ponto0.getY(), 0.01F);
      
      ponto0.setY(1.0F);
      ponto0.clone();
      assertEquals(0.0F, ponto0.getX(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ponto ponto0 = new Ponto((-3447.0F), (-3447.0F));
      ponto0.setX(1.0F);
      ponto0.clone();
      assertEquals(1.0F, ponto0.getX(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Ponto ponto0 = new Ponto((-3447.0F), (-3447.0F));
      ponto0.clone();
      assertEquals((-3447.0F), ponto0.getY(), 0.01F);
      assertEquals((-3447.0F), ponto0.getX(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ponto ponto0 = null;
      try {
        ponto0 = new Ponto((Ponto) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Ponto", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ponto ponto0 = new Ponto((-3447.0F), (-3447.0F));
      float float0 = ponto0.getY();
      assertEquals((-3447.0F), float0, 0.01F);
      assertEquals((-3447.0F), ponto0.getX(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ponto ponto0 = new Ponto((-3447.0F), (-3447.0F));
      float float0 = ponto0.getX();
      assertEquals((-3447.0F), ponto0.getY(), 0.01F);
      assertEquals((-3447.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      Ponto ponto1 = ponto0.clone();
      ponto0.setY((-2575.9954F));
      boolean boolean0 = ponto1.equals(ponto0);
      assertEquals((-2575.9954F), ponto0.getY(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      Object object0 = new Object();
      boolean boolean0 = ponto0.equals(object0);
      assertEquals(0.0F, ponto0.getY(), 0.01F);
      assertEquals(0.0F, ponto0.getX(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      boolean boolean0 = ponto0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0.0F, ponto0.getY(), 0.01F);
      assertEquals(0.0F, ponto0.getX(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      boolean boolean0 = ponto0.equals(ponto0);
      assertTrue(boolean0);
      assertEquals(0.0F, ponto0.getX(), 0.01F);
      assertEquals(0.0F, ponto0.getY(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      Ponto ponto1 = new Ponto(184.155F, 3204.789F);
      boolean boolean0 = ponto0.equals(ponto1);
      assertEquals(184.155F, ponto1.getX(), 0.01F);
      assertFalse(boolean0);
      assertEquals(0.0F, ponto0.getY(), 0.01F);
      assertEquals(3204.789F, ponto1.getY(), 0.01F);
      assertEquals(0.0F, ponto0.getX(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      String string0 = ponto0.toString();
      assertEquals("(0.0, 0.0)", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      Ponto ponto1 = ponto0.clone();
      boolean boolean0 = ponto0.equals(ponto1);
      assertEquals(0.0F, ponto0.getY(), 0.01F);
      assertEquals(0.0F, ponto0.getX(), 0.01F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      Ponto ponto1 = new Ponto(ponto0);
      assertEquals(0.0F, ponto0.getY(), 0.01F);
      assertEquals(0.0F, ponto0.getX(), 0.01F);
  }
}
