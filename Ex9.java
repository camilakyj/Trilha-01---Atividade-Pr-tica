package dobackofront;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double pista = sc.nextDouble();
        int voltas = sc.nextInt();
        double tempoVolta = sc.nextDouble();

        double distanciaKm = (pista * voltas) / 1000;
        double tempoMinutos = (tempoVolta * voltas) / 60;

        System.out.println("Análise Preditiva Concluída");
        System.out.println("--");
        System.out.println("Distância total a ser percorrida: " + distanciaKm + " km.");
        System.out.println("Previsão de conclusão: " + tempoMinutos + " minutos.");

        sc.close();
    }
}
