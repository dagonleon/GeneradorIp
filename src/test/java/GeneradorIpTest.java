import static org.junit.jupiter.api.Assertions.*;

class GeneradorIpTest {
    GeneradorIp generador = new GeneradorIp();

    @org.junit.jupiter.api.Test
    void testgenerarNumero() {

        for (int i = 0; i < 1000; i++) {
            generador.generarNumero(0, 254);

        }


    }

    @org.junit.jupiter.api.Test
    void generarIp() {
        generador.generarIp();

    }

}