import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class GeneradorIpTest {
    GeneradorIp generador = new GeneradorIp();

    @org.junit.jupiter.api.Test
    @RepeatedTest(1000)
    void testgenerarNumero() {
        int random = generador.generarNumero(0, 254);
        assertTrue(random >= 0 && random <= 254);
    }

    @org.junit.jupiter.api.Test
    @RepeatedTest(1000)
    void generarIp() {
        String ip = generador.generarIp();
        assertTrue(ip.charAt(0)!=0 || ip.charAt(ip.length()-1) != 0);
    }
}