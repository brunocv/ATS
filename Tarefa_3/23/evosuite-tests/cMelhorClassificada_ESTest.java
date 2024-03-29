/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 23:30:02 GMT 2021
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class cMelhorClassificada_ESTest extends cMelhorClassificada_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      cMelhorClassificada cMelhorClassificada0 = new cMelhorClassificada();
      // Undeclared exception!
      try { 
        cMelhorClassificada0.compare((PlataformaEntrega) null, (PlataformaEntrega) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cMelhorClassificada", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      cMelhorClassificada cMelhorClassificada0 = new cMelhorClassificada();
      Transportadoras transportadoras0 = new Transportadoras();
      Transportadoras transportadoras1 = transportadoras0.clone();
      Integer integer0 = new Integer(2201);
      transportadoras1.adicionaClassificacao(integer0);
      int int0 = cMelhorClassificada0.compare((PlataformaEntrega) transportadoras1, (PlataformaEntrega) transportadoras0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      cMelhorClassificada cMelhorClassificada0 = new cMelhorClassificada();
      Transportadoras transportadoras0 = new Transportadoras();
      Transportadoras transportadoras1 = transportadoras0.clone();
      Integer integer0 = new Integer(2201);
      transportadoras1.adicionaClassificacao(integer0);
      int int0 = cMelhorClassificada0.compare((PlataformaEntrega) transportadoras0, (PlataformaEntrega) transportadoras1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      cMelhorClassificada cMelhorClassificada0 = new cMelhorClassificada();
      Transportadoras transportadoras0 = new Transportadoras();
      int int0 = cMelhorClassificada0.compare((PlataformaEntrega) transportadoras0, (PlataformaEntrega) transportadoras0);
      assertEquals(0, int0);
  }
}
