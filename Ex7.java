package dobackofront;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String nome = sc.nextLine();
        String livro = sc.nextLine();
        int paginas = sc.nextInt();
        double segundosPorPagina = sc.nextDouble();

        double horas = (paginas * segundosPorPagina) / 3600;

        System.out.printf(Locale.US, "%s, você finalizará a leitura do livro %s em aproximadamente %.2f horas.%n", nome, livro, horas);

        sc.close();
    }
}
