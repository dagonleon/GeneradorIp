import java.util.Random;

public class GeneradorIp {
    int num;
    int min;
    int max;
    public int generarNumero(int min, int max) {
        this.min = min;
        this.max = max;
        Random rnd = new Random();
        do {
            num = rnd.nextInt(max);
        } while (num < min & num > max);
        return num;
    }
    public String generarIp() {
        return "La IP generada es: " + generarNumero(min, max) +"."+generarNumero(min, max)+"."+generarNumero(min, max) +"."+generarNumero(min, max);
    }
}
