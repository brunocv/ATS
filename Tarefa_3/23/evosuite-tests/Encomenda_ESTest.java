/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 23:29:13 GMT 2021
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.MinguoDate;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Encomenda_ESTest extends Encomenda_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda();
      List<LinhaEncomenda> list0 = List.of(linhaEncomenda0, linhaEncomenda0);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Encomenda encomenda0 = new Encomenda((String) null, (String) null, (String) null, 1.0F, localDateTime0, list0);
      double double0 = encomenda0.tempoEncomenda(encomenda0);
      assertEquals(0.06, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda();
      List<LinhaEncomenda> list0 = List.of(linhaEncomenda0, linhaEncomenda0);
      linhaEncomenda0.setQuantidade((-2195.5884F));
      encomenda0.setEncomendas(list0);
      double double0 = encomenda0.tempoEncomenda(encomenda0);
      assertEquals(2, encomenda0.numeroProdutos());
      assertEquals((-4391.1767578125), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      float float0 = encomenda0.quantidadeProdutosTotal();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda("rg_", "C\u00F3digo da encomenda: \nC\u00F3digo da loja: \nPeso total: -1.0\nData: 2014-02-14T20:21:21.320\nProdutos: []", (-242.4F), 732.231F);
      List<LinhaEncomenda> list0 = List.of(linhaEncomenda0);
      encomenda0.setEncomendas(list0);
      float float0 = encomenda0.quantidadeProdutosTotal();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
      assertEquals((-242.4F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      int int0 = encomenda0.numeroProdutos();
      assertEquals(0, int0);
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setPeso(51.88F);
      float float0 = encomenda0.getPeso();
      assertEquals(51.88F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Month month0 = Month.NOVEMBER;
      LocalDateTime localDateTime0 = MockLocalDateTime.of(1, month0, 1, 1, 1, 1, 1);
      Encomenda encomenda0 = new Encomenda();
      List<LinhaEncomenda> list0 = encomenda0.getEncomendas();
      Encomenda encomenda1 = new Encomenda("Quantidade: ", "c+Lc7B-wT|D*X`a>2n[", "Quantidade: ", (-1003.45F), localDateTime0, list0);
      float float0 = encomenda1.getPeso();
      assertEquals((-1003.45F), float0, 0.01F);
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda("QtbZ2E>", (String) null, 1568.011F, 1568.011F);
      List<LinhaEncomenda> list0 = List.of(linhaEncomenda0);
      encomenda0.setEncomendas(list0);
      encomenda0.getEncomendas();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      List<LinhaEncomenda> list0 = encomenda0.getEncomendas();
      Encomenda encomenda1 = new Encomenda("gqw", "gqw", "qUrtJZpW3@0AYsrSR", 0.0F, (LocalDateTime) null, list0);
      encomenda1.getData();
      assertEquals(0.0F, encomenda1.getPeso(), 0.01F);
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setCodLoja((String) null);
      encomenda0.getCodLoja();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Encomenda encomenda0 = new Encomenda();
      List<LinhaEncomenda> list0 = encomenda0.getEncomendas();
      Encomenda encomenda1 = new Encomenda("1UERM7M_U", "1UERM7M_U", "Produtos: ", 0.0F, localDateTime0, list0);
      encomenda1.getCodLoja();
      assertEquals(0.0F, encomenda1.getPeso(), 0.01F);
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda((String) null, "b", "qUrtJZpW3@0AYsrSR", 0.0F, (LocalDateTime) null, linkedList0);
      encomenda0.getCodEncomenda();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Encomenda encomenda0 = new Encomenda();
      List<LinhaEncomenda> list0 = encomenda0.getEncomendas();
      Encomenda encomenda1 = new Encomenda("1UERM7M_U", "1UERM7M_U", "Produtos: ", 0.0F, localDateTime0, list0);
      encomenda1.getCodEncomenda();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
      assertEquals(0.0F, encomenda1.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda("XK!Or ", "Encomenda:", (-1.0F), (-2785.48F));
      List<LinhaEncomenda> list0 = List.of(linhaEncomenda0);
      encomenda0.setEncomendas(list0);
      float float0 = encomenda0.custoEncomendaTotal();
      assertEquals(2785.0F, float0, 0.01F);
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda("", "", 0.0F, 0.0F);
      LinhaEncomenda linhaEncomenda1 = new LinhaEncomenda((String) null, "", (-234.49567F), 198.2429F);
      List<LinhaEncomenda> list0 = List.of(linhaEncomenda0, linhaEncomenda1);
      encomenda0.setEncomendas(list0);
      float float0 = encomenda0.custoEncomendaTotal();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
      assertEquals((-46487.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setPeso(2230.0F);
      encomenda0.clone();
      assertEquals(2230.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda();
      List<LinhaEncomenda> list0 = List.of(linhaEncomenda0, linhaEncomenda0);
      Instant instant0 = MockInstant.ofEpochSecond(362L, 362L);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(1395);
      LocalDateTime localDateTime0 = MockLocalDateTime.ofInstant(instant0, zoneOffset0);
      Encomenda encomenda0 = new Encomenda(",", ",", ",", (-379.6154F), localDateTime0, list0);
      encomenda0.clone();
      assertEquals((-379.6154F), encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("D^qyi^o?u[t", "dE", "dE", 1.0F, (LocalDateTime) null, (List<LinhaEncomenda>) null);
      // Undeclared exception!
      try { 
        encomenda0.toStringCSV();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      // Undeclared exception!
      try { 
        encomenda0.tempoEncomenda((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      // Undeclared exception!
      try { 
        encomenda0.setEncomendas((List<LinhaEncomenda>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("Encomenda:", "Encomenda:", "C\u00F3digo da encomenda: \nC\u00F3digo da loja: \nPeso total: 0.0\nData: 2014-02-14T20:21:21.320\nProdutos: []", (-1.0F), (LocalDateTime) null, (List<LinhaEncomenda>) null);
      // Undeclared exception!
      try { 
        encomenda0.quantidadeProdutosTotal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("C\u00F3digo da encomenda: \nC\u00F3digo da loja: \nPeso total: -1.0\nData: 2014-02-14T20:21:21.320\nProdutos: []", "C\u00F3digo da encomenda: \nC\u00F3digo da loja: \nPeso total: -1.0\nData: 2014-02-14T20:21:21.320\nProdutos: []", "C\u00F3digo da encomenda: \nC\u00F3digo da loja: \nPeso total: -1.0\nData: 2014-02-14T20:21:21.320\nProdutos: []", (-1286.956F), (LocalDateTime) null, (List<LinhaEncomenda>) null);
      // Undeclared exception!
      try { 
        encomenda0.getEncomendas();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Encomenda encomenda0 = new Encomenda("v.6!&1uz/SC", "C\u00F3digo: ", "v.6!&1uz/SC", 0.0F, localDateTime0, (List<LinhaEncomenda>) null);
      // Undeclared exception!
      try { 
        encomenda0.custoEncomendaTotal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("C\u00F3digo da encomenda: \nC\u00F3digo da loja: \nPeso total: -1.0\nData: 2014-02-14T20:21:21.320\nProdutos: []", "C\u00F3digo da encomenda: \nC\u00F3digo da loja: \nPeso total: -1.0\nData: 2014-02-14T20:21:21.320\nProdutos: []", "C\u00F3digo da encomenda: \nC\u00F3digo da loja: \nPeso total: -1.0\nData: 2014-02-14T20:21:21.320\nProdutos: []", 0.0F, (LocalDateTime) null, (List<LinhaEncomenda>) null);
      // Undeclared exception!
      try { 
        encomenda0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Encomenda encomenda0 = null;
      try {
        encomenda0 = new Encomenda((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      List<LinhaEncomenda> list0 = encomenda0.getEncomendas();
      Encomenda encomenda1 = new Encomenda("gqw", "gqw", "qUrtJZpW3@0AYsrSR", 0.0F, (LocalDateTime) null, list0);
      encomenda1.getCodUtilizador();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
      assertEquals(0.0F, encomenda1.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getCodEncomenda();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getCodLoja();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      float float0 = encomenda0.getPeso();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getData();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getCodUtilizador();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda("", "", 0.0F, 0.0F);
      List<LinhaEncomenda> list0 = List.of(linhaEncomenda0);
      encomenda0.setEncomendas(list0);
      float float0 = encomenda0.custoEncomendaTotal();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda("QtbZ2E>", (String) null, 1568.011F, 1568.011F);
      List<LinhaEncomenda> list0 = List.of(linhaEncomenda0);
      encomenda0.setEncomendas(list0);
      int int0 = encomenda0.numeroProdutos();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda("QtbZ2E>", (String) null, 1568.011F, 1568.011F);
      List<LinhaEncomenda> list0 = List.of(linhaEncomenda0);
      encomenda0.setEncomendas(list0);
      float float0 = encomenda0.quantidadeProdutosTotal();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
      assertEquals(1568.011F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda();
      List<LinhaEncomenda> list0 = List.of(linhaEncomenda0, linhaEncomenda0, linhaEncomenda0, linhaEncomenda0, linhaEncomenda0, linhaEncomenda0);
      encomenda0.setEncomendas(list0);
      String string0 = encomenda0.toStringCSV();
      assertEquals("Encomenda:,,,0.0,,,0.0,0.0,,,0.0,0.0,,,0.0,0.0,,,0.0,0.0,,,0.0,0.0,,,0.0,0.0", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      MinguoDate minguoDate0 = MockMinguoDate.now();
      boolean boolean0 = encomenda0.equals(minguoDate0);
      assertFalse(boolean0);
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      boolean boolean0 = encomenda0.equals((Object) null);
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      boolean boolean0 = encomenda0.equals(encomenda0);
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda();
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertTrue(boolean0);
      assertEquals(0.0F, encomenda1.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setCodUtilizador((String) null);
      encomenda0.getCodUtilizador();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      String string0 = encomenda0.toString();
      assertEquals("C\u00F3digo da encomenda: \nC\u00F3digo da loja: \nPeso total: 0.0\nData: 2014-02-14T20:21:21.320\nProdutos: []", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("\n", "H0{4zcDlUz=-", "H0{4zcDlUz=-", 1.0F, (LocalDateTime) null, (List<LinhaEncomenda>) null);
      // Undeclared exception!
      try { 
        encomenda0.numeroProdutos();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      encomenda0.setData(localDateTime0);
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setCodEncomenda((String) null);
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      double double0 = encomenda0.tempoEncomenda(encomenda0);
      assertEquals(0, encomenda0.numeroProdutos());
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.clone();
      assertEquals(0.0F, encomenda0.getPeso(), 0.01F);
  }
}
