/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 23:37:14 GMT 2021
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Loja_ESTest extends Loja_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Loja loja0 = new Loja();
      Loja loja1 = new Loja(loja0);
      assertEquals(0.0, loja1.getTempo_espera(), 0.01);
      
      loja1.setTempo_espera(1.0);
      boolean boolean0 = loja1.equals(loja0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Loja loja0 = new Loja();
      loja0.setTempo_espera(179.4816517);
      double double0 = loja0.getTempo_espera();
      assertEquals(179.4816517, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Encomenda> arrayList0 = new ArrayList<Encomenda>();
      Loja loja0 = new Loja("", "", "}!QtJ2c^k?", "", (-327.2128801), (-327.2128801), (-327.2128801), arrayList0, 0);
      double double0 = loja0.getTempo_espera();
      assertEquals(0, loja0.getNrPessoasEmFila());
      assertEquals((-327.2128801), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Loja loja0 = new Loja();
      assertEquals(0, loja0.getNrPessoasEmFila());
      
      loja0.setNrPessoasEmFila(1);
      int int0 = loja0.getNrPessoasEmFila();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Loja loja0 = new Loja();
      loja0.setNrPessoasEmFila((-1792481360));
      int int0 = loja0.getNrPessoasEmFila();
      assertEquals((-1792481360), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Loja loja0 = new Loja();
      loja0.setNome((String) null);
      loja0.getNome();
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
      assertEquals(0, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Loja loja0 = new Loja();
      loja0.getNome();
      assertEquals(0, loja0.getNrPessoasEmFila());
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Loja loja0 = new Loja();
      loja0.getLongitude();
      assertEquals(0, loja0.getNrPessoasEmFila());
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Encomenda> arrayList0 = new ArrayList<Encomenda>();
      Loja loja0 = new Loja("8\u00F3digo: ", (String) null, "C\u00F3digo da loja: ", "C\u00F3digo da loja: ", 1.0, 1.0, 1.0, arrayList0, (-1));
      loja0.getLongitude();
      assertEquals(1.0, loja0.getTempo_espera(), 0.01);
      assertEquals((-1), loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Encomenda> arrayList0 = new ArrayList<Encomenda>();
      Loja loja0 = new Loja("", "", "", "SD@sk{dUNrY]B", 0.0, 1.0, 741.0628488, arrayList0, 1180);
      loja0.setLatitude((-581.79));
      loja0.getLongitude();
      assertEquals(1180, loja0.getNrPessoasEmFila());
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Loja loja0 = new Loja();
      loja0.getLatitude();
      assertEquals(0, loja0.getNrPessoasEmFila());
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Loja loja0 = new Loja();
      ArrayList<Encomenda> arrayList0 = loja0.getEncomendas_recebidas();
      Loja loja1 = new Loja("Loja: \nC\u00F3digo da loja: \nNome da loja: \nTempo de espera: 0.0\nLatitude: 0.0\nLongitude: 0.0\nLista de encomendas recebidas: \nEncomenda: \nC\u00F3digo:  \nC\u00F3digo do utilizador:  \nC\u00F3digo da loja:  \nPeso: 0.0\nComprador:  \nVendedor:  \nData de emiss\u00E3o da encomenda: 2014-02-14T20:21:21.320\nProdutos: \n{}\n\n <--- O utilizador \u00E9: \n0\n\n", "Loja: \nC\u00F3digo da loja: \nNome da loja: \nTempo de espera: 0.0\nLatitude: 0.0\nLongitude: 0.0\nLista de encomendas recebidas: \nEncomenda: \nC\u00F3digo:  \nC\u00F3digo do utilizador:  \nC\u00F3digo da loja:  \nPeso: 0.0\nComprador:  \nVendedor:  \nData de emiss\u00E3o da encomenda: 2014-02-14T20:21:21.320\nProdutos: \n{}\n\n <--- O utilizador \u00E9: \n0\n\n", "Desinfetante", "HqU)C'xnYn4Tnh", 1.0, 1.0, 0.0, arrayList0, 258);
      loja1.getLatitude();
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
      assertEquals(1.0, loja1.getTempo_espera(), 0.01);
      assertEquals(258, loja1.getNrPessoasEmFila());
      assertEquals(0, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Loja loja0 = new Loja();
      ArrayList<Encomenda> arrayList0 = loja0.getEncomendas_recebidas();
      Loja loja1 = new Loja("SZ]", "SZ]", "Ui'!n$-ik(lb", "Ui'!n$-ik(lb", (-3520.9734720365022), (-322.8209978980876), (-1.0), arrayList0, (-1));
      loja1.getLatitude();
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
      assertEquals((-1), loja1.getNrPessoasEmFila());
      assertEquals(0, loja0.getNrPessoasEmFila());
      assertEquals((-3520.9734720365022), loja1.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Loja loja0 = new Loja();
      ArrayList<Encomenda> arrayList0 = loja0.getEncomendas_recebidas();
      HashMap<String, LinhaEncomenda> hashMap0 = new HashMap<String, LinhaEncomenda>();
      Instant instant0 = MockInstant.ofEpochSecond(1L);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(2451);
      OffsetDateTime offsetDateTime0 = MockInstant.atOffset(instant0, zoneOffset0);
      LocalDateTime localDateTime0 = MockLocalDateTime.from(offsetDateTime0);
      Encomenda encomenda0 = new Encomenda("3J", "3J", "Encomenda", 1.0, "N[vd .6:Rk/", "Lista de encomendas recebidas: ", hashMap0, true, localDateTime0, false, true, false);
      arrayList0.add(encomenda0);
      loja0.setEncomendas_recebidas(arrayList0);
      loja0.getEnc("3J");
      assertEquals(0, loja0.getNrPessoasEmFila());
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Loja loja0 = new Loja();
      ArrayList<Encomenda> arrayList0 = loja0.getEncomendas_recebidas();
      HashMap<String, LinhaEncomenda> hashMap0 = new HashMap<String, LinhaEncomenda>();
      Instant instant0 = MockInstant.ofEpochSecond(1L);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(2451);
      OffsetDateTime offsetDateTime0 = MockInstant.atOffset(instant0, zoneOffset0);
      LocalDateTime localDateTime0 = MockLocalDateTime.from(offsetDateTime0);
      Encomenda encomenda0 = new Encomenda("3J", "3J", "Encomenda", 1.0, "N[vd .6:Rk/", "Lista de encomendas recebidas: ", hashMap0, true, localDateTime0, true, true, true);
      arrayList0.add(encomenda0);
      loja0.setEncomendas_recebidas(arrayList0);
      loja0.getEnc("3J");
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
      assertEquals(0, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Loja loja0 = new Loja();
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setCodigo("0");
      loja0.updateEncomenda(encomenda0);
      assertTrue(encomenda0.isPreparada());
      
      loja0.getEnc("0");
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Loja loja0 = new Loja();
      loja0.setCodigo((String) null);
      loja0.getCodigo();
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
      assertEquals(0, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArrayList<Encomenda> arrayList0 = new ArrayList<Encomenda>();
      Loja loja0 = new Loja("", "", "}!QtJ2c^k?", "", (-327.2128801), (-327.2128801), (-327.2128801), arrayList0, 0);
      loja0.getCodigo();
      assertEquals((-327.2128801), loja0.getTempo_espera(), 0.01);
      assertEquals(0, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Loja loja0 = new Loja();
      loja0.getCodigo();
      assertEquals(0, loja0.getNrPessoasEmFila());
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Loja loja0 = new Loja();
      loja0.setTempo_espera(179.4816517);
      loja0.clone();
      assertEquals(179.4816517, loja0.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Loja loja0 = new Loja();
      loja0.setNrPessoasEmFila(2147483645);
      loja0.clone();
      assertEquals(2147483645, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArrayList<Encomenda> arrayList0 = new ArrayList<Encomenda>();
      Loja loja0 = new Loja("Z}tf\")<$C)&e", "Z}tf\")<$C)&e", "", "Ui'!n$-ik(lb", (-1788.075), 1283.56959003518, 4465.246, arrayList0, (-834));
      loja0.clone();
      assertEquals((-1788.075), loja0.getTempo_espera(), 0.01);
      assertEquals((-834), loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Loja loja0 = new Loja();
      ArrayList<Encomenda> arrayList0 = loja0.getEncomendas_recebidas();
      Loja loja1 = new Loja((String) null, "UKs+Vr}k\"BJOq3[4z^", (String) null, "", (-0.6), (-0.6), (-2234.126), arrayList0, (-1));
      Loja loja2 = new Loja(loja1);
      Loja loja3 = loja2.clone();
      assertEquals(0, loja0.getNrPessoasEmFila());
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
      assertEquals((-0.6), loja2.getTempo_espera(), 0.01);
      assertEquals((-1), loja3.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Loja loja0 = new Loja();
      // Undeclared exception!
      try { 
        loja0.updateEncomenda((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Loja", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Loja loja0 = new Loja();
      // Undeclared exception!
      try { 
        loja0.setEncomendas_recebidas((ArrayList<Encomenda>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Loja", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Loja loja0 = new Loja();
      Encomenda encomenda0 = new Encomenda();
      loja0.updateEncomenda(encomenda0);
      // Undeclared exception!
      try { 
        loja0.getEnc((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ArrayList<Encomenda> arrayList0 = new ArrayList<Encomenda>();
      Loja loja0 = new Loja((String) null, (String) null, (String) null, "Saco de lixo 30l", 0.0, 0.0, 0.0, arrayList0, 0);
      Loja loja1 = new Loja("Saco de lixo 30l", "Saco de lixo de 50l", "Saco de lixo de 50l", (String) null, 0.0, 1.0, 1.0, arrayList0, 0);
      // Undeclared exception!
      try { 
        loja0.equals(loja1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("UtilizadorSistema", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Loja loja0 = new Loja();
      // Undeclared exception!
      try { 
        loja0.addEncomenda((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Loja", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Loja loja0 = null;
      try {
        loja0 = new Loja("B&)j'|>%Z+yjdc", "B&)j'|>%Z+yjdc", "B&)j'|>%Z+yjdc", "B&)j'|>%Z+yjdc", (-0.6), (-0.6), (-0.6), (ArrayList<Encomenda>) null, (-2075946538));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Loja", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Loja loja0 = null;
      try {
        loja0 = new Loja((Loja) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("UtilizadorSistema", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Loja loja0 = new Loja();
      Encomenda encomenda0 = new Encomenda();
      loja0.updateEncomenda(encomenda0);
      assertTrue(encomenda0.isPreparada());
      
      loja0.getEncomendas_recebidas();
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ArrayList<Encomenda> arrayList0 = new ArrayList<Encomenda>();
      Loja loja0 = new Loja("", "", "}!QtJ2c^k?", "", (-327.2128801), (-327.2128801), (-327.2128801), arrayList0, 0);
      int int0 = loja0.getNrPessoasEmFila();
      assertEquals(0, int0);
      assertEquals((-327.2128801), loja0.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Loja loja0 = new Loja();
      double double0 = loja0.getTempo_espera();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Loja loja0 = new Loja();
      Encomenda encomenda0 = new Encomenda();
      loja0.updateEncomenda(encomenda0);
      Map<String, LinhaEncomenda> map0 = encomenda0.getProdutos();
      Encomenda encomenda1 = new Encomenda("1", "1", "", (-1449.02544084709), "1", "", map0, false, (LocalDateTime) null, false, false, true);
      loja0.updateEncomenda(encomenda1);
      assertTrue(encomenda0.isPreparada());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Loja loja0 = new Loja();
      Encomenda encomenda0 = new Encomenda();
      loja0.updateEncomenda(encomenda0);
      loja0.updateEncomenda(encomenda0);
      assertTrue(encomenda0.isPreparada());
      assertEquals(0, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Loja loja0 = new Loja();
      ArrayList<Encomenda> arrayList0 = loja0.getEncomendas_recebidas();
      HashMap<String, LinhaEncomenda> hashMap0 = new HashMap<String, LinhaEncomenda>();
      Instant instant0 = MockInstant.ofEpochSecond(1L);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(2451);
      OffsetDateTime offsetDateTime0 = MockInstant.atOffset(instant0, zoneOffset0);
      LocalDateTime localDateTime0 = MockLocalDateTime.from(offsetDateTime0);
      Encomenda encomenda0 = new Encomenda("3J", "3J", "Encomenda", 1.0, "N[vd .6:Rk/", "Lista de encomendas recebidas: ", hashMap0, true, localDateTime0, false, true, false);
      arrayList0.add(encomenda0);
      loja0.setEncomendas_recebidas(arrayList0);
      String string0 = loja0.getEncNotReady();
      assertEquals("\nEncomenda: \nC\u00F3digo: 3J\nC\u00F3digo do utilizador: 3J\nC\u00F3digo da loja: Encomenda\nPeso: 1.0\nComprador: N[vd .6:Rk/\nVendedor: Lista de encomendas recebidas: \nData de emiss\u00E3o da encomenda: 1970-01-01T00:40:52\nProdutos: \n{}\n", string0);
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
      assertEquals(0, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Loja loja0 = new Loja();
      Encomenda encomenda0 = new Encomenda();
      loja0.updateEncomenda(encomenda0);
      assertTrue(encomenda0.isPreparada());
      
      String string0 = loja0.getEncNotReady();
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Loja loja0 = new Loja();
      Encomenda encomenda0 = new Encomenda();
      Map<String, LinhaEncomenda> map0 = encomenda0.getProdutos();
      Encomenda encomenda1 = new Encomenda("1", "1", "", (-1449.02544084709), "1", "", map0, false, (LocalDateTime) null, false, false, true);
      loja0.updateEncomenda(encomenda1);
      Encomenda encomenda2 = loja0.getEnc("1");
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
      assertTrue(encomenda2.isPreparada());
      assertEquals(0, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Loja loja0 = new Loja();
      Encomenda encomenda0 = new Encomenda();
      loja0.updateEncomenda(encomenda0);
      try { 
        loja0.getEnc("1");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Loja", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Loja loja0 = new Loja();
      Loja loja1 = new Loja(loja0);
      Encomenda encomenda0 = new Encomenda();
      loja1.updateEncomenda(encomenda0);
      assertTrue(encomenda0.isPreparada());
      
      Loja loja2 = new Loja(loja1);
      boolean boolean0 = loja0.equals(loja2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Loja loja0 = new Loja();
      Loja loja1 = new Loja(loja0);
      loja1.setTempo_espera((-0.6));
      boolean boolean0 = loja1.equals(loja0);
      assertEquals((-0.6), loja1.getTempo_espera(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Loja loja0 = new Loja();
      ArrayList<Encomenda> arrayList0 = new ArrayList<Encomenda>();
      Loja loja1 = new Loja("Latitude: ", "Latitude: ", "Latitude: ", "%)KOUVhAyn~H+>tX", (-1.0), (-1.0), (-1.0), arrayList0, (-4512));
      boolean boolean0 = loja0.equals(loja1);
      assertEquals(0, loja0.getNrPessoasEmFila());
      assertEquals((-4512), loja1.getNrPessoasEmFila());
      assertEquals((-1.0), loja1.getTempo_espera(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Loja loja0 = new Loja();
      boolean boolean0 = loja0.equals("{`)");
      assertFalse(boolean0);
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
      assertEquals(0, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Loja loja0 = new Loja();
      Loja loja1 = new Loja(loja0);
      boolean boolean0 = loja1.equals(loja0);
      assertEquals(0, loja1.getNrPessoasEmFila());
      assertTrue(boolean0);
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Loja loja0 = new Loja();
      boolean boolean0 = loja0.equals(loja0);
      assertTrue(boolean0);
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
      assertEquals(0, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Loja loja0 = new Loja();
      boolean boolean0 = loja0.equals((Object) null);
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
      assertEquals(0, loja0.getNrPessoasEmFila());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Loja loja0 = new Loja();
      Encomenda encomenda0 = new Encomenda();
      loja0.addEncomenda(encomenda0);
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
      assertEquals(0, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Loja loja0 = new Loja();
      String string0 = loja0.toString();
      assertEquals("Loja: \nC\u00F3digo da loja: \nNome da loja: \nTempo de espera: 0.0\nLatitude: 0.0\nLongitude: 0.0\nLista de encomendas recebidas:  <--- O utilizador \u00E9: \n\n\n", string0);
      assertEquals(0, loja0.getNrPessoasEmFila());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Loja loja0 = new Loja();
      ArrayList<Encomenda> arrayList0 = loja0.getEncomendas_recebidas();
      Loja loja1 = new Loja("+.\"", "+.\"", "k3r'", "1qb-0ZO", (-0.6), 2466.373299789412, 0.0, arrayList0, 1);
      loja1.getNome();
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
      assertEquals(1, loja1.getNrPessoasEmFila());
      assertEquals(0, loja0.getNrPessoasEmFila());
      assertEquals((-0.6), loja1.getTempo_espera(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Loja loja0 = new Loja();
      Encomenda encomenda0 = new Encomenda();
      loja0.removeEncomenda(encomenda0);
      assertEquals(0, loja0.getNrPessoasEmFila());
      assertEquals(0.0, loja0.getTempo_espera(), 0.01);
  }
}
