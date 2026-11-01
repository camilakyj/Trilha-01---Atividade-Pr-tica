package dobackofront;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu curso:");
        String curso = scanner.nextLine();

        System.out.println("Digite seu semestre:");
        int semestre = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu hobby favorito:");
        String hobby = scanner.nextLine();

        System.out.println();

        System.out.println("Prazer, eu sou o(a) " + nome + "!");
        System.out.println("Atualmente estou no " + semestre + "º semestre de " + curso + " e meu");
        System.out.println("hobby favorito é " + hobby + ".");

        scanner.close();
    }
}
