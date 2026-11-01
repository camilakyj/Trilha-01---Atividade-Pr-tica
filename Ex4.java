package dobackofront;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        final double COTACAO = 5.42;

        double real = sc.nextDouble();
        double dolar = real / COTACAO;

        String realTexto = (real == (long) real) ? String.valueOf((long) real) : String.valueOf(real);

        System.out.println("Valor em real R$ " + realTexto + ".");
        System.out.printf(Locale.US, "Valor em dólar $ %.2f%n", dolar);

        sc.close();
    }
}
