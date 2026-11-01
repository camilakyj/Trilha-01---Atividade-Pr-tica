package dobackofront;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String meta = sc.nextLine();
        double valorMeta = sc.nextDouble();
        double salario = sc.nextDouble();
        double despesas = sc.nextDouble();

        double saldo = salario - despesas;
        double reserva = saldo * 0.30;
        double disponivel = saldo * 0.70;
        double meses = valorMeta / disponivel;

        System.out.printf(Locale.US, "Meta: %s (R$ %.2f)%n", meta, valorMeta);
        System.out.printf(Locale.US, "Salário: R$ %.2f - Despesas: R$ %.2f%n", salario, despesas);
        System.out.printf(Locale.US, "Saldo após despesas: R$ %.2f%n", saldo);
        System.out.printf(Locale.US, "Reserva fixa (30%%): R$ %.2f%n", reserva);
        System.out.printf(Locale.US, "Valor disponível para a meta: R$ %.2f por mês%n", disponivel);
        System.out.printf(Locale.US, "Prazo estimado para atingir a meta: %.2f meses%n", meses);

        sc.close();
    }
}
