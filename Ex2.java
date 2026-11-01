package dobackofront;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas:");
        int pessoas = scanner.nextInt();


        double carne = pessoas * 0.300;
        double linguica = pessoas * 0.200;
        double frango = pessoas * 0.150;

        double custoCarne = carne * 50.00;
        double custoLinguica = linguica * 28.00;
        double custoFrango = frango * 22.00;

        double custoTotal = custoCarne + custoLinguica + custoFrango;

        double contribuicao = custoTotal / pessoas;

        System.out.println("\nQuantidades:");
        System.out.printf("Carne: %.1f kg - Linguiça: %.1f kg - Frango: %.1f kg%n",
                carne, linguica, frango);

        System.out.println("\nCusto total:");
        System.out.printf("Carne: R$ %.2f - Linguiça: R$ %.2f - Frango: R$ %.2f%n",
                custoCarne, custoLinguica, custoFrango);

        System.out.printf("Custo total do churrasco: R$ %.2f%n", custoTotal);
        System.out.printf("Cada pessoa deve contribuir com: R$ %.2f%n", contribuicao);

        scanner.close();
    }
}
