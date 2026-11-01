package dobackofront;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String nome = sc.nextLine();
        double valor = sc.nextDouble();
        double desconto = sc.nextDouble();

        double total = valor - (valor * desconto / 100);

      
        String descontoTexto = (desconto == (long) desconto)
                ? String.valueOf((long) desconto)
                : String.valueOf(desconto);

        System.out.printf(Locale.US, "Olá %s, sua compra de R$ %.2f foi confirmada!%n", nome, valor);
        System.out.println("Foi aplicado um desconto de " + descontoTexto + "%.");
        System.out.printf(Locale.US, "O total final ficou em R$ %.2f%n", total);

        sc.close();
    }
}
