package src.es.virtualsw.sepa;

import es.virtualsw.sepa.SepaUtils;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class testGenCodInterviniente extends TestCase {

    public static Test suite() {
        return new TestSuite(testGenCodInterviniente.class);

    }

    public void testGenerarCodInterviniente() {

        String nif = "A12345678";
        String codComercial = "000";
        String codPais = "ES";

        String codInterviniente = "";

        codInterviniente = SepaUtils.generaCodInterviniente(nif, codComercial, codPais);

        System.out.println("C�DIGO INTERVINIENTE:" + codInterviniente);

        if (codInterviniente.equals("")) {
            assertTrue(false);
        } else {
            assertTrue(true);
        }
    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

}
