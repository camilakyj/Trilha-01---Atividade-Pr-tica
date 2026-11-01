package dobackofront;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String nome = sc.nextLine();
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double altura = Math.min(a, b);
        double peso = Math.max(a, b);

        double imc = peso / (altura * altura);

        System.out.printf(Locale.US, "%s, seu IMC é de %.4f%n", nome, imc);

        sc.close();
    }
}
