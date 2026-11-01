package dobackofront;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int pequeno = sc.nextInt();
        int medio = sc.nextInt();
        int grande = sc.nextInt();
        double desconto = sc.nextDouble();

        double subtotal = pequeno * 13.50 + medio * 15.00 + grande * 17.50;
        double total = subtotal - (subtotal * desconto / 100);

        String descontoTexto = (desconto == (long) desconto)
                ? String.valueOf((long) desconto)
                : String.valueOf(desconto);

        System.out.println("Seu pedido foi registrado.");
        System.out.println("- Açaí P: " + pequeno);
        System.out.println("- Açaí M: " + medio);
        System.out.println("- Açaí G: " + grande);
        System.out.println("Desconto de " + descontoTexto + "% aplicado.");
        System.out.printf(Locale.US, "Total R$ %.2f%n", total);

        sc.close();
    }
}
